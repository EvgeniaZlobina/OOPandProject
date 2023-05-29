package org.example;

public class Radio {
    public int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;

    }public void setCurrentVolume(int newcurrentVolume) {
        currentVolume = newcurrentVolume;
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
       } else {
            currentVolume = 100;
        }
    }
}
