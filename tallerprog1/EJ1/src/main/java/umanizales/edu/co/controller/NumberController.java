package umanizales.edu.co.controller;

import umanizales.edu.co.service.NumberService;
import java.util.Scanner;

public class NumberController {
    private static final int ARRAY_SIZE = 10;
    
    public NumberController() {
        // Constructor vacío
    }
    
    public void processUserInput() {
        Scanner scanner = new Scanner(System.in);
        try {
            int[] numbers = new int[ARRAY_SIZE];
            
            System.out.println("Por favor ingrese 10 números enteros:");
            
            for (int i = 0; i < ARRAY_SIZE; i++) {
                while (true) {
                    System.out.print("Número " + (i + 1) + ": ");
                    if (scanner.hasNextLine()) {
                        String input = scanner.nextLine().trim();
                        try {
                            numbers[i] = Integer.parseInt(input);
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Por favor ingrese un número entero válido.");
                        }
                    }
                }
            }
            
            NumberService service = new NumberService(numbers);
            String result = service.processNumbers();
            System.out.println(result);
            
        } catch (Exception e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (scanner != null) {
                    scanner.close();
                }
            } catch (Exception e) {
                System.err.println("Error al cerrar el scanner: " + e.getMessage());
            }
        }
    }
}
