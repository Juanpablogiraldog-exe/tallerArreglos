package umanizales.edu.co.model;

import java.util.Scanner;

public class NumberProcessor {
    private int[] numbers;
    private int size;
    private static final Scanner scanner = new Scanner(System.in);

    public NumberProcessor() {
        this.size = 10;
        this.numbers = new int[size];
    }

    public void readNumbers() {
        System.out.println("Por favor ingrese 10 números enteros:");
        for (int i = 0; i < size; i++) {
            while (true) {
                try {
                    System.out.print("Número " + (i + 1) + ": ");
                    if (scanner.hasNextLine()) {
                        String line = scanner.nextLine();
                        numbers[i] = Integer.parseInt(line);
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Por favor ingrese un número entero válido.");
                    // Clear the invalid input
                    if (scanner.hasNextLine()) {
                        scanner.nextLine();
                    }
                }
            }
        }
    }


    public void printResult() {
        boolean found = false;
        System.out.println("\nNúmeros que terminan en 4:");
        for (int i = 0; i < size; i++) {
            if (Math.abs(numbers[i]) % 10 == 4) {
                System.out.println("Número: " + numbers[i] + " en posición: " + (i + 1));
                found = true;
            }
        }
        if (!found) {
            System.out.println("No se encontraron números que terminen en 4.");
        }
    }

    public static void main(String[] args) {
        try {
            NumberProcessor processor = new NumberProcessor();
            processor.readNumbers();
            processor.printResult();
        } finally {
            scanner.close();
        }
    }
}
