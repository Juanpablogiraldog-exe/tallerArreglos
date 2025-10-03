package umanizales.edu.co.model;

public class NumberModel {
    private int[] numbers;

    public NumberModel() {
        this.numbers = new int[10];
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumber(int index, int value) {
        if (index >= 0 && index < 10) {
            numbers[index] = value;
        }
    }

    public String getRanges() {
        StringBuilder result = new StringBuilder();
        for (int num : numbers) {
            result.append("Números del 1 al ").append(num).append(": ");
            for (int i = 1; i <= num; i++) {
                result.append(i);
                if (i < num) {
                    result.append(", ");
                }
            }
            result.append("\n");
        }
        return result.toString();
    }
}
