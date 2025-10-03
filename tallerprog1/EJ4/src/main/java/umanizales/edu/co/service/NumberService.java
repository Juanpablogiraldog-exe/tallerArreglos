package umanizales.edu.co.service;

import umanizales.edu.co.model.NumberProcessor;
import java.util.Scanner;

public class NumberService {
    private final Scanner scanner;
    private final int[] numbers;

    public NumberService() {
        this.scanner = new Scanner(System.in);
        this.numbers = new int[10];
    }

    public void readNumbers() {
        System.out.println("Ingrese 10 números enteros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
    }

    public void processNumbers() {
        NumberProcessor processor = new NumberProcessor(numbers);
        processor.findNumbersEndingWithFour();
    }
}
