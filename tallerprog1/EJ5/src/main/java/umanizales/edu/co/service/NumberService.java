package umanizales.edu.co.service;

import umanizales.edu.co.model.NumberAnalyzer;

public class NumberService {
    private NumberAnalyzer analyzer;

    public NumberService(int[] numbers) {
        this.analyzer = new NumberAnalyzer(numbers);
    }

    public String analyzeNumbers() {
        try {
            int maxNumber = analyzer.findMaxNumber();
            int occurrences = analyzer.countOccurrences(maxNumber);
            return String.format("El número mayor es %d y se repite %d %s", 
                maxNumber, 
                occurrences, 
                occurrences == 1 ? "vez" : "veces");
        } catch (IllegalArgumentException e) {
            return e.getMessage();
        }
    }
}
