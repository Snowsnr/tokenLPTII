import java.util.Scanner;
class Conversor {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    double k, c, r, f, numo;
    int num;
    char opcion;
    
//No se si las conversiones son correctas, las saqué de google xdd
    System.out.println("Escriba la cantidad");
    numo = entrada.nextInt();
    System.out.println("Escriba 1 si quiere convertir celsius, 2 si quiere convertir kelvin, 3 si quiere convertir rankine, 4 si quiere convertir farenheit");
    num = entrada.nextInt();
    
    if (num == 1 || num == 2 || num == 3 || num == 4){
    switch (num) {
      case 1: 
      System.out.println("Escriba R para convertir a rankine, escriba K para convertir a kelvin, escriba F si quiere convertir a Farenheit");
        opcion = entrada.next().charAt(0);
        if (opcion == 'R'|| opcion == 'r'){
          r = (numo*1.8)+491.67;
          System.out.println("Son: "+r +"grados rankine");
        }
        if (opcion == 'K'||opcion=='k'){
          k = numo + 273.15;
          System.out.println("Son "+k +"grados kelvin");
        }
          if (opcion == 'F'|| opcion == 'f'){
          f = (numo*1.8)+32;
          System.out.println("Son: "+f +"grados farenheit");
          
        }
      break;
      case 2:
        System.out.println("Escriba R para convertir a rankine, escriba C para convertir a celsius, escriba F si quiere convertir a Farenheit");
         opcion = entrada.next().charAt(0);
        if (opcion == 'R'|| opcion == 'r'){
          r = numo*1.8;
          System.out.println("Son: "+r +"grados rankine");
        }
        if (opcion == 'C'|| opcion == 'c'){
          c = numo - 273.15;
          System.out.println("Son: "+c +"grados celsius");
        }
        if (opcion == 'F'|| opcion == 'f'){
          f = ((numo-273.15)*1.8)+32;
          System.out.println("Son: "+f +"grados farenheit");
          
        }
        break;
      case 3:
        System.out.println("Escriba K para convertir a kelvin, escriba C para convertir a celsius, escriba F para convertir a farenheit");
        opcion = entrada.next().charAt(0);
        if (opcion == 'K'|| opcion == 'k'){
          k = numo/1.8;
          System.out.println("Son: "+k +"grados kelvin");
        }
        if (opcion == 'C'|| opcion == 'c'){
          c = (numo/1.8)-491.67;
          System.out.println("Son: "+c +"grados celsius");
        }
        if (opcion == 'F'|| opcion == 'f'){
          f = numo-459.67;
          System.out.println("Son: "+f +"grados farenheit");
          
        }
        break;
      case 4:
         System.out.println("Escriba K para convertir a kelvin, escriba C para convertir a celsius, escriba R para convertir a rankine");
        opcion = entrada.next().charAt(0);
        if (opcion == 'K'|| opcion == 'k'){
          k = ((numo-32)/1.8)+273.15;
          System.out.println("Son: "+k +"grados kelvin");
        }
        if (opcion == 'C'|| opcion == 'c'){
          c = (numo-32)/1.8;
          System.out.println("Son: "+c +"grados celsius");
        }
          if (opcion == 'R'|| opcion == 'r'){
          r = numo - 459.6;
          System.out.println("Son: "+r +"grados rankine");
          }
        break;
    }
    }else{
      System.out.println("Dato no valido");
    }
  }
}