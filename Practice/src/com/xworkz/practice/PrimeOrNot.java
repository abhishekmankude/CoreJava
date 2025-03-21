package com.xworkz.practice;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        sc.close();

        if (n <= 1) {
            System.out.println(n + " is not a prime number");
            return; // Exit early for invalid inputs
        }

        boolean isPrime = true;

        for (int i = 2; i * i <= n; i++) { // Loop from 2 to sqrt(n)
            if (n % i == 0) {
                isPrime = false;
                break; // No need to check further if a divisor is found
            }
        }

        if (isPrime) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }
    }
}
