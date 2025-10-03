package umanizales.edu.co.model;

public class NumberModel {
    private int[] numbers;
    private long[] factorials;

    public NumberModel() {
        this.numbers = new int[10];
        this.factorials = new long[10];
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumber(int index, int number) {
        this.numbers[index] = number;
    }

    public long[] getFactorials() {
        return factorials;
    }

    public void setFactorial(int index, long factorial) {
        this.factorials[index] = factorial;
    }
}
