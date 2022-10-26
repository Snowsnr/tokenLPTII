public class Principal {
    public static void main(String[] args) {
        // mascota
        Gato cat = new Gato("Michi", "de calle", "atun", 1, 7);
        Perro dog = new Perro("Pulgas", "de calle", "croquetas", 2, "hace guau guau");

        cat.mostrarGato();
        dog.mostrarPerro();
    }
}
