package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    public void increaseVolume() {
    Radio service = new Radio();

    service.setCurrentVolume (0);

    service.increaseVolume();

    int actual = service.getCurrentVolume();
    int expected = 1;

    assertEquals(expected, actual);
}

    @Test
    public void decreaseVolume() {
        Radio service = new Radio();

        service.setCurrentVolume(10);

        service.decreaseVolume();

        int actual = service.getCurrentVolume();
        int expected = 9;

        assertEquals(expected, actual);
    }


    @Test
    public void nextStation() {
        Radio service = new Radio();

        service.setCurrentStation (-2);

        service.nextStation();

        int actual = service.getCurrentStation();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void previousStation() {
        Radio service = new Radio();

        service.setCurrentStation (9);

        service.previousStation();

        int actual = service.getCurrentStation();
        int expected = 8;

        assertEquals(expected, actual);
    }


}