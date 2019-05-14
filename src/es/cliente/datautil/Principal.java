package es.cliente.datautil;

import java.util.Scanner;

import es.datautil.Data;
import es.datautil.Meses;

public class Principal {

	public static void main(String[] args) {
		
		/*
		   IMPLEMENTAR 
		   
		   
		   Acrescente uns Prints para Feeedback e para mostrar os resultados
		  
		   LER numero do mês
		   Converte numero do mês para um objecto do enumerado Meses e guarda na variável mes
		   
		   Se mes igual a MESES.FEVEREIRO
		     então
		        LER ano
		        Invocar método classe Data para obter o número de dias do mês
		     senão
		        Invocar método classe Data para obter o número de dias do mês
		        
		   Fim_SE
		   
		
	    */ 
		
		Scanner lerS = new Scanner(System.in);
		
		System.out.println("Indique o número do mês:");
		int numeroMes = lerS.nextInt();
		Meses mes = Meses.mesFromInt(numeroMes);
		if(numeroMes != 2) {
			System.out.println("O mês tem: " + Data.diasMes(mes));
		} else {
			System.out.println("Indique o ano:");
			int ano = lerS.nextInt();
			System.out.println("O mês tem: " + Data.diasMes(mes, ano));
		}
		
		
		
		
		
		
	}

}
