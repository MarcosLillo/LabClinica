public class Main {
    public static void main(String[] args) {

        ClinicaVeterinaria miClinica = new ClinicaVeterinaria("Veterinaria UBB", 3);

        Mascota m1 = new Mascota("mencho", "Perro");
        Mascota m2 = new Mascota("michi", "Gato");
        Mascota m3 = new Mascota("copo", "Perro");
        Mascota m4 = new Mascota("luna", "loro");

        miClinica.registrarPaciente(m1);
        miClinica.registrarPaciente(m2);
        miClinica.registrarPaciente(m3);
        miClinica.registrarPaciente(m4);

        miClinica.realizarRondaMedica();

        miClinica.realizarRondaMedica();
    }
}