import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Paciente> pacientes = new ArrayList<>();
        List<Medico> medicos = new ArrayList<>();
        List<Consulta> consultas = new ArrayList<>();

        Paciente paciente1 = new Paciente("Jorge", 18, "Masculino", "Bo. La esperanza", "Primera vez de visita", "Seguro 1");

        Medico medico1 = new Medico("Dr. Nelson", 30, "Masculino", "Avenida 789", "Medico General", 012345, "Lunes 8-9PM");

        ConsultaMedica consultaMedica1 = new ConsultaMedica();
        ConsultaDental consultaDental1 = new ConsultaDental();

        pacientes.add(paciente1);
        medicos.add(medico1);
        consultas.add(consultaMedica1);
        consultas.add(consultaDental1);

        for (Paciente paciente : pacientes) {
            System.out.println("Paciente: " + paciente.getNombre() + " - Historial Medico: " + paciente.getHistorialMedico());
        }

        for (Medico medico : medicos) {
            System.out.println("Médico: " + medico.getNombre() + " - Especialidad: " + medico.getEspecialidad());
        }

        for (Consulta consulta : consultas) {
            if (consulta instanceof ConsultaMedica) {
                ConsultaMedica consultaMedica = (ConsultaMedica) consulta;
                System.out.println("Consulta Médica - Diagnóstico: " + consultaMedica.getDiagnosticopresentado());
            } else if (consulta instanceof ConsultaDental) {
                ConsultaDental consultaDental = (ConsultaDental) consulta;
                System.out.println("Consulta Dental - Procedimiento: " + consultaDental.getProcesorealizado());
            }
        }
}
}