package org.example;

public class Radio {
    private int radioStationNumber;
    private int currentVolume;

    public int quantity = 9;

    //if (radioStationNunber = quantity)
    public Radio() {
      this.quantity = quantity;
    }

    public Radio (int quantity) {
        this.quantity = quantity-1;
    }

    public int getNextradioStationNumber() {

        return radioStationNumber;
    }

    public void setNextradioStationNumber(int newNextradioStationNumber) {
        if (newNextradioStationNumber < 0) {
            return;
        }
        if (newNextradioStationNumber > quantity) {
            newNextradioStationNumber = quantity;
        }
        radioStationNumber = newNextradioStationNumber;
    }

    public int getCurrentVolume() {

        return currentVolume;
    }

    // установка громкости звука
    public void setCurrentVolume(int newcurrentVolume) {

        if (newcurrentVolume < 0) {
            return;
        }
        currentVolume = newcurrentVolume;
    }

    // установка номера радиостанции
    public void prewradio() {
        int nomerradio;

        if (radioStationNumber == 0) {
            nomerradio = quantity;

        } else {
            nomerradio = radioStationNumber - 1;

        }
        setNextradioStationNumber(nomerradio);
    }

    public void nextradio() {
        int nomerradio;

        if (radioStationNumber == quantity) {
            nomerradio = 0;
            radioStationNumber = nomerradio;
        } else {
            nomerradio = radioStationNumber + 1;
            radioStationNumber = nomerradio;
        }
    }

    // увеличение громкости звука
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
