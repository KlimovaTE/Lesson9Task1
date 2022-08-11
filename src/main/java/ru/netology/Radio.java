package ru.netology;

public class Radio {
    int numberCurrentStation;
    int currentVolume;

    public int getNumberCurrentStation() {

        return numberCurrentStation;
    }

    public void setNumberCurrentStation(int newNumberCurrentStation) {
        if (newNumberCurrentStation < 0) {
            return;
        }
        if (newNumberCurrentStation > 9) {
            return;
        }
        numberCurrentStation = newNumberCurrentStation;
    }

    public void next() {
        if (numberCurrentStation == 9) {
            setNumberCurrentStation(0);
        } else {
            setNumberCurrentStation(numberCurrentStation + 1);
        }
    }

    public void prev() {
        if (numberCurrentStation == 0) {
            setNumberCurrentStation(9);
        } else {
            setNumberCurrentStation(numberCurrentStation - 1);
        }
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        } else {
            return;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {
            return;
        }
    }

}
