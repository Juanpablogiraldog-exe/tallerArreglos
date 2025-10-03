package umanizales.edu.co.service;

import umanizales.edu.co.model.NumberModel;

public class NumberServiceImpl implements NumberService {
    private final NumberModel model;

    public NumberServiceImpl() {
        this.model = new NumberModel();
    }

    @Override
    public void processNumbers(int[] numbers) {
        if (numbers.length != 10) {
            throw new IllegalArgumentException("Debe ingresar exactamente 10 números");
        }
        for (int i = 0; i < numbers.length; i++) {
            model.setNumber(i, numbers[i]);
        }
    }

    @Override
    public String getNumberRanges() {
        return model.getRanges();
    }
}
