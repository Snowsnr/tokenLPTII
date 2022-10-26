import java.util.Scanner;
class Binario {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int numb;
    String binario = "";
    
  System.out.println("ingrese el numero positivo entero que desee convertir a binario");
   numb = entrada.nextInt();

  if (numb> 0) {
     while (numb > 0) {
         if (numb % 2 == 0) {
             binario = "0" + binario;
        } else {
             binario = "1" + binario;
               }
        numb = (int) numb / 2;
        }
    } else if (numb == 0) {
      binario = "0";
            } else {
             binario = "\n No se puede convertir el numero ingrese solo positivos";
                    }
  System.out.println("El numero binario es: " + binario);
  }
}