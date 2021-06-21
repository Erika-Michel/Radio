package ru.netology.domain;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

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

    public void setCurrentStation(int currentStation) {
        if (currentStation > stationsQuantity - 1) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;
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

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
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