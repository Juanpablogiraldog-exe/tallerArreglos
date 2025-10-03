package umanizales.edu.co.service;

import umanizales.edu.co.model.NumberModel;

public interface NumberService {
    void calculateFactorials(NumberModel model);
    long calculateFactorial(int number);
}
