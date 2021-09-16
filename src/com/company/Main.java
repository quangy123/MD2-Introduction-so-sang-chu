package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Đọc số thành chữ");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào số cần chuyển : ");
        int number = scanner.nextInt();
        int unit = (number % 100) % 10;
        int dozen = (number % 100) / 10;
        int hundred = number / 100;

        System.out.println(readHundred(number, hundred, dozen, unit));
    }

    public static String readUnit(int number) {
        String result = "";
        switch (number) {
            case 1:
                result = "one";
                break;
            case 2:
                result = "two";
                break;
            case 3:
                result = "three";
                break;
            case 4:
                result = "four";
                break;
            case 5:
                result = "five";
                break;
            case 6:
                result = "six";
                break;
            case 7:
                result = "seven";
                break;
            case 8:
                result = "eight";
                break;
            case 9:
                result = "nine";
                break;
            case 10:
                result = "ten";
                break;
            case 11:
                result = "eleven";
                break;
            case 12:
                result = "twelve";
                break;
            case 13:
                result = "thirteen";
                break;
            case 14:
                result = "fourteen";
                break;
            case 15:
                result = "fifteen";
                break;
            case 16:
                result = "sixteen";
                break;
            case 17:
                result = "seventeen";
                break;
            case 18:
                result = "eighteen";
                break;
            case 19:
                result = "nineteen";
                break;
        }
        return result;
    }

    public static String readDozen(int number) {
        String result = "";
        switch (number) {
            case 2:
                result = "twenty";
                break;
            case 3:
                result = "thirty";
                break;
            case 4:
                result = "fourty";
                break;
            case 5:
                result = "fifty";
                break;
            case 6:
                result = "sixty";
                break;
            case 7:
                result = "seventy";
                break;
            case 8:
                result = "eighty";
                break;
            case 9:
                result = "ninety";
                break;
        }
        return result;
    }

    public static String readHundred(int number, int hundred, int dozen, int unit) {
        if (number <= 20 && number > 0) {
            return readUnit(number);
        } else if (number < 100) {
            return (readDozen(dozen) + readUnit(unit));
        } else if (number < 999 && dozen == 1) {
            return (readUnit(hundred) + " hundreds " + readUnit(number % 100));
        } else if (number <= 999) {
            return (readUnit(hundred) + " hundreds " + readDozen(dozen) + readUnit(unit));
        } else {
            return "Out of range";
        }
    }
}
