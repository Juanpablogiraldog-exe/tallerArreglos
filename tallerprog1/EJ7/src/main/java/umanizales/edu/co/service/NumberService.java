package umanizales.edu.co.service;

import umanizales.edu.co.model.NumberAnalyzer;

public class NumberService {
    private NumberAnalyzer analyzer;
    
    public NumberService(int[] numbers) {
        this.analyzer = new NumberAnalyzer(numbers);
    }
    
    public int findPositionWithMaxDigitSum() {
        return analyzer.findPositionWithMaxDigitSum();
    }
    
    public int[] getNumbers() {
        return analyzer.getNumbers();
    }
}
