public class Perro extends Animal {
    /** la palabra reservada extends es para heredar */
    private String ladrido;

    public Perro() {

    }

    public Perro(String nombre, String raza, String tipo_alimento, int edad, String ladrido) {
        /**
         * Para poder obtener o acceder a los atributos heredados debemos hacer uso de
         * la palabra reservada super
         */
        super(nombre, raza, tipo_alimento, edad);
        this.ladrido = ladrido;
    }

    // get
    public String getLadrido() {
        return ladrido;
    }

    // set
    public void setLadrido(String ladrido) {
        this.ladrido = ladrido;
    }

    public void mostrarPerro() {
        System.out.println("El nombre del perro es: " + getNombre() + "\n"
                + "Se alimenta de: " + getTipo_alimento() + "\n"
                + "Su edad es: " + getEdad() + "\n"
                + "Su raza es: "+getRaza() +"\n"
                + "Su ladrido es: " + getLadrido()+ "\n");
    }
}
