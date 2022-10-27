public class Hamster extends Animal {
    private String color;

    public Hamster() {

    }

    public Hamster(String nombre, String raza, String tipo_alimento, int edad, String color) {

        super(nombre, raza, tipo_alimento, edad);
        this.color=color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void mostrarHamster() {
        System.out.println("El nombre del conejo es: " + getNombre() + "\n"
                + "Se alimenta de: " + getTipo_alimento() + "\n"
                + "Su edad es: " + getEdad() + "\n"
                + "Su raza es: "+getRaza() +"\n"
                + "Es de color " + getColor() + "\n");
    }
}
