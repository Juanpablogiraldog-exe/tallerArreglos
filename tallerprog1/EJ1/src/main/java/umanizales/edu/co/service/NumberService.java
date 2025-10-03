package umanizales.edu.co.service;

import umanizales.edu.co.model.NumberProcessor;

public class NumberService {
    private NumberProcessor processor;

    public NumberService(int[] numbers) {
        this.processor = new NumberProcessor(numbers);
    }

    public String processNumbers() {
        try {
            processor.findMaxNumber();
            int maxNumber = processor.getMaxNumber();
            int position = processor.getMaxPosition();
            
            if (position == -1) {
                return "No se encontraron números en el arreglo.";
            }
            
            // Add 1 to position because array indices start at 0 but we want to show position starting at 1
            return String.format("El número mayor es %d y se encuentra en la posición %d del arreglo.", 
                               maxNumber, position + 1);
        } catch (Exception e) {
            return "Error al procesar los números: " + e.getMessage();
        }
    }
}
