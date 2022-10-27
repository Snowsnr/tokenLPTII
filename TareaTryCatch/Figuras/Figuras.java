import java.util.Scanner;

public class Figuras{
    double lado, altura, base, base2, altura2, area, perimetro, lado2, lado3, radio;
    int opcion;
    char letra;
    Scanner entrada = new Scanner(System.in);
    public void menu() {
        do {
            System.out.println("Programa de calculo de areas y perimetros");
            System.out.println("Elija una opcion");
            System.out.println("1. Cuadrado");
            System.out.println("2. Triangulo rectangulo");
            System.out.println("3. Circulo");
            System.out.println("4. Rectangulo");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    calcularCuadrado();
                    break;
                case 2:
                   calcularTriangulo();
                    break;
                case 3:
                    calcularCirculo();
                    break;
                case 4:
                    calcularRectangulo();
                    break;
                default:
            }
            System.out.println("Desea repetir el programa, S para repetir");
            letra = entrada.next().charAt(0);
        } while (letra == 's' || letra == 'S');
    }

    public void calcularCuadrado() {
        
            try {
                System.out.println("Ingrese el valor del lado del cuadrado");
                lado = entrada.nextDouble();
              if(lado>0){
                perimetro = lado * 4;
                area = lado * lado;
                System.out.println("El perimetro es de: " + perimetro + " el area es de: " + area);
              }else{
                System.out.println("Ingrese solo numeros positivos");
              }
            } catch (Exception e) {
                System.out.println("Ingrese solo numeros");
               letra = entrada.next().charAt(0);
            }
        
    }
  public void calcularCirculo(){
    try{
      System.out.println("Ingrese el radio del circulo");
      radio = entrada.nextDouble();
      if(radio>0){
        area= 3.1416*(radio*radio);
        perimetro = 2*radio*3.1416;
        System.out.println("El perimetro es de: "+perimetro+" El area es de: "+area);
      }else{
        System.out.println("Ingrese solo numeros positivos");
      }
    }catch(Exception e){
      System.out.println("Ingrese solo numeros");
      letra = entrada.next().charAt(0);
    }
  }
  public void calcularTriangulo(){
    try{
      System.out.println("Ingrese la base del triangulo");
      base = entrada.nextDouble();
      System.out.println("Ingrese la medida de un lado");
      lado2 = entrada.nextDouble();
      System.out.println("Ingrese la medida del ultimo lado");
      lado3 = entrada.nextDouble();
      System.out.println("Ingrese la altura del triangulo");
      altura = entrada.nextDouble();
      if(base>0 & altura>0 & lado2>0 & lado3>0){
        area= (base*altura)/2;
        perimetro = base+lado2+lado3;
        System.out.println("El perimetro es de: "+perimetro+" El area es de: "+area);
      }else{
        System.out.println("Ingrese solo numeros positivos");
      }
    }catch(Exception e){
      System.out.println("Ingrese solo numeros");
      letra = entrada.next().charAt(0);
    }
  }
  public void calcularRectangulo(){
    try{
      System.out.println("Ingrese la base del rectangulo");
      base2 = entrada.nextDouble();
      System.out.println("Ingrese la altura del rectangulo");
      altura2=entrada.nextDouble();
      if(base2>0 & altura2>0){
        area= base2 * altura2;
        perimetro = (base2*2)+(altura2*2) ;
        System.out.println("El perimetro es de: "+perimetro+" El area es de: "+area);
      }else{
        System.out.println("Ingrese solo numeros positivos");
      }
    }catch(Exception e){
      System.out.println("Ingrese solo numeros");
      letra = entrada.next().charAt(0);
    }
  }
}