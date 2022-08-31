Algoritmo calificaciones
	Escribir "Desarrolle un algoritmo que permita convertir calificaciones numericas a letras"
	nota <- 0
	Repetir
	Escribir "Ingresa la calificacion numerica"
	Leer nota
	Si nota > 20 Entonces
		Escribir "No se aceptan numeros tan grandes"
	SiNo
		Si nota >=19 y nota <= 20 Entonces 
			Escribir "Tu nota es A"
		SiNo
			Si nota >= 16 y nota <= 18 Entonces
				Escribir "Tu nota es B"
			SiNo
				Si nota >= 13 y nota <= 15 Entonces
					Escribir "Tu nota es C"
				SiNo
					Si nota >= 10 y nota <= 12 Entonces
						Escribir "Tu nota es de D"
					SiNo
						Si nota >= 1 y nota <= 9 Entonces
							Escribir "Tu nota es E"
						SiNo
							Escribir "no negativos"
							
						FinSi
						
					FinSi
					
				FinSi
				
			FinSi
		FinSi
		
		
	FinSi
	Hasta que nota = 0
FinAlgoritmo
