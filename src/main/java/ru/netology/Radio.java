package ru.netology;

public class Radio {
    int numberCurrentStation;
    int currentVolume;
    int quantityStations = 10;

    public Radio() {

    }

    public Radio(int customNewQuantityStations) {
        setQuantityStations(customNewQuantityStations);
    }


    public void setQuantityStations(int NewQuantityStations) {
        if (NewQuantityStations > 0) {
            this.quantityStations = NewQuantityStations;
        } else {
            return;
        }
    }

    public int getNumberCurrentStation() {
        return numberCurrentStation;
    }

    public void setNumberCurrentStation(int newNumberCurrentStation) {
        if (newNumberCurrentStation < 0) {
            return;
        }
        if (newNumberCurrentStation >= quantityStations) {
            return;
        }
        numberCurrentStation = newNumberCurrentStation;
    }

    public void next() {
        if (numberCurrentStation == quantityStations - 1) {
            setNumberCurrentStation(0);
        } else {
            setNumberCurrentStation(numberCurrentStation + 1);
        }
    }

    public void prev() {
        if (numberCurrentStation == 0) {
            setNumberCurrentStation(quantityStations - 1);
        } else {
            setNumberCurrentStation(numberCurrentStation - 1);
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
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
