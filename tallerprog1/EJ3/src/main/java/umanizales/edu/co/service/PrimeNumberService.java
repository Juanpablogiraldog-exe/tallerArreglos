package umanizales.edu.co.service;

import umanizales.edu.co.model.PrimeNumberProcessor;

public class PrimeNumberService {
    private PrimeNumberProcessor processor;

    public PrimeNumberService() {
        this.processor = new PrimeNumberProcessor();
    }

    public String processAndGetPrimes() {
        processor.findPrimesBetween100And300();
        int[] primes = processor.getPrimeNumbers();
        
        StringBuilder result = new StringBuilder("Los 10 números primos entre 100 y 300 son:\n");
        for (int i = 0; i < primes.length; i++) {
            result.append("Posición ").append(i + 1).append(": ").append(primes[i]).append("\n");
        }
        return result.toString();
    }
}
