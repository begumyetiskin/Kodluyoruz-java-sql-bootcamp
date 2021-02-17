package com.company.soru2;

public class Television {
    private double width, height, screenSize, maxVolume = 25, volume;
    private boolean power = false;



    public Television() {
        this.width = 65;
        this.height = 120;
        this.screenSize = 140;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public double getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(double maxVolume) {
        this.maxVolume = maxVolume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public boolean getPower() {
        return power;
    }

    public void setPower(boolean power) {
        this.power = power;
    }

    void acmaKapama() {
        if (power) {
            power = false;
            System.out.println("Televizyon kapatıldı.");
        } else {
            power = true;
            System.out.println("Televizyon açıldı.");
        }
    }

    void sesAzaltma() {
        if (volume > 0) {
            volume--;
            System.out.println("Ses azaltıldı.");
        }
    }
    void sesArtırma(){
        if (volume < maxVolume){
            volume++;
            System.out.println("Ses artırıldı.");
        }
    }
}
