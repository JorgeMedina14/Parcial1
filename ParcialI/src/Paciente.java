public class Paciente extends Persona {
    private String historialMedico;
    private String SeguroSalud;

    public Paciente(String nombre, int edad, String genero, String direccion, String historialMedico, String seguroSalud) {
        super(nombre, edad, genero, direccion);
        this.historialMedico = historialMedico;
        SeguroSalud = seguroSalud;
    }

    public String getHistorialMedico() {
        return historialMedico;
    }

    public void setHistorialMedico(String historialMedico) {
        this.historialMedico = historialMedico;
    }

    public String getSeguroSalud() {
        return SeguroSalud;
    }

    public void setSeguroSalud(String seguroSalud) {
        SeguroSalud = seguroSalud;
    }
}
