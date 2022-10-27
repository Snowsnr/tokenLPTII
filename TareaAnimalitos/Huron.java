public class Huron extends Animal{
    private double largo;

    public Huron() {

    }

    public Huron(String nombre, String raza, String tipo_alimento, int edad, double largo) {

        super(nombre, raza, tipo_alimento, edad);
        this.largo=largo;
    }

    public double getLargo() {
        return largo;
    }

    public void setSalto(double largo) {
        this.largo = largo;
    }

    public void mostrarHuron() {
        System.out.println("El nombre del conejo es: " + getNombre() + "\n"
                + "Se alimenta de: " + getTipo_alimento() + "\n"
                + "Su edad es: " + getEdad() + "\n"
                + "Su raza es: "+getRaza() +"\n"
                + "Mide " + getLargo()+" metros" + "\n");
    }
}
