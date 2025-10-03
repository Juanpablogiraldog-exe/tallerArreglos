package umanizales.edu.co.service;

import umanizales.edu.co.model.Estudiante;
import java.util.Scanner;

public class EncuestaService {
    private static final int MAX_ESTUDIANTES = 50;
    private Estudiante[] estudiantes;
    private int cantidadEstudiantes;
    private Scanner scanner;

    public EncuestaService() {
        this.estudiantes = new Estudiante[MAX_ESTUDIANTES];
        this.cantidadEstudiantes = 0;
        this.scanner = new Scanner(System.in);
    }

    public void realizarEncuesta() {
        System.out.println("=== ENCUESTA ESTUDIANTES ===");
        System.out.print("Ingrese la cantidad de estudiantes a encuestar (máximo 50): ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        if (n <= 0 || n > MAX_ESTUDIANTES) {
            System.out.println("Cantidad no válida. Se usará el máximo permitido (50).");
            n = MAX_ESTUDIANTES;
        }

        for (int i = 0; i < n; i++) {
            System.out.println("\nEstudiante #" + (i + 1));
            System.out.print("Cédula: ");
            String cedula = scanner.nextLine();
            
            int sexo;
            do {
                System.out.print("Sexo (1 - Masculino, 2 - Femenino): ");
                sexo = scanner.nextInt();
            } while (sexo != 1 && sexo != 2);
            
            int trabaja;
            do {
                System.out.print("¿Trabaja? (1 - Si, 2 - No): ");
                trabaja = scanner.nextInt();
            } while (trabaja != 1 && trabaja != 2);
            
            int sueldo = 0;
            if (trabaja == 1) {
                System.out.print("Sueldo: ");
                sueldo = scanner.nextInt();
            }
            
            scanner.nextLine(); // Limpiar buffer
            
            estudiantes[cantidadEstudiantes++] = new Estudiante(cedula, sexo, trabaja, sueldo);
        }
    }

    public void mostrarResultados() {
        if (cantidadEstudiantes == 0) {
            System.out.println("No hay datos de estudiantes para mostrar.");
            return;
        }

        int totalHombres = 0;
        int totalMujeres = 0;
        int hombresTrabajan = 0;
        int mujeresTrabajan = 0;
        int sumaSueldosHombres = 0;
        int sumaSueldosMujeres = 0;

        for (int i = 0; i < cantidadEstudiantes; i++) {
            Estudiante e = estudiantes[i];
            if (e.getSexo() == 1) { // Hombre
                totalHombres++;
                if (e.getTrabaja() == 1) {
                    hombresTrabajan++;
                    sumaSueldosHombres += e.getSueldo();
                }
            } else { // Mujer
                totalMujeres++;
                if (e.getTrabaja() == 1) {
                    mujeresTrabajan++;
                    sumaSueldosMujeres += e.getSueldo();
                }
            }
        }

        // Cálculos
        double porcentajeHombres = (totalHombres * 100.0) / cantidadEstudiantes;
        double porcentajeMujeres = (totalMujeres * 100.0) / cantidadEstudiantes;
        
        double porcentajeHombresTrabajan = totalHombres > 0 ? (hombresTrabajan * 100.0) / totalHombres : 0;
        double sueldoPromedioHombres = hombresTrabajan > 0 ? (double) sumaSueldosHombres / hombresTrabajan : 0;
        
        double porcentajeMujeresTrabajan = totalMujeres > 0 ? (mujeresTrabajan * 100.0) / totalMujeres : 0;
        double sueldoPromedioMujeres = mujeresTrabajan > 0 ? (double) sumaSueldosMujeres / mujeresTrabajan : 0;

        // Mostrar resultados
        System.out.println("\n=== RESULTADOS DE LA ENCUESTA ===");
        System.out.printf("Porcentaje de hombres: %.2f%%\n", porcentajeHombres);
        System.out.printf("Porcentaje de mujeres: %.2f%%\n", porcentajeMujeres);
        System.out.printf("\nPorcentaje de hombres que trabajan: %.2f%%\n", porcentajeHombresTrabajan);
        System.out.printf("Sueldo promedio de hombres que trabajan: $%,.2f\n", sueldoPromedioHombres);
        System.out.printf("\nPorcentaje de mujeres que trabajan: %.2f%%\n", porcentajeMujeresTrabajan);
        System.out.printf("Sueldo promedio de mujeres que trabajan: $%,.2f\n", sueldoPromedioMujeres);
    }
}
