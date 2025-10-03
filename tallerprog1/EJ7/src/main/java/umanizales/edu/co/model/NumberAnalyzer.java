package umanizales.edu.co.model;

public class NumberAnalyzer {
    private int[] numbers;

    public NumberAnalyzer(int[] numbers) {
        this.numbers = numbers;
    }

    public int findPositionWithMaxDigitSum() {
        int maxSum = -1;
        int position = -1;
        
        for (int i = 0; i < numbers.length; i++) {
            int currentSum = calculateDigitSum(Math.abs(numbers[i]));
            if (currentSum > maxSum) {
                maxSum = currentSum;
                position = i;
            }
        }
        
        return position;
    }
    
    private int calculateDigitSum(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
    
    public int[] getNumbers() {
        return numbers;
    }
}
