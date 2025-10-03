package umanizales.edu.co.controller;

import umanizales.edu.co.service.PrimeNumberService;

public class PrimeNumberController {
    private PrimeNumberService service;

    public PrimeNumberController() {
        this.service = new PrimeNumberService();
    }

    public void processAndShowPrimes() {
        String result = service.processAndGetPrimes();
        System.out.println(result);
    }
}
