package es.cliente.datautil;

import java.util.Scanner;

import es.datautil.Data;
import es.datautil.Meses;

public class Principal {

	public static void main(String[] args) {
		
		/*
		   IMPLEMENTAR 
		   
		   
		   Acrescente uns Prints para Feeedback e para mostrar os resultados
		  
		   LER numero do m�s
		   Converte numero do m�s para um objecto do enumerado Meses e guarda na vari�vel mes
		   
		   Se mes igual a MESES.FEVEREIRO
		     ent�o
		        LER ano
		        Invocar m�todo classe Data para obter o n�mero de dias do m�s
		     sen�o
		        Invocar m�todo classe Data para obter o n�mero de dias do m�s
		        
		   Fim_SE
		   
		
	    */ 
		
		Scanner lerS = new Scanner(System.in);
		
		System.out.println("Indique o n�mero do m�s:");
		int numeroMes = lerS.nextInt();
		Meses mes = Meses.mesFromInt(numeroMes);
		if(numeroMes != 2) {
			System.out.println("O m�s tem: " + Data.diasMes(mes));
		} else {
			System.out.println("Indique o ano:");
			int ano = lerS.nextInt();
			System.out.println("O m�s tem: " + Data.diasMes(mes, ano));
		}
		
		
		
		
		
		
	}

}
