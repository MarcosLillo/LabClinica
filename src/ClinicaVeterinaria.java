public class ClinicaVeterinaria {
    private String nombreClinica;
    private Mascota[] pacientes;
    private int cantidadPacientes;

    public ClinicaVeterinaria(String nombreClinica, int capacidadMaxima) {
        this.nombreClinica = nombreClinica;
        this.pacientes = new Mascota[capacidadMaxima];
        this.cantidadPacientes = 0;
    }

    public void registrarPaciente(Mascota mascota) {
        if (cantidadPacientes < pacientes.length) {
            pacientes[cantidadPacientes] = mascota;
            cantidadPacientes++;
            System.out.println("Confirmacion: " + mascota.getNombre() + " ha sido registrado en " + nombreClinica);
        } else {
            System.out.println("Error: La clinica esta llena, no se puede registrar a " + mascota.getNombre());
        }
    }

    public void realizarRondaMedica() {
        System.out.println("\n--- Iniciando ronda medica en " + nombreClinica + " ---");
        for (int i = 0; i < cantidadPacientes; i++) {
            if (!pacientes[i].isAtendida()) {
                pacientes[i].recibirTratamiento();
            } else {
                System.out.println(pacientes[i].getNombre() + " ya fue atendido anteriormente.");
            }
        }
    }
}