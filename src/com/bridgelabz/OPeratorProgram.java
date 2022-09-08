package com.bridgelabz;

import java.util.Scanner;

public class OPeratorProgram {
    public static void main(String[] args) {
        OPeratorProgram oPeratorProgram = new OPeratorProgram();
        oPeratorProgram.arithmatic();
    }
    public void arithmatic() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a three number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = a+b*c;
        int e = c+a/b;
        int f = a%b+c;
        int g = a*b+c;
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
    }
}
