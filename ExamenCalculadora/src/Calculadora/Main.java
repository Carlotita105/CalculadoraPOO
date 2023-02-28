package Calculadora;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaramos las variables
		int opcion=0;
		int cerrojo=0;
		int Suma, resta, multiplicar, dividir;
		Scanner scanner=new Scanner(System.in); //Creamos el proyecto scanner
		
			
		
		System.out.println("*********MENU********");
		System.out.println("!****(1) SUMA********");
		System.out.println("!****(2) RESTA*******");
		System.out.println("!***(3) MULTIPLICAR**");
		System.out.println("!****(4) DIVIDIR*****");
		System.out.println("**********RESTO******");
		System.out.println("********EXPONENCIAL**");
		System.out.println("**********SALIR*******");
		
		//Solicitamos el numero al usuario y la operacion a realizar
		
				System.out.println("\nIndique dos numero para hacer el calculo");
				System.out.println("Primer numero");
				double num1 = scanner.nextDouble();
				System.out.println("Segundo numero");
				double num2 = scanner.nextDouble();
				
				System.out.println("Selecione una operacion del menu principal");
				
			           opcion = scanner.nextInt();
			    //Realizamos los calculos y mostramos el resultado por pantalla
			           switch (opcion) {
					case 1 -> 
					System.out.println("\\nCalculando...\\nLa resta de ambos numeros es: \" + (num+num2))");
					 case 2 -> 
					 System.out.println("\\nCalculando...\\nLa resta de ambos numeros es: \" + (num-num2))");
					 case 3 -> {	
						 System.out.println("\\nCalculando...\\nLa resta de ambos numeros es: \" + (num*num2))");
						 
						 System.out.println("\nOpcion de menu no valida\nsaliendo de la aplicaion...");
						 
						 //Cerramos el objeto scanner 
						 scanner.close();
		
		
	}

}
		
	
	}
}

