package com.orkun.Maths;

public class PrimeNumber {


    public static void main(String[] args) {

        PrimeNumber primeNumber = new PrimeNumber();

        System.out.println(primeNumber.primeNumber(9));
        System.out.println(primeNumber.primeSlightlyBetter(45));

        System.out.println((int)Math.sqrt(45));
    }

    boolean primeNumber(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    boolean primeSlightlyBetter(int n) {
        if (n < 2)
            return false;
        int sqrt = (int) Math.sqrt(n);
        for (int i = 2; i <= sqrt; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
