package umanizales.edu.co.model;

public class Estudiante {
    private String cedula;
    private int sexo; // 1 - Masculino, 2 - Femenino
    private int trabaja; // 1 - Si trabaja, 2 - No trabaja
    private int sueldo;

    public Estudiante(String cedula, int sexo, int trabaja, int sueldo) {
        this.cedula = cedula;
        this.sexo = sexo;
        this.trabaja = trabaja;
        this.sueldo = sueldo;
    }

    // Getters y setters
    public String getCedula() {
        return cedula;
    }

    public int getSexo() {
        return sexo;
    }

    public int getTrabaja() {
        return trabaja;
    }

    public int getSueldo() {
        return sueldo;
    }
}
