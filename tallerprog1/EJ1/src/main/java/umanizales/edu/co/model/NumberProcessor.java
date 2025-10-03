package umanizales.edu.co.model;

public class NumberProcessor {
    private int[] numbers;
    private int maxNumber;
    private int maxPosition;

    public NumberProcessor(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("El arreglo no puede ser nulo o vacío");
        }
        this.numbers = numbers;
        this.maxNumber = Integer.MIN_VALUE;
        this.maxPosition = -1;
    }

    public void findMaxNumber() {
        if (numbers == null || numbers.length == 0) {
            return;
        }
        
        maxNumber = numbers[0];
        maxPosition = 0;
        
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
                maxPosition = i;
            }
        }
    }

    public int getMaxNumber() {
        return maxNumber;
    }

    public int getMaxPosition() {
        return maxPosition;
    }
}
