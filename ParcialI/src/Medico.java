public class Medico extends Persona{
    private String especialidad;
    private int numeroColegiado;
    private String horarioConsulta;

    public Medico(String nombre, int edad, String genero, String direccion, String especialidad, int numeroColegiado, String horarioConsulta) {
        super(nombre, edad, genero, direccion);
        this.especialidad = especialidad;
        this.numeroColegiado = numeroColegiado;
        this.horarioConsulta = horarioConsulta;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getNumeroColegiado() {
        return numeroColegiado;
    }

    public void setNumeroColegiado(int numeroColegiado) {
        this.numeroColegiado = numeroColegiado;
    }

    public String getHorarioConsulta() {
        return horarioConsulta;
    }

    public void setHorarioConsulta(String  horarioConsulta) {
        this.horarioConsulta = horarioConsulta;
    }
}