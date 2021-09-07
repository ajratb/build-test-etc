package ru.example;

import java.util.Scanner;

public class OurApplication {

    private static String staticString = "Static String";
    private String instanceString;

    public static void main(String[] args) {
        for (int i = 0; i < 1_000_000_000; i++) {
            OurApplication app = new OurApplication(i);
            System.out.println(app.instanceString);
        }

//        while (true) {
//            makeHardCalculation();
//
//        }
    }

    public OurApplication(int index) {
        this.instanceString = buildInstanceString(index);
    }

    public String buildInstanceString(int number) {
        return number + ". Instance String !";
    }

    private static Scanner scanner = new Scanner(System.in);

    private static void makeHardCalculation() {

        System.out.println("I am really trying my best to find the value");

//        String input = scanner.nextLine();
        int result = 2 + 3;

//        try {
//            Thread.sleep(3_000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        System.out.println("Result is ready!: " + result);
    }
}
