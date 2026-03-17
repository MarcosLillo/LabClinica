public class Mascota {
    private String nombre;
    private String especie;
    private boolean atendida = false;

    public Mascota(String nombre, String especie) {
        this.nombre = nombre;
        this.especie = especie;

    }

    public String getNombre() {
        return nombre;
    }

    public boolean isAtendida() {
        return atendida;
    }
    public void recibirTratamiento(){
        this.atendida = true;
        System.out.println(" está muy feliz por recibir tratamiento!");
    }
}
