import java.util.Scanner;
import java.lang.Math;

public class Figura {
    /*
     * La librería math nos sirve para poder realizar calculos de potencias, raices,
     * pi, euler
     */
    // variables globales
    double lado, altura, area, perimetro, lado2, lado3;
    int opcion;
    char letra;
    boolean pan = false;

    // objeto
    Scanner entrada = new Scanner(System.in);

    // metodos
    public void menu() {
        do {
            System.out.println("Programa de calculo de areas y perimetros");
            System.out.println("Elija una opcion");
            System.out.println("1. Cuadrado");
            System.out.println("2. Triangulo");
            System.out.println("3. Circulo");
            System.out.println("4. Pentagono");
            System.out.println("5. Dodecagono");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    calcularCuadrado();
                    break;
                case 2:
                    // calcularTriangulo();
                    break;
                case 3:
                    // calcularCirculo();
                    break;
                case 4:
                    // calcularPentagono();
                    break;
                case 5:
                    // calcularTDodecagono();
                    break;
                default:
            }
            System.out.println("Desea repetir el programa, S para repetir");
            letra = entrada.next().charAt(0);
        } while (letra == 's' || letra == 'S');
    }

    public void calcularCuadrado() {
        // bienvenidos a la tarea
        while (pan == false) {
            try {
                pan = true;
                System.out.println("Ingrese el valor del lado del cuadrado");
                lado = entrada.nextDouble();
                perimetro = lado * 4;
                area = lado * lado;
                System.out.println("El perimetro es de: " + perimetro + " el area es de: " + area);
            } catch (Exception e) {
                // El posible error
                System.out.println("Ingrese solo numeros");
                System.out.println("Error: " + e.getMessage());
                pan = true;
            }
        }
    }
}