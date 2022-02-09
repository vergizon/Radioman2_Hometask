package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;


@AllArgsConstructor
@Data
public class Radio {

    private int currentVolume;
    private int currentStation;
    public int stations;

    public Radio(int stations) {
        this.stations = stations;
    }

    public Radio() {
        stations = 10;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        this.currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 0) {
            setCurrentVolume(0);
            return;
        }


        if (currentVolume > 100) {
            setCurrentVolume(100);
        }

        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;

        }
        setCurrentVolume(currentVolume);
    }

    public void decreaseVolume() {
        if (currentVolume < 0) {
            setCurrentVolume(0);

        }
        if (currentVolume > 100) {
            setCurrentVolume(100);
            return;
        }

        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
            setCurrentVolume(currentVolume);
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            this.currentStation = 0;
            return;
        }
        if (newCurrentStation > stations - 1) {
            this.currentStation = stations - 1;
            return;
        }
        this.currentStation = newCurrentStation;
    }


    public void nextStation() {

        if (currentStation == stations - 1) {
            setCurrentStation(0);
            return;
        }

        currentStation = currentStation + 1;
        setCurrentStation(currentStation);


    }

    public void previousStation() {
        if (currentStation == 0) {
            setCurrentStation(stations - 1);
            return;

        }

        currentStation = currentStation - 1;
        setCurrentStation(currentStation);
    }


}












