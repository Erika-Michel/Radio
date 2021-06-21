package ru.netology.domain;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @Test
    public void shouldChangeMaxStationAndSwitchNextStation() {
        Radio radio = new Radio(25, 105);

        radio.nextStation();

        int expected = 26;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeMaxStationAndSwitchNextStationReachMaxLimit() {
        Radio radio = new Radio(30, 30);

        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeMaxStationAndSwitchPrevStation() {
        Radio radio = new Radio(34, 42);

        radio.prevStation();

        int expected = 33;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeMaxStationAndSwitchPrevStationReachMinLimit() {
        Radio radio = new Radio(0, 55);

        radio.prevStation();

        int expected = 55;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeMaxStationAndSetCurrentStation(){
        Radio radio = new Radio(4, 18);

        radio.setCurrentStation(17);

        int expected = 17;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeMaxStationAndNotSetCurrentStationAboveMaxLimit(){
        Radio radio = new Radio(5, 14);

        radio.setCurrentStation(17);

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
        radio.setCurrentVolume(99);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseVolumeReachMaxLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.increaseVolume();

        int expected = 100;
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
    public void shouldNotSetCurrentVolumeAboveMaxLimit(){
        Radio radio = new Radio();
        radio.setCurrentVolume(2);

        radio.setCurrentVolume(102);

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

