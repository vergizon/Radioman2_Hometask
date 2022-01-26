package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    public void increaseVolume() {
        Radio service = new Radio(10);

        service.setCurrentVolume(100);

        service.increaseVolume();

        int actual = service.getCurrentVolume();
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeOverHundred() {
        Radio service = new Radio(10);

        service.setCurrentVolume(105);

        service.increaseVolume();

        int actual = service.getCurrentVolume();
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeNegative() {
        Radio service = new Radio(10);

        service.setCurrentVolume(-1);

        service.increaseVolume();

        int actual = service.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeUnderHundred() {
        Radio service = new Radio();

        service.setCurrentVolume(8);

        service.increaseVolume();

        int actual = service.getCurrentVolume();
        int expected = 9;

        assertEquals(expected, actual);
    }


    @Test
    public void decreaseVolume() {
        Radio service = new Radio();

        service.setCurrentVolume(100);

        service.decreaseVolume();

        int actual = service.getCurrentVolume();
        int expected = 99;

        assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeNegative() {
        Radio service = new Radio();

        service.setCurrentVolume(-1);

        service.decreaseVolume();

        int actual = service.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeUnderTen() {
        Radio service = new Radio();

        service.setCurrentVolume(105);

        service.decreaseVolume();

        int actual = service.getCurrentVolume();
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    public void nextStation() {
        Radio service = new Radio(20);

        service.setCurrentStation(20);

        service.nextStation();

        int actual = service.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void nextStationNegative() {
        Radio service = new Radio();

        service.setCurrentStation(-2);

        service.nextStation();

        int actual = service.getCurrentStation();
        int expected = 1;

        assertEquals(expected, actual);
    }


    @Test
    public void previousStationNull() {
        Radio service = new Radio(20);

        service.setCurrentStation(0);

        service.previousStation();

        int actual = service.getCurrentStation();
        int expected = 19;

        assertEquals(expected, actual);
    }

    @Test
    public void previousStation() {
        Radio service = new Radio();

        service.setCurrentStation(8);

        service.previousStation();

        int actual = service.getCurrentStation();
        int expected = 7;

        assertEquals(expected, actual);
    }

    @Test
    public void previousStationUnderTen() {
        Radio service = new Radio();

        service.setCurrentStation(10);

        service.previousStation();

        int actual = service.getCurrentStation();
        int expected = 9;

        assertEquals(expected, actual);
    }


}