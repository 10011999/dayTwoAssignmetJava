package com.bridgelabz;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        WhileLoop whileLoop = new WhileLoop();
        whileLoop.nNaturalNoAdd();
        whileLoop.reversNoPrint();
    }

    public void nNaturalNoAdd() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        int i = 1;
        int sum = 0;
        while (i <= number){
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
    }
    public void reversNoPrint(){
        int num = 123,i = 0;
        while (num != 0){
            int rem = num % 10;
            i = i * 10 + rem;
            num = num / 10;
        }
        System.out.println(i);
    }
}