package umanizales.edu.co.controller;

import umanizales.edu.co.service.NumberService;
import umanizales.edu.co.service.NumberServiceImpl;
import java.util.Scanner;

public class NumberController {
    private final NumberService numberService;
    private final Scanner scanner;

    public NumberController() {
        this.numberService = new NumberServiceImpl();
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("Bienvenido al programa de números");
        int[] numbers = new int[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        
        try {
            numberService.processNumbers(numbers);
            System.out.println("\nResultados:");
            System.out.println(numberService.getNumberRanges());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        scanner.close();
    }
}
