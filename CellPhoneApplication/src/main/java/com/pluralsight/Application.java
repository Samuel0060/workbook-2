package com.pluralsight;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        //call the class
        CellPhone cellPhone = new CellPhone();

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the serial number?");
        cellPhone.setSerialNumber(scanner.nextLine());

        System.out.println("What model is the phone?");
        cellPhone.setModel(scanner.nextLine());

        System.out.println("Who is the carrier?");
        cellPhone.setCarrier(scanner.nextLine());

        System.out.println("What is the phone number?");
        cellPhone.setPhoneNumber(scanner.nextLine());

        System.out.println("Who is the owner of the phone?");
        cellPhone.setOwner(scanner.nextLine());

        String phoneDetails = phoneInfoBuilder(
                cellPhone.getSerialNumber(),
                cellPhone.getModel(),
                cellPhone.getCarrier(),
                cellPhone.getPhoneNumber(),
                cellPhone.getOwner()
        );

        System.out.println(phoneDetails);

    }

        public static String phoneInfoBuilder(String serial, String model, String carrier, String phoneNumber, String owner) {


            StringBuilder phoneInfo = new StringBuilder();

            phoneInfo.append("Phone Information:\n");
            phoneInfo.append("Serial Number: ").append(serial).append("\n")
                    .append("Phone Model: ").append(model).append("\n").append("Carrier: ")
                    .append(carrier).append("\n").append("Phone Number: ").append(phoneNumber)
                    .append("\n").append("Owner: ").append(owner);

            return phoneInfo.toString();

        }
}
