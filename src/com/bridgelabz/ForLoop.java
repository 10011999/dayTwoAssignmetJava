package com.bridgelabz;

public class ForLoop {
    public static void main(String[] args) {
        ForLoop forLoop = new ForLoop();
        forLoop.sumOfNatNumber();
        forLoop.reversNo();
        forLoop.palindromeNumber();
    }

    public void sumOfNatNumber() {
        int num = 5, sum = 0, i;
        for (i = 1; i <= num; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }

    public void reversNo() {
        int num = 123, i = 0;
        for (; num != 0; ) {
            int rem = num % 10;
            i = i * 10 + rem;
            num = num / 10;
        }
        System.out.println(i);
    }
    public void palindromeNumber() {
        int num = 121, i = 0,temp;
        temp = num;
        for (; num != 0; ) {
            int rem = num % 10;
            i = i * 10 + rem;
            num = num / 10;
        }
        if (temp == i) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not Palindrome Number");
        }
    }
}