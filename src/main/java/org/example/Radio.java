package org.example;

public class Radio {
    private int radioStationNumber;
    private int currentVolume;

    public int getNextradioStationNumber() {

        return radioStationNumber;
    }

    // установка номера радиостанции
    public void setNextradioStationNumber(int newNextradioStationNumber) {
        if (newNextradioStationNumber < 0) {
            return;
        }
        if (newNextradioStationNumber > 9) {
            return;
        }
        radioStationNumber = newNextradioStationNumber;
    }

    public int getCurrentVolume() {

        return currentVolume;
    }

    // установка громкости звука
    public void setCurrentVolume(int newcurrentVolume) {

        // if (newcurrentVolume > 100) {
        //    return;
        //}
        if (newcurrentVolume < 0) {
            return;
        }
        currentVolume = newcurrentVolume;
    }

    public void prewradio() {
        int nomerradio;
        //radioStationNumber = new radioStationNumber;
        if (radioStationNumber == 0) {
            nomerradio = 9;
            // setNextradioStationNumber(nomerradio);
        } else {
            nomerradio = radioStationNumber - 1;
            //  setNextradioStationNumber(nomerradio);
        }
        setNextradioStationNumber(nomerradio);
    }

    public void nextradio() {
        int nomerradio;
        // radioStationNumber = newradioStationNumber;
        if (radioStationNumber == 9) {
            nomerradio = 0;
            radioStationNumber = nomerradio;
        } else {
            nomerradio = radioStationNumber + 1;
            radioStationNumber = nomerradio;
        }
    }

    public void increasevolume() {
        int volume;
        if (currentVolume < 100) {
            volume = currentVolume + 1;
            currentVolume = volume;
        } else {
            volume = 100;
            currentVolume = volume;
        }
    }
}
