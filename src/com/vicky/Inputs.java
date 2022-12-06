package com.vicky;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Waiting for your response: ");
        long mobileNum = sc.nextInt();
        System.out.println("Your mobile number is: " + mobileNum);
    }
}
