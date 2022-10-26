import java.util.Scanner;
class Descuentos{	
	public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);
		int e = 0;
		char socio = ' ';
		int precio = 0;
		float total = 0;
		
		
		System.out.println("Introduzca su edad");
		e = entrada.nextInt();
		System.out.println("");
		System.out.println("Escriba el precio del producto");
		precio = entrada.nextInt();
		
		if(e > 65){
			total = (precio - (precio * .40f));
		}			
		else{
			if(e < 21)
			{
				System.out.println("¿Tus padres son socios socios? 1 para Si, 2 para No");			
				socio = entrada.next().charAt(0);
        if(socio==1||socio==2){
				switch(socio)
				{
				
				case 1:
					total = (precio - (precio * .45f));
				break;
				case 2:
					total = (precio - (precio * .25f));
				break;
				
        }
				}else{
        System.out.println("Dato no valido");
        }
			}
			else
			{
			total = precio;
			}
		}
			
	System.out.println("El total es: " + total);
		
	}
}