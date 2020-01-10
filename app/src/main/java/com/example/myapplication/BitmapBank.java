package com.example.myapplication;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class BitmapBank {

    Bitmap background;

    Bitmap[] bird;

    Bitmap tubeTop;
    Bitmap tubeBottom;
    Bitmap redTubeTop;
    Bitmap redTubeBottom;

    public BitmapBank (Resources resources) {
        background = BitmapFactory.decodeResource(resources, R.drawable.background);
        background = scaleImage(background);

        bird = new Bitmap[4];
        bird [0] = BitmapFactory.decodeResource(resources, R.drawable.bird_frame1);
        bird [1] = BitmapFactory.decodeResource(resources, R.drawable.bird_frame2);
        bird [2] = BitmapFactory.decodeResource(resources, R.drawable.bird_frame3);
        bird [3] = BitmapFactory.decodeResource(resources, R.drawable.bird_frame4);

        tubeTop = BitmapFactory.decodeResource(resources, R.drawable.tube_top);
        tubeBottom = BitmapFactory.decodeResource(resources, R.drawable.tube_bottom);

        redTubeTop = BitmapFactory.decodeResource(resources, R.drawable.red_tube_top);
        redTubeBottom = BitmapFactory.decodeResource(resources, R.drawable.red_tube_bottom);
    }

    public Bitmap getTubeTop() {
        return tubeTop;
    }

    public Bitmap getTubeBottom() {
        return tubeBottom;
    }

    public Bitmap getRedTubeTop() {
        return redTubeTop;
    }

    public Bitmap getRedTubeBottom() {
        return redTubeBottom;
    }

    public int getTubeWidth() {
        return tubeTop.getWidth();
    }

    public int getTubeHeight() {
        return tubeTop.getHeight();
    }

    public Bitmap getBird(int frame) {
        return bird[frame];
    }

    public int getBirdWidth() {
        return bird[0].getWidth();
    }

    public int getBirdHeight() {
        return bird[0].getHeight();
    }


    public  Bitmap getBackground() {
        return background;
    }

    public int getBackgroundWidth() {
        return background.getWidth();
    }

    public int getBackgroundHeight() {
        return background.getHeight();
    }

    public Bitmap scaleImage(Bitmap bitmap) {
        float widthHeightRatio = getBackgroundWidth() / getBackgroundHeight();

        int backgroundScaleWidth = (int) widthHeightRatio * AppConstants.SCREEN_HEIGHT;
        return Bitmap.createScaledBitmap(bitmap, backgroundScaleWidth, AppConstants.SCREEN_HEIGHT, false);
    }
}
