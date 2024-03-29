package com.example.myapplication;

public class BackgroundImage {

    private int backgroundImageX;
    private int backgroundImageY;
    private int backgroundImageVelocity;


    public BackgroundImage() {
        backgroundImageX = 0;
        backgroundImageY = 0;
        backgroundImageVelocity = 3;
    }

    public int getX() {
        return backgroundImageX;
    }

    public void setX(int backgroundImageX) {
        this.backgroundImageX = backgroundImageX;
    }

    public int getY() {
        return backgroundImageY;
    }

    public void setY(int backgroundImageY) {
        this.backgroundImageY = backgroundImageY;
    }

    public int getVelocity() {
        return backgroundImageVelocity;
    }

    public void setVelocity(int backgroundImageVelocity) {
        this.backgroundImageVelocity = backgroundImageVelocity;
    }
}
