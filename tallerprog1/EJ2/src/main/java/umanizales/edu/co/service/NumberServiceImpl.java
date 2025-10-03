package umanizales.edu.co.service;

import umanizales.edu.co.model.NumberProcessor;

public class NumberServiceImpl implements NumberService {
    @Override
    public void processNumbers() {
        NumberProcessor processor = new NumberProcessor();
        processor.readNumbers();
        processor.printResult();
    }
}
