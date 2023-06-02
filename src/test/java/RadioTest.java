package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    // тесты на громкость звука
    @Test
    public void volumeIncrease() {
        Radio rad = new Radio();
        rad.setCurrentVolume(50);
        rad.increasevolume();
        int expected = 51;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeIncreasemax() {
        Radio rad = new Radio();
        rad.setCurrentVolume(100);
        rad.increasevolume();
        int expected = 100;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeIncreasemoremax() {
        Radio rad = new Radio();
        rad.setCurrentVolume(101);
        rad.increasevolume();
        int expected = 100;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeIncreasemorenull() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);
        rad.increasevolume();
        int expected = 1;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeIncreasemormin() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-10);
        rad.increasevolume();
        int expected = 1;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    // Тесты переключния станции
    @Test
    public void NextChoosingRadiostation() {
        Radio number = new Radio();
        number.setNextradioStationNumber(1);
        number.nextradio();
        int expected = 2;
        int actual = number.getNextradioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NextChoosingRadiostationmaxmax() {
        Radio number = new Radio();
        number.setNextradioStationNumber(9);
        number.nextradio();
        int expected = 0;
        int actual = number.getNextradioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NextChoosingRadiostationmax() {
        Radio number = new Radio();
        number.setNextradioStationNumber(8);
        number.nextradio();
        int expected = 9;
        int actual = number.getNextradioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NextChoosingRadiostatioLessnmin() {
        Radio number = new Radio();
        number.setNextradioStationNumber(-5);
        number.nextradio();
        int expected = 1;
        int actual = number.getNextradioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NextChoosingRadiostatioMorenmin() {
        Radio number = new Radio();
        number.setNextradioStationNumber(10);
        number.nextradio();
        int expected = 1;
        int actual = number.getNextradioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    // prew на 1
    @Test
    public void ChoosingRadiostationprew() {
        Radio number = new Radio();
        number.setNextradioStationNumber(1);
        number.prewradio();
        int expected = 0;
        int actual = number.getNextradioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    // prew на 1 от 9
    @Test
    public void ChoosingRadiostationprewmax() {
        Radio number = new Radio();
        number.setNextradioStationNumber(9);
        number.prewradio();
        int expected = 8;
        int actual = number.getNextradioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    // prew больше 9
    @Test
    public void ChoosingRadiostationprewMoremax() {
        Radio number = new Radio();
        number.setNextradioStationNumber(15);
        number.prewradio();
        int expected = 9;
        int actual = number.getNextradioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    // prew с 0 на 9
    @Test
    public void ChoosingRadiostationprewemim() {
        Radio number = new Radio();
        number.setNextradioStationNumber(0);
        number.prewradio();
        int expected = 9;
        int actual = number.getNextradioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    // prew отрицательные значения
    @Test
    public void ChoosingRadiostationprewNegative() {
        Radio number = new Radio();
        number.setNextradioStationNumber(-5);
        number.prewradio();
        int expected = 9;
        int actual = number.getNextradioStationNumber();
        Assertions.assertEquals(expected, actual);
    }
}
