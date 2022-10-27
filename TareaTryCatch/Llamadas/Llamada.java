import java.util.Scanner;
public class Llamada{
    int opcion, tipo, minutos, op;
    double precio, credito;
    String num;
    char letra;
    Scanner entrada = new Scanner(System.in);

    public void menu() {
        do{

            System.out.println("Elija una opcion");
            System.out.println("1. Llamada");
            System.out.println("2. Consultar o ingresar credito");
            opcion = entrada.nextInt();

            switch(opcion){
                case 1:
                    llamada();
                    break;
                case 2:
                    credito();
                    break;
              default:
                System.out.println("¿Desea repetir? S/N");
                  letra = entrada.next().charAt(0);
                break;
            }
        }while (letra == 'S' || letra == 's');
    }

    public void llamada(){
        System.out.println("Ingresa tu numero de telefono");
        num = entrada.next();
        System.out.println("Que tipo de llamada local desea realizar");
        System.out.println("1. Nacional");
        System.out.println("2. Internacional");
        System.out.println("3. Celular");
        tipo = entrada.nextInt();

        switch(tipo){
        case 1:
                try {
                    System.out.println("Ingrese la cantidad de minutos que durara la llamada");
                    minutos = entrada.nextInt();
                    precio = minutos * 0.5;
                    System.out.println("El precio de la llamada es de " + precio);
                } catch (Exception e) {
                    System.out.println("Dato no valido");
                    letra = entrada.next().charAt(0); 
                } 
            System.out.println("¿Desea repetir? S/N");
            letra = entrada.next().charAt(0); 
            break;
        case 2:
            try {
            System.out.println("Ingrese la cantidad de minutos que durara la llamada");
            minutos = entrada.nextInt();
            precio = minutos * 0.6;
            System.out.println("El precio de la llamada es de " + precio);
            } catch (Exception e) {
                System.out.println("Dato no valido");
                letra = entrada.next().charAt(0); 
            }
            System.out.println("¿Desea repetir? S/N");
            letra = entrada.next().charAt(0);
            break;
        case 3:
            try {
                System.out.println("Ingrese la cantidad de minutos que durara la llamada");
            minutos = entrada.nextInt();
            precio = minutos * 0.2;
            System.out.println("El precio de la llamada es de " + precio);
            } catch (Exception e) {
                System.out.println("Dato no valido");
                letra = entrada.next().charAt(0); 
            }
             System.out.println("¿Desea repetir? S/N");
            letra = entrada.next().charAt(0);
            break;
        }
    }

    public void credito() {
        System.out.println("Elija una opcion");
        System.out.println("1. Ingresar credito");
        System.out.println("2. Consultar credito");
        op = entrada.nextInt();

        switch(op){
            case 1:
                try {
                System.out.println("Cuanto credito va a ingresar");
                credito = entrada.nextDouble();
                
                } catch (java.util.InputMismatchException e) {
                System.out.println("Dato no valido");
               letra = entrada.next().charAt(0); 
                }
            System.out.println("¿Desea repetir? S/N");
              letra = entrada.next().charAt(0);
                break;
            case 2:
                credito = credito - precio;
                System.out.println("Su credito es de " + credito);
                System.out.println("¿Desea repetir? S/N");
                letra = entrada.next().charAt(0);
                break;
        }
    }
}