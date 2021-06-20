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
		
		int digitOpcao;
		
		System.out.println("Ola você quer fazer qual tipo de calculo: \n1 - Soma \n2 - subtração \n3 - multiplicação \n4 - divisão");
		calcular.operador = leia.nextInt();
		
		switch (calcular.operador) {
		
		case 1:
			System.out.println("Digite o preimiro numero que voê deseja calcular:");
			calcular.val_1 = leia.nextFloat();
			System.out.println("Digite o segundo numero:");
			calcular.val_2 = leia.nextFloat();
			
			calcular.resultado = calcular.val_1 + calcular.val_2;
			System.out.println("O resultado da soma é:" + calcular.resultado);
			
			System.out.println("Deseja fazer um novo calculo?\n");
			System.out.println("Digite (1) - Sim\n(2) - Não ");
			digitOpcao = leia.nextInt();
			
			
			break;
			
			
			
			
		case 2:
			System.out.println("Digite o preimiro numero que voê deseja calcular:");
			calcular.val_1 = leia.nextFloat();
			System.out.println("Digite o segundo numero:");
			calcular.val_2 = leia.nextFloat();
			
			calcular.resultado = calcular.val_1 - calcular.val_2;
			System.out.println("O resultado da soma é:" + calcular.resultado);
			
			System.out.println("Deseja fazer um novo calculo?\n");
			System.out.println("Digite: \n(1) - Sim\n(2) - Não ");
			
			
			
			
			break;
			
			
			
		case 3:
			System.out.println(" * ");
			break;	
		case 4:
			System.out.println(" / ");
			break;
		}
		return;
		
		
	}

}
