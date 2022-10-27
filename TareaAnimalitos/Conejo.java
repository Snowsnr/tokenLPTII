public class Conejo extends Animal{
    private double salto;

    public Conejo() {

    }

    public Conejo(String nombre, String raza, String tipo_alimento, int edad, double salto) {

        super(nombre, raza, tipo_alimento, edad);
        this.salto=salto;
    }

    public double getSalto() {
        return salto;
    }

    public void setSalto(double salto) {
        this.salto = salto;
    }

    public void mostrarConejo() {
        System.out.println("El nombre del conejo es: " + getNombre() + "\n"
                + "Se alimenta de: " + getTipo_alimento() + "\n"
                + "Su edad es: " + getEdad() + "\n"
                + "Su raza es: "+getRaza() +"\n"
                + "Puede saltar " + getSalto()+" metros" + "\n");
    }
}
