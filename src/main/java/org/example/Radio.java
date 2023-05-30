package org.example;

public class Radio {
    public int radioStationNumber;
    public int currentVolume;

    public int getRadioStationNumber() {
        return radioStationNumber;
    }

    public void setRadioStationNumber(int newradioStationNumber) {
        radioStationNumber = newradioStationNumber;
        if (radioStationNumber <= 0) {
            radioStationNumber = 9;
        } else {
            if (radioStationNumber >= 9) {
                radioStationNumber = 0;
            } else {
                radioStationNumber = radioStationNumber + 1;
            }
        }
    }

    public int getCurrentVolume() {
        return currentVolume;

    }

    public void setCurrentVolume(int newcurrentVolume) {
        currentVolume = newcurrentVolume;
        if (currentVolume < 100) {
            if (currentVolume <= 0) {
                currentVolume = 0;
            } else {
                currentVolume = currentVolume + 1;
            }
        } else {
            currentVolume = 100;
        }
    }
}
