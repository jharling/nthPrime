package com.company;

public class Main {

    public static void main(String[] args) {
	    /*
			By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

			What is the 10001st prime number?
	    */

        System.out.println(lookForPrime(10001));
    }

    private static int lookForPrime (int n) {
        int primeNumber = 2;
        int count = 0;
        int answer = 0;
        while (count < n) {
            if (checkIfPrime(primeNumber)) {
                answer = primeNumber;
                count++;
            }
            primeNumber++;
        }
        return answer;
    }

    private static boolean checkIfPrime (int n) {
        int i = 2;
        while (i < n) {
            if (n % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}
