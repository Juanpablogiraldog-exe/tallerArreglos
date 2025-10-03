package umanizales.edu.co.controller;

import umanizales.edu.co.service.NumberService;
import java.util.Scanner;

public class NumberController {
    private NumberService numberService;
    private Scanner scanner;
    
    public NumberController() {
        this.scanner = new Scanner(System.in);
    }
    
    public void processNumbers() {
        int[] numbers = new int[10];
        System.out.println("Ingrese 10 números enteros:");
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        
        this.numberService = new NumberService(numbers);
        int position = numberService.findPositionWithMaxDigitSum();
        
        System.out.println("\nNúmeros ingresados:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Posición " + i + ": " + numbers[i]);
        }
        
        System.out.println("\nEl número con la mayor suma de dígitos es: " + numbers[position] + 
                         " en la posición " + position);
    }
}
