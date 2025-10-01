package com.pluralsight;

public class CellPhoneApplication {
    private int serialNumber;
    private String model, carrier, phoneNumber, owner;


    public CellPhoneApplication() {
        this.serialNumber = 0;
        this.model = "iphone" ;
        this.carrier = "boost" ;
        this.phoneNumber = "412808745" ;
        this.owner = "Tasia" ;
    }


    public static void main(String[] args) {

    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
    }

    public String getModel() {
        return model;
    }

    public void setModel() {
        this.model = model;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier() {
        this.carrier = carrier;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String  phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String  owner) {
        this.owner = owner;





    }
}



