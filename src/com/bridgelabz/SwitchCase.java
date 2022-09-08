package com.bridgelabz;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        SwitchCase switchCase = new SwitchCase();
        switchCase.vowelsOrCon();
        switchCase.month();
    }

    public void vowelsOrCon() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a alphabet");
        char input = sc.next().charAt(0);
        switch (input) {
            case 'A':
            case 'a':
            case 'e':
            case 'E':
            case 'I':
            case 'i':
            case 'O':
            case 'o':
            case 'u':
            case 'U':
                System.out.println("Vowels");
                break;
            default:
                System.out.println("Constant");
                break;
        }
    }

    public void month() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 1 to 12");
        int input = sc.nextInt();
        switch (input) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("Jun");
                break;
            case 7:
                System.out.println("Julay");
                break;
            case 8:
                System.out.println("Auguest");
                break;
            case 9:
                System.out.println("Suptember");
                break;
            case 10:
                System.out.println("Octomber");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Not any month");
        }
    }
}