package umanizales.edu.co.model;

public class NumberProcessor {
    private int[] numbers;

    public NumberProcessor(int[] numbers) {
        this.numbers = numbers;
    }

    public void findNumbersEndingWithFour() {
        System.out.println("Números que terminan en 4:");
        boolean found = false;
        
        for (int i = 0; i < numbers.length; i++) {
            if (Math.abs(numbers[i]) % 10 == 4) {
                System.out.println("Número: " + numbers[i] + " en posición: " + i);
                found = true;
            }
        }
        
        if (!found) {
            System.out.println("No se encontraron números que terminen en 4.");
        }
    }
}
