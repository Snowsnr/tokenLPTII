import java.util.Scanner;
public class Persona{
    int nc;
    int ano;
    int edad;
    Scanner entrada = new Scanner(System.in);
   public void pedirdatos() { 
     try{       
      System.out.println("Introduzca su ano de nacimiento");
      nc = entrada.nextInt();
      System.out.println("Intruzca el ano en el que esta");
      ano = entrada.nextInt();
      calculardatos();
      }catch (Exception e) {
      System.out.println("Dato no valido");
     }
    }
    public void calculardatos() {
      if(nc>=1920 & nc<= 2022 & ano>=2022){
       edad = ano - nc;
       System.out.println("La edad es de " + edad);
      }else{
        System.out.println("Introduciste datos no validos por favor intenta otra vez");
      }
    }
}