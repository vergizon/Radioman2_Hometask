package ru.netology;

public class Radio {

    private int currentVolume;

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


        if (currentVolume > 10) {
            setCurrentVolume (10);
        }

        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;

        }
        setCurrentVolume(currentVolume);
    }

    public void decreaseVolume() {
        if (currentVolume < 0) {
            setCurrentVolume(0);

        }
        if (currentVolume > 10) {
            setCurrentVolume(10);
            return;
        }

        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
            setCurrentVolume(currentVolume);
        }
    }

    private int currentStation;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        this.currentStation = newCurrentStation;
    }


    public void nextStation() {

        if (currentStation == 9) {
            setCurrentStation(0);
            return;
        }

        currentStation = currentStation + 1;
        setCurrentStation(currentStation);


    }

    public void previousStation() {
        if (currentStation == 0) {
            setCurrentStation(9);
            return;

        }

        currentStation = currentStation - 1;
        setCurrentStation(currentStation);
    }


}








