package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RadioTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/resources.csv")
    public void shouldSetNumberCurrentStation(int numberRadioStation, int expected) {
        Radio radioStation = new Radio();
        radioStation.setNumberCurrentStation(numberRadioStation);
        int actual = radioStation.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/resource2.csv")
    public void shouldSetNextNumberCurrentStation(int numberRadioStation, int expected) {
        Radio radioStation = new Radio();
        radioStation.setNumberCurrentStation(numberRadioStation);

        radioStation.next();

        Assertions.assertEquals(expected, radioStation.getNumberCurrentStation());
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/resource3.csv")
    public void shouldSetPrevNumberCurrentStation(int numberRadioStation, int expected) {
        Radio radioStation = new Radio();
        radioStation.setNumberCurrentStation(numberRadioStation);

        radioStation.prev();

        Assertions.assertEquals(expected, radioStation.getNumberCurrentStation());
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/resource4.csv")
    public void shouldSetIncreaseVolume(int volume, int expected) {
        Radio radioStation = new Radio();
        radioStation.currentVolume = volume;

        radioStation.increaseVolume();

        Assertions.assertEquals(expected, radioStation.currentVolume);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/resource5.csv")
    public void shouldSetDecreaseVolume(int volume, int expected) {
        Radio radioStation = new Radio();
        radioStation.currentVolume = volume;

        radioStation.decreaseVolume();

        Assertions.assertEquals(expected, radioStation.currentVolume);
    }
}