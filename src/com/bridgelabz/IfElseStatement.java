package com.bridgelabz;

import java.util.Scanner;

public class IfElseStatement {
    public static void main(String[] args) {
        IfElseStatement ifElseStatement = new IfElseStatement();
        ifElseStatement.singleDigtInWord();
        ifElseStatement.digitPrint();
    }

    public void singleDigtInWord() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any single digit number");
        int number = sc.nextInt();
        if (number == 1){
            System.out.println("One");
        } else if (number == 2) {
            System.out.println("Two");
        } else if (number == 3) {
            System.out.println("Three");
        } else if (number == 4) {
            System.out.println("Four");
        } else if (number == 5) {
            System.out.println("Five");
        } else if (number == 6) {
            System.out.println("Six");
        } else if (number == 7) {
            System.out.println("Seven");
        } else if (number == 8) {
            System.out.println("Eight");
        } else if (number == 9) {
            System.out.println("Nine");
        } else if (number == 0) {
            System.out.println("Zero");
        }else {
            System.out.println("Not a single digit number");
        }
    }
    public void digitPrint(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a unit number");
        int number = sc.nextInt();
        if(number == 1){
            System.out.println("one");
        } else if (number == 10) {
            System.out.println("Ten");
        } else if (number == 100) {
            System.out.println("Hundred");
        } else if (number == 1000) {
            System.out.println("Thousand");
        }else {
            System.out.println("Not a unit digit number");
        }
    }
}
