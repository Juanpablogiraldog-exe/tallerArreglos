package umanizales.edu.co.service;

import java.util.Scanner;

public class NumberService {
    private Scanner scanner = new Scanner(System.in);

    public int[] readNumbers(int count) {
        int[] numbers = new int[count];
        System.out.println("Ingrese " + count + " números enteros:");
        
        for (int i = 0; i < count; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        
        return numbers;
    }

    public int calculateAverage(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }

    public boolean isAverageInArray(int[] numbers) {
        if (numbers.length == 0) return false;
        
        int average = calculateAverage(numbers);
        
        for (int num : numbers) {
            if (num == average) {
                return true;
            }
        }
        
        return false;
    }
}
