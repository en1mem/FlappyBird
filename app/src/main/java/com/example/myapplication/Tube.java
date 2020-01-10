package com.example.myapplication;

import java.util.Random;

public class Tube {
    private int tubeX;
    private int topTubeOffsetY;
    private int tubeColor;

    private Random random;

    public Tube(int tubeX, int topTubeOffsetY) {
        this.tubeX = tubeX;
        this.topTubeOffsetY = topTubeOffsetY;
        random = new Random();
    }

    public void setTubeColor() {
        tubeColor = random.nextInt(2);
    }

    public int getTubeColor() {
        return tubeColor;
    }

    public int getTubeX() {
        return tubeX;
    }

    public int getTopTubeOffsetY() {
        return topTubeOffsetY;
    }

    public int getTopTubeY() {
        return topTubeOffsetY - AppConstants.getBitmapBank().getTubeHeight();
    }

    public int getBottomTubeY() {
        return topTubeOffsetY - AppConstants.gapBetweenTopAndBottomTubes;
    }

    public void setTopTubeOffsetY(int topTubeOffsetY) {
        this.topTubeOffsetY = topTubeOffsetY;
    }

    public void setTubeX(int tubeX) {
        this.tubeX = tubeX;
    }
}
