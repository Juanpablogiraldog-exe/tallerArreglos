package umanizales.edu.co.model;

public class NumberAnalyzer {
    private int[] numbers;

    public NumberAnalyzer(int[] numbers) {
        this.numbers = numbers;
    }

    public int findMaxNumber() {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("El arreglo no puede estar vacío");
        }
        
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    public int countOccurrences(int number) {
        int count = 0;
        for (int num : numbers) {
            if (num == number) {
                count++;
            }
        }
        return count;
    }
}
