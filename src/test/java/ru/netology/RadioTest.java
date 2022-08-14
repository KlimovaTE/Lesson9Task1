package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RadioTest {
    Radio radioStation = new Radio();

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/resources.csv")
    public void shouldSetNumberCurrentStationWithNegativeCustomQuantityStations(int numberRadioStation, int expected) {
        Radio radioStation = new Radio(-5);
        radioStation.setNumberCurrentStation(numberRadioStation);
        int actual = radioStation.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/resource6.csv")
    public void shouldSetNumberCurrentStationWithCustomQuantityStations(int numberRadioStation, int expected) {
        Radio radioStation = new Radio(50);
        radioStation.setNumberCurrentStation(numberRadioStation);
        int actual = radioStation.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/resources.csv")
    public void shouldSetNumberCurrentStationWithDefaultQuantityStations(int numberRadioStation, int expected) {
        radioStation.setNumberCurrentStation(numberRadioStation);
        int actual = radioStation.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/resource2.csv")
    public void shouldSetNextNumberCurrentStationDefaultQuantityStations(int numberRadioStation, int expected) {
        radioStation.setNumberCurrentStation(numberRadioStation);

        radioStation.next();

        Assertions.assertEquals(expected, radioStation.getNumberCurrentStation());
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/resource7.csv")
    public void shouldSetNextNumberCurrentStationWithCustomQuantityStations(int numberRadioStation, int expected) {
        Radio radioStation = new Radio(50);
        radioStation.setNumberCurrentStation(numberRadioStation);

        radioStation.next();

        Assertions.assertEquals(expected, radioStation.getNumberCurrentStation());
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/resource3.csv")
    public void shouldSetPrevNumberCurrentStationDefaultQuantityStations(int numberRadioStation, int expected) {
        radioStation.setNumberCurrentStation(numberRadioStation);

        radioStation.prev();

        Assertions.assertEquals(expected, radioStation.getNumberCurrentStation());
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/resource8.csv")
    public void shouldSetPrevNumberCurrentStationWithCustomQuantityStations(int numberRadioStation, int expected) {
        Radio radioStation = new Radio(50);
        radioStation.setNumberCurrentStation(numberRadioStation);

        radioStation.prev();

        Assertions.assertEquals(expected, radioStation.getNumberCurrentStation());
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/resource4.csv")
    public void shouldSetIncreaseVolume(int volume, int expected) {
        radioStation.currentVolume = volume;

        radioStation.increaseVolume();

        Assertions.assertEquals(expected, radioStation.currentVolume);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/resource5.csv")
    public void shouldSetDecreaseVolume(int volume, int expected) {
        radioStation.currentVolume = volume;

        radioStation.decreaseVolume();

        Assertions.assertEquals(expected, radioStation.currentVolume);
    }
}