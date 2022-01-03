package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    public void increaseVolume() {
        Radio service = new Radio();

        service.setCurrentVolume(11);

        service.increaseVolume();

        int actual = service.getCurrentVolume();
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeNegative() {
        Radio service = new Radio();

        service.setCurrentVolume(-1);

        service.increaseVolume();

        int actual = service.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeUnderTen() {
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

        service.setCurrentVolume(11);

        service.decreaseVolume();

        int actual = service.getCurrentVolume();
        int expected = 10;

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

        service.setCurrentVolume(2);

        service.decreaseVolume();

        int actual = service.getCurrentVolume();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void nextStation() {
        Radio service = new Radio();

        service.setCurrentStation(9);

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
        Radio service = new Radio();

        service.setCurrentStation(0);

        service.previousStation();

        int actual = service.getCurrentStation();
        int expected = 9;

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


}