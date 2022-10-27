public class Gato extends Animal {
    /** la palabra reservada extends es para heredar */
    private int num_vidas;

    public Gato() {

    }

    public Gato(String nombre, String raza, String tipo_alimento, int edad, int num_vidas) {
        /**
         * Para poder obtener o acceder a los atributos heredados debemos hacer uso de
         * la palabra reservada super
         */
        super(nombre, raza, tipo_alimento, edad);
        this.num_vidas = num_vidas;
    }

    // get
    public int getNum_vidas() {
        return num_vidas;
    }

    // set
    public void setNum_vidas(int num_vidas) {
        this.num_vidas = num_vidas;
    }

    public void mostrarGato() {
        System.out.println("El nombre del perro es: " + getNombre() + "\n"
                + "Se alimenta de: " + getTipo_alimento() + "\n"
                + "Su edad es: " + getEdad() + "\n"
                + "Su raza es: "+getRaza() +"\n"
                + "Su numero de vidas es " + getNum_vidas() + "\n");
    }
}
