import java.util.Scanner;

class NegativosPositivosDeUnaSerie{
	public static void main(String[] args)
	{
		Scanner entrada = new Scanner(System.in);
		int num1, num2, num3, num4, num5, num6, num7;
		int n = 0;
		int p = 0;
				
		System.out.println("Introduzca el primer numero: ");
		num1 = entrada.nextInt();
		System.out.println("Introduzca el segundo numero: ");
		num2 = entrada.nextInt();
		System.out.println("Introduzca el tercer numero: ");
		num3 = entrada.nextInt();
		System.out.println("Introduzca el cuarto numero: ");
		num4 = entrada.nextInt();
		System.out.println("Introduzca el quinto numero: ");
		num5 = entrada.nextInt();
    System.out.println("Introduzca el sexto numero: ");
		num6 = entrada.nextInt();
    System.out.println("Introduzca el septimo numero: ");
		num7 = entrada.nextInt();
		
		int numeros[] = new int[7];
		
		numeros[0] = num1;
		numeros[1] = num2;
		numeros[2] = num3;
		numeros[3] = num4;
		numeros[4] = num5;
    numeros[5] = num6;
    numeros[6] = num7;
		
		for (int k = 0; k < numeros.length; k++){
			if(numeros[k] > 0){
				p++;
			}
			if(numeros[k] < 0){
				n++;
			}
	
		}
		System.out.println("La cantidad de numeros positivos es: "+p);
		System.out.println("La cantidad de numeros negativos es: "+n);
		
	
	}
}