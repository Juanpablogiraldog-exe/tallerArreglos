package umanizales.edu.co.model;

import umanizales.edu.co.service.NumberService;

public class Main {
    public static void main(String[] args) {
        NumberService service = new NumberService();
        int[] numbers = service.readNumbers(10);
        
        System.out.println("Números ingresados:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        
        boolean isAverageInArray = service.isAverageInArray(numbers);
        System.out.println("\nEl promedio entero " + service.calculateAverage(numbers) + 
                         (isAverageInArray ? " SÍ" : " NO") + " está en el arreglo.");
    }
}
