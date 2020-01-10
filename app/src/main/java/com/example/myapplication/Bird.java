package com.example.myapplication;

public class Bird {

    private int birdX;
    private int birdY;
    private int currentFrame;
    private int velocity;

    public static int maxFrame;


    public Bird() {
        birdX = AppConstants.SCREEN_WIDTH / 2 - AppConstants.getBitmapBank().getBirdWidth()/2;
        birdY = AppConstants.SCREEN_HEIGHT / 2 - AppConstants.getBitmapBank().getBirdHeight() / 2;
        velocity = 0;
        currentFrame = 0;
        maxFrame = 3;
    }

    public int getBirdX() {
        return birdX;
    }

    public void setBirdX(int birdX) {
        this.birdX = birdX;
    }

    public int getBirdY() {
        return birdY;
    }

    public void setBirdY(int birdY) {
        this.birdY = birdY;
    }

    public int getCurrentFrame() {
        return currentFrame;
    }

    public void setCurrentFrame(int currentFrame) {
        this.currentFrame = currentFrame;
    }

    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }
}
