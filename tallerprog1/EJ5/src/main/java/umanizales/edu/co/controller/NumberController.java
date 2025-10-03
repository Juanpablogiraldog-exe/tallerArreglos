package umanizales.edu.co.controller;

import java.util.Scanner;
import umanizales.edu.co.service.NumberService;

public class NumberController {
    private Scanner scanner;
    private NumberService numberService;

    public NumberController() {
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("Bienvenido al analizador de números");
        System.out.println("Ingrese 10 números enteros:");
        
        int[] numbers = new int[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        
        this.numberService = new NumberService(numbers);
        String result = numberService.analyzeNumbers();
        System.out.println("\nResultado: " + result);
    }
}
