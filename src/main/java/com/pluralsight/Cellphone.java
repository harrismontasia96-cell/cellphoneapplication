package com.pluralsight;

import java.util.Scanner;

public class Cellphone {
    private static Object phoneone;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cellphone userPhoneOne = new Cellphone();
        Cellphone userPhoneTwo = new Cellphone();

        userPhoneTwo.setSerialNumber(888);
        userPhoneTwo.setPhoneNumber("711");
        userPhoneTwo.setOwner("Help Line");
        userPhoneTwo.setCarrier("T-Mobile");
        userPhoneTwo.setModel("Landline");

        System.out.print("what is the serialnumber");
        int serialNumber = sc.nextInt();
        Scan.nextline();
        user.set(serialNumber);


        System.out.print("what is the model");
        String model = sc.next();
        user.set(model);


        System.out.print("what is the carrier");
        String carrier = sc.next();
        user.set(carrier);

        System.out.print("what is the phonenumber");
        String phoneNumber = sc.next();
        user.set(phoneNumber);


        System.out.print("what is the owner");
        String owner = sc.next();
        user.set(owner);

        userPhoneOne.dial("(999) 555-1202");
    }
    public static void display("CellPhone") {
        System.out.println("serialNumber:" + phone.getserialnumber());
                System.out.println("Model:" + phone.getmodel());
                System.out.println("carrier:" + phone.getcarrier());
                System.out.println("phoneNumber:" + phone.getphonenumber());
                System.out.println("owner:" + phone.getowner() );



    }
}
