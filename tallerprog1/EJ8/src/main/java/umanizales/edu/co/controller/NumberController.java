package umanizales.edu.co.controller;

import umanizales.edu.co.model.NumberModel;
import umanizales.edu.co.service.NumberService;
import umanizales.edu.co.service.NumberServiceImpl;

import java.util.Scanner;

public class NumberController {
    private NumberModel model;
    private NumberService service;
    private Scanner scanner;

    public NumberController() {
        this.model = new NumberModel();
        this.service = new NumberServiceImpl();
        this.scanner = new Scanner(System.in);
    }

    public void processNumbers() {
        System.out.println("Bienvenido al calculador de factoriales");
        System.out.println("Ingrese 10 números enteros:");

        // Read 10 numbers
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int number = scanner.nextInt();
            model.setNumber(i, number);
        }

        // Calculate factorials
        service.calculateFactorials(model);

        // Display results
        System.out.println("\nResultados:");
        System.out.println("Número\tFactorial");
        System.out.println("-----------------");
        
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d\t%d%n", 
                model.getNumbers()[i], 
                model.getFactorials()[i]);
        }
    }
}
