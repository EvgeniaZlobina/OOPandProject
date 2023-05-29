package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void volumeIncrease (){
        Radio rad = new Radio();
        rad.setCurrentVolume(5);
        int expected = 6;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void volumeIncreasemax (){
        Radio rad = new Radio();
        rad.setCurrentVolume(100);
        int expected = 100;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void volumeIncreasemoremax (){
        Radio rad = new Radio();
        rad.setCurrentVolume(101);
        int expected = 100;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void volumeIncreasemorenull (){
        Radio rad = new Radio();
        rad.setCurrentVolume(0);
        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void volumeIncreasemormin (){
        Radio rad = new Radio();
        rad.setCurrentVolume(-10);
        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}
