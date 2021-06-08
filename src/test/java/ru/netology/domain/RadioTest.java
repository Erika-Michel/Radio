package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @Test
    public void shouldSwitchNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(3);

        radio.nextStation();

        int expected = 4;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchNextStationReachMaxLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(6);

        radio.prevStation();

        int expected = 5;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchPrevStationReachMinLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.prevStation();

        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeMinMaxStationsAndReachMaxLimit() {
        Radio radio = new Radio();
        radio.setMaxStation(20);
        radio.setMinStation(5);
        radio.setCurrentStation(20);

        radio.nextStation();

        int expected = 5;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeMinMaxStationsAndReachMinLimit() {
        Radio radio = new Radio();
        radio.setMaxStation(24);
        radio.setMinStation(3);
        radio.setCurrentStation(3);

        radio.prevStation();

        int expected = 24;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetCurrentStationAboveMaxLimit(){
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        radio.setCurrentStation(12);

        int expected = 5;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetCurrentStationBelowMinLimit(){
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        radio.setCurrentStation(-3);

        int expected = 5;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(6);

        radio.increaseVolume();

        int expected = 7;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        radio.decreaseVolume();

        int expected = 9;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseVolumeReachMaxLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseVolumeReachMinLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseVolumeReachNewMaxLimit() {
        Radio radio = new Radio();
        radio.setMaxVolume(78);
        radio.setCurrentVolume(78);

        radio.increaseVolume();

        int expected = 78;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseVolumeReachNewMinLimit() {
        Radio radio = new Radio();
        radio.setMinVolume(-5);
        radio.setCurrentVolume(-5);

        radio.decreaseVolume();

        int expected = -5;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetCurrentVolumeAboveMaxLimit(){
        Radio radio = new Radio();
        radio.setCurrentVolume(2);

        radio.setCurrentVolume(45);

        int expected = 2;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetCurrentVolumeBelowMinLimit(){
        Radio radio = new Radio();
        radio.setCurrentVolume(5);

        radio.setCurrentVolume(-3);

        int expected = 5;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
}

