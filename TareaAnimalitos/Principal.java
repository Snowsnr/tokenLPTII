import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        char letra;
        Scanner entrada = new Scanner (System.in);
        do{
        Datos datos = new Datos();
        datos.menu();
        System.out.println("¿Deseas repetir? S/N");
        letra = entrada.next().charAt(0);
        }while(letra == 's'||letra=='S');

        
    }
}
