package umanizales.edu.co.service;

import umanizales.edu.co.model.NumberModel;

public class NumberServiceImpl implements NumberService {
    @Override
    public void calculateFactorials(NumberModel model) {
        for (int i = 0; i < model.getNumbers().length; i++) {
            long factorial = calculateFactorial(model.getNumbers()[i]);
            model.setFactorial(i, factorial);
        }
    }

    @Override
    public long calculateFactorial(int number) {
        if (number < 0) {
            return -1; // Factorial of negative number is undefined
        }
        long result = 1;
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
