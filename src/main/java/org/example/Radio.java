package org.example;

public class Radio {
    public int radioStationNumber;
    public int currentVolume;

    public int getNextradioStationNumber() {
        return radioStationNumber;
    }

    public int getPrewradioStationNumber() {
        return radioStationNumber;
    }

    public void setPrewradioStationNumber(int newradioStationNumber) {
        if (newradioStationNumber < 0) {
            return;
        }
        if (newradioStationNumber > 9) {
            return;
        }
        radioStationNumber = newradioStationNumber;
        if (radioStationNumber == 0) {
            radioStationNumber = 9;
        } else {
            radioStationNumber = radioStationNumber - 1;
        }
    }
    public void setnextRadioStationNumber(int newradioStationNumber) {
        if (newradioStationNumber < 0) {
            return;
        }
        if (newradioStationNumber > 9) {
            return;
        }
        radioStationNumber = newradioStationNumber;
        if (radioStationNumber == 9) {
            radioStationNumber = 0;
        } else {
            radioStationNumber = radioStationNumber + 1;
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
