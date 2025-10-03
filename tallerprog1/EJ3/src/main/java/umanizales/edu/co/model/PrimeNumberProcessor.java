package umanizales.edu.co.model;

public class PrimeNumberProcessor {
    private int[] primeNumbers;

    public PrimeNumberProcessor() {
        this.primeNumbers = new int[10];
    }

    public void findPrimesBetween100And300() {
        int count = 0;
        int number = 100; // Start from 100
        
        while (count < 10 && number <= 300) {
            if (isPrime(number)) {
                primeNumbers[count] = number;
                count++;
            }
            number++;
        }
    }

    private boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int[] getPrimeNumbers() {
        return primeNumbers;
    }
}
