package ru.netology.domain;

public class Radio {
    private int stationsQuantity = 10;
    private int currentStation;
    private int minStation = 0;
    private int maxStation = stationsQuantity - 1;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio(int currentStation, int stationsQuantity) {
        this.currentStation = currentStation;
        this.stationsQuantity = stationsQuantity;
    }

    public Radio() {
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > stationsQuantity - 1) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getMinStation() {

        return minStation;
    }

    public void setMinStation(int minStation) {

        this.minStation = minStation;
    }

    public int getMaxStation() {

        return maxStation;
    }

    public void setMaxStation(int maxStation) {

        this.maxStation = maxStation;
    }

    public void nextStation() {
        if (currentStation == stationsQuantity - 1) {
            currentStation = minStation;
        } else currentStation = currentStation + 1;
    }

    public void prevStation() {
        if (currentStation == minStation) {
            currentStation = stationsQuantity - 1;
        } else currentStation = currentStation - 1;
    }

    public int getCurrentVolume() {

        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getMinVolume() {

        return minVolume;
    }

    public void setMinVolume(int minVolume) {

        this.minVolume = minVolume;
    }

    public int getMaxVolume() {

        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {

        this.maxVolume = maxVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }
}