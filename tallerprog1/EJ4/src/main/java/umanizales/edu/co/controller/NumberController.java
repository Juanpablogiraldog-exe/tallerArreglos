package umanizales.edu.co.controller;

import umanizales.edu.co.service.NumberService;

public class NumberController {
    private final NumberService numberService;

    public NumberController() {
        this.numberService = new NumberService();
    }

    public void processNumbers() {
        numberService.readNumbers();
        numberService.processNumbers();
    }
}
