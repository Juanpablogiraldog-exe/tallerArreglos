package umanizales.edu.co.controller;

import umanizales.edu.co.service.NumberService;
import umanizales.edu.co.service.NumberServiceImpl;

public class NumberController {
    private final NumberService numberService;

    public NumberController() {
        this.numberService = new NumberServiceImpl();
    }

    public void start() {
        numberService.processNumbers();
    }

    public static void main(String[] args) {
        new NumberController().start();
    }
}
