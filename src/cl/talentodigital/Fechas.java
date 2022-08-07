package cl.talentodigital;

import java.util.Scanner;

public class Fechas {

	public static void main(String[] args) {
		// desafio comparacion de fechas de nacimiento
		
		Scanner sc= new Scanner(System.in); //para que el usuario pueda ingresar datos por teclado
		System.out.println("Ingrese primera fecha de nacimiento, con el siguiente formato: dd/mm/yyyy");
		String fecha1=sc.nextLine();
		System.out.println("Ingrese segunda fecha de nacimiento, con el siguiente formato: dd/mm/yyyy");
		String fecha2=sc.nextLine();
		
		// ya tenemos las fechas como Strig Ahora las separaremos por dia, mes año
		//año
		String anio1= fecha1.substring(6,10); //obtenemos como String el año 1
		//System.out.println(anio1); //imprimimos para verificar
		String anio2= fecha2.substring(6,10); //obtenemos como String el año 1
		//System.out.println(anio2);//imprimimos para verificar
		//mes
		String mes1= fecha1.substring(3,5); //obtenemos como String el mes 1
		//System.out.println(mes1); //imprimimos para verificar
		String mes2= fecha2.substring(3,5); //obtenemos como String el mes 2
		//System.out.println(mes2); //imprimimos para verificar
		//dia
		
		String dia1= fecha1.substring(0,2); //obtenemos como String el dia 1
		//System.out.println(dia1); //imprimimos para verificar
		String dia2= fecha2.substring(0,2); //obtenemos como String el dia 2
		//System.out.println(dia2); //imprimimos para verificar
		
		// ahora pasaremos los String anio, me, dia a numeros 
		// anio
		int numeroAnio1 = Integer.parseInt(anio1); //transformamos el String anio1 a int numero
		//System.out.println(numeroAnio1); //imprimimos para verificar
		int numeroAnio2 = Integer.parseInt(anio2); //transformamos el String anio1 a int numero
		//System.out.println(numeroAnio1); //imprimimos para verificar
		
		// mes
		int numeroMes1 = Integer.parseInt(mes1); //transformamos el String mes1 a int numero
		//System.out.println(numeroMes1); //imprimimos para verificar
		int numeroMes2 = Integer.parseInt(mes2); //transformamos el String mes2 a int numero
		//System.out.println(numeroMes2); //imprimimos para verificar
		
		//dia
		int numeroDia1 = Integer.parseInt(dia1); //transformamos el String dia1 a int numero
		//System.out.println(numeroDia1); //imprimimos para verificar
		int numeroDia2 = Integer.parseInt(dia2); //transformamos el String dia2 a int numero
		//System.out.println(numeroDia2); //imprimimos para verificar
		
		//ahora con los datos listos (numericos) procedemos a calcular quien es mayor
		
		//ocupando el ciclo if-else
		
		
		if(numeroAnio1>numeroAnio2) {
			System.out.println("La persona 2 es mayor");
			
		}else if(numeroAnio2>numeroAnio1) {
			System.out.println("La persona 1 es mayor");
		}
		
		else if(numeroMes1>numeroMes2) {
			System.out.println("La persona 2 es  mayor");
		}else if(numeroMes2>numeroMes1) { 
		   System.out.println("La persona 1 es mayor");
		}else if(numeroDia1>numeroDia2) {
			System.out.println("La persona 2 es mayor");
		}else if(numeroDia2>numeroDia1) {
			System.out.println("La persona 1 es mayor");
		}else {
			System.out.println("Ambas personas tienen la misma edad");
		}
		
		//ahora comento todos los System.out.printIn que no necesito
		// todos los imprimir para verificar
		
		
		
	}

}
