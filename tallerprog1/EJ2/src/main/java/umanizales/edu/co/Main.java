package umanizales.edu.co;

import umanizales.edu.co.service.NumberService;
import umanizales.edu.co.service.NumberServiceImpl;

public class Main {
    public static void main(String[] args) {
        NumberService numberService = new NumberServiceImpl();
        numberService.processNumbers();
    }
}
