import java.util.Scanner;

class Ejercicio {
    /*
     * Vamos a hacer un programa mediante el cual vamos a tener cuatro opciones que
     * son
     * 1 otra calculadora
     * 2 Conversion de unidades
     * 3 Creacion de un cuadrito magico
     * 4 movimiento de un cuadro
     */

    // objetos
    Scanner entrada = new Scanner(System.in);

    // metodos o comportamiento de la clase
    // Vamos a crear un metodo pra el menu
    /*
     * public es el acceso a el tipo de dato, clase o metodo cualquier elemento
     * elemento del programa puede acceder a el
     * private es de acceso restringido solo mediante reglas se puede accceder a el
     * protected se puede tener acceso solo desde la misma clase y aplicado la
     * herencia de POO entre los hijos y padres
     * 
     * Un metodo tambien es un tipo de dato aplicado
     */
    // la variable puede ser global
    char op;

    public void menu() {
        System.out.println("Bienvenido a los metodos");
        System.out.println("Elije una de las siguientes opciones: ");
        System.out.println("a.- Calculadora");
        System.out.println("b.- Conversion de unidades");
        System.out.println("c.- Creacion de cuadros");
        System.out.println("d.- Movimiento de un cuadro");
        op = entrada.next().charAt(0);

        switch (op) {
            case 'a':
                // Vamos a hacer un metodo
                Ejercicio1();
                break;
            case 'b':
                Ejercicio2();
                break;
            case 'c':
                Ejercicio3();
                break;
            case 'd':
                Ejercicio4();
                break;
            default:
                System.out.println("Opcion no valida");
        }
    }

    // metodo 1
    public void Ejercicio1() {
        // calculadora
        // + - * /
        double num1 = 0, suma = 0, multi = 0;
        char operacion;

        System.out.println("Seleccionar la operacion que deseas realizar");
        System.out.println("a.- suma y resta: ");
        System.out.println("b.- multiplicacion");
        System.out.println("c.- division: ");

        operacion = entrada.next().charAt(0);
        switch (operacion) {
            case 'a':
                System.out.println("Para detener la operacion presione 0");
                System.out.println("Escriba tantos numeros como quiera sumar o restar");
                do {
                    num1 = entrada.nextDouble();
                    suma += num1;
                    // suma = suma + num1
                    System.out.println("El resultado es " + suma);
                } while (num1 != 0);
                break;
            case 'b':
                System.out.println("Para detener la operacion presione 0");
                System.out.println("Escriba tantos numeros como quiera mulriplicar");
                do {
                    num1 = entrada.nextDouble();
                    multi *= num1;
                    // multi = multi * num1
                    System.out.println("El resultado es " + multi);
                } while (num1 != 0);
                break;
            case 'c':
                System.out.println("Ingrese el numerador");
                num1 = entrada.nextDouble();
                System.out.println("Ingrese el denominador");
                suma = entrada.nextDouble();

                if (suma == 0) {
                    System.out.println("No se puede realizar la division entre 0");
                } else {
                    multi = num1 / suma;
                }

                System.out.println("El resultado de la division es: " + multi);
                break;
        }

    }

    // metodo 2
    public void Ejercicio2() {
        /*
         * Realizar una conversion de m a cm y in
         * kg a libras y g
         * m/s a km/h
         */
        double metros = 0, kg = 0, vel = 0, cm = 100, pulgadas = 39.37, gramos = 1000, libra = 2.20, ms = 0;
        double a, b;

        System.out.println("Seleccione la cantidad que desee convertir");
        System.out.println("a. Metros a centimetros y pulgadas");
        System.out.println("b. Kg a libras y gramos");
        System.out.println("a. m/s a km/h");

        op = entrada.next().charAt(0);

        switch (op) {
            case 'a':
                System.out.println("Ingrese la cantidad en metros");
                metros = entrada.nextDouble();
                a = metros * cm;
                b = metros * pulgadas;
                System.out.println("La cantidad de metros son " + metros + "en cm son: " + a + "en pulgadas son: " + b);
                break;
            case 'b':
                System.out.println("Ingrese la cantidad en kilogramos");
                kg = entrada.nextDouble();
                a = kg * gramos;
                b = kg * libra;
                System.out
                        .println("La cantidad de kilogramos son " + kg + "en gramos son: " + a + "en libras son: " + b);
                break;
            case 'c':
                System.out.println("Ingrese la cantidad en m/s");
                ms = entrada.nextDouble();
                a = ms * (3600 / 1000);
                System.out.println("La cantidad en m/s son " + ms + "en km/h son: " + a);
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
    }

    // metodo 3
    public void Ejercicio3() {

    }

    // metodo 4
    public void Ejercicio4() {

    }

}