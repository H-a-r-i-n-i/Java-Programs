/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day3;

import java.util.*;

class PalPrime {
    public PalPrime(int number, String message) {
        System.out.println("Number " + number + " is " + message);
    }

    public static void main(String[] args) {
        int[] numbers = { 1, 34543, 565, 727, 10099 };

        for (int num : numbers) {
            isPalPrime(num);
        }
    }

    public static void isPalPrime(int num) {
        boolean isPalindrome = checkPalindrome(num);
        boolean isPrime = checkPrime(num);

        if (isPalindrome && isPrime) {
            new PalPrime(num, "PalPrime");
        } else if (isPalindrome) {
            new PalPrime(num, "Palindrome");
        } else if (isPrime) {
            new PalPrime(num, "Prime");
        } else {
            new PalPrime(num, "neither Prime nor Palindrome");
        }
    }

    public static boolean checkPalindrome(int num) {
        int reversed = 0;
        int original = num;

        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return original == reversed;
    }

    public static boolean checkPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}

