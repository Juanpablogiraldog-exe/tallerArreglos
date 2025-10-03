package umanizales.edu.co;

import umanizales.edu.co.service.EncuestaService;

public class Main {
    public static void main(String[] args) {
        EncuestaService encuesta = new EncuestaService();
        
        System.out.println("=== SISTEMA DE ENCUESTA ESTUDIANTIL ===\n");
        
        // Realizar la encuesta
        encuesta.realizarEncuesta();
        
        // Mostrar resultados
        encuesta.mostrarResultados();
        
        System.out.println("\n=== FIN DEL PROGRAMA ===");
    }
}
