package com.example.myapplication;

import android.graphics.Canvas;
import android.os.SystemClock;
import android.util.Log;
import android.view.SurfaceHolder;

public class GameThread extends Thread {

    SurfaceHolder holder;

    boolean isRunning;


    // time in milliseconds
    long startTime;
    long loopTime;

    long DELAY = 33;

    public GameThread (SurfaceHolder holder) {
        this.holder = holder;
        isRunning = true;
    }

    @Override
    public void run() {
        while (isRunning) {
            startTime = SystemClock.uptimeMillis();

            Canvas canvas = holder.lockCanvas(null);
            if (canvas != null) {
                synchronized (holder) {
                    AppConstants.getGameEngine().updateAndDrawBackgroundImage(canvas);
                    AppConstants.getGameEngine().updateAndDrawBird(canvas);
                    AppConstants.getGameEngine().updateAndDrawTubes(canvas);
                    holder.unlockCanvasAndPost(canvas);
                }
            }

            loopTime = SystemClock.uptimeMillis() - startTime;

            if (loopTime < DELAY) {
                try {
                    Thread.sleep(DELAY - loopTime);
                } catch (InterruptedException ex) {
                    Log.e("Interrupted", "Interrupted while sleeping");
                    ex.printStackTrace();
                }
            }
        }
    }

    public boolean isRunning() {
        return isRunning;
    }

    public void setIsRunning(boolean state) {
        isRunning = state;
    }
}
