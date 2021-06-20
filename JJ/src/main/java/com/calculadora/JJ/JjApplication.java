package com.calculadora.JJ;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JjApplication {

	public static void main(String[] args) {
		SpringApplication.run(JjApplication.class, args);
		
		calculadora calcular = new calculadora();
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Ola você quer fazer qual tipo de calculo: \n1 - Soma \n2 - subtração \n3 - multiplicação \n4 - divisão");
		calcular.operador = leia.nextInt();
		
		switch (calcular.operador) {
		
		case 1:
			System.out.println(" + ");
			break;
		case 2:
			System.out.println(" - ");
			break;
		case 3:

			System.out.println("Digite o preimeiro valor : ");
			calcular.val_1 = leia.nextFloat();
			
		    System.out.println("Digite o preimeiro valor : ");
			calcular.val_2 = leia.nextFloat();	
			
			calcular.resultado = calcular.val_1 * calcular.val_2;
			
			System.out.println("Seu resultado é " + calcular.resultado);
			
			break;	
		case 4:
			
			System.out.println("Digite o preimeiro valor : ");
			calcular.val_1 = leia.nextFloat();
			
		    System.out.println("Digite o preimeiro valor : ");
			calcular.val_2 = leia.nextFloat();	
			
			calcular.resultado = calcular.val_1 / calcular.val_2;
			
			System.out.println("Seu resultado é " + calcular.resultado);
			break;
		}
		return;
		
	}

}
