package umanizales.edu.co.controller;

import umanizales.edu.co.service.NumberService;

public class NumberController {
    private NumberService numberService;

    public NumberController() {
        this.numberService = new NumberService();
    }

    public void processNumbers(int count) {
        int[] numbers = numberService.readNumbers(count);
        int average = numberService.calculateAverage(numbers);
        boolean isAverageInArray = numberService.isAverageInArray(numbers);
        
        System.out.println("\nResultados:");
        System.out.println("Números ingresados:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + (i < numbers.length - 1 ? ", " : ""));
        }
        
        System.out.println("\nPromedio entero: " + average);
        System.out.println("El promedio " + (isAverageInArray ? "SÍ" : "NO") + " está en el arreglo.");
    }
}
