package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    // тесты на громкость звука
    @Test
    public void volumeIncrease() {
        Radio rad = new Radio();
        rad.setCurrentVolume(5);
        int expected = 6;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeIncreasemax() {
        Radio rad = new Radio();
        rad.setCurrentVolume(100);
        int expected = 100;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeIncreasemoremax() {
        Radio rad = new Radio();
        rad.setCurrentVolume(101);
        int expected = 100;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeIncreasemorenull() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);
        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeIncreasemormin() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-10);
        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    // Тесты переключния станции
    @Test
    public void NextChoosingRadiostation() {
        Radio number = new Radio();
        number.setnextRadioStationNumber(1);
        int expected = 2;
        int actual = number.getNextradioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NextChoosingRadiostationmaxmax() {
        Radio number = new Radio();
        number.setnextRadioStationNumber(9);
        int expected = 0;
        int actual = number.getNextradioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NextChoosingRadiostationmax() {
        Radio number = new Radio();
        number.setnextRadioStationNumber(8);
        int expected = 9;
        int actual = number.getNextradioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NextChoosingRadiostatioLessnmin() {
        Radio number = new Radio();
        number.setnextRadioStationNumber(-5);
        int expected = 0;
        int actual = number.getNextradioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NextChoosingRadiostatioMorenmin() {
        Radio number = new Radio();
        number.setnextRadioStationNumber(10);
        int expected = 0;
        int actual = number.getNextradioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ChoosingRadiostationprew() {
        Radio number = new Radio();
        number.setPrewradioStationNumber(1);
        int expected = 0;
        int actual = number.getPrewradioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ChoosingRadiostationprewmax() {
        Radio number = new Radio();
        number.setPrewradioStationNumber(9);
        int expected = 8;
        int actual = number.getPrewradioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ChoosingRadiostationprewMoremax() {
        Radio number = new Radio();
        number.setPrewradioStationNumber(10);
        int expected = 0;
        int actual = number.getPrewradioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ChoosingRadiostationprewemim() {
        Radio number = new Radio();
        number.setPrewradioStationNumber(0);
        int expected = 9;
        int actual = number.getPrewradioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ChoosingRadiostationprewNegative() {
        Radio number = new Radio();
        number.setPrewradioStationNumber(-5);
        int expected = 0;
        int actual = number.getPrewradioStationNumber();
        Assertions.assertEquals(expected, actual);
    }
}
