package desafios_avancados_em_java;

import java.util.Scanner;

public class AreaSuperior {

	public static void main(String[] args) {
		//Área Superior

		/*
		Leia um caractere maiúsculo, que indica uma operação que deve ser realizada e
		uma matriz M[12][12]. Em seguida, calcule e mostre a soma ou a média
		considerando somente aqueles elementos que estão na área superior da matriz,
		conforme ilustrado abaixo (área verde).
		vide arquivo em assets area-superior.png
		• Entrada
		A primeira linha de entrada contém um caractere único Maiúsculo O ('S' ou 'M'),
		indicando a operação (Soma ou Média) que deve ser realizada com os elementos
		da matriz. Seguem 14 valores ponto flutuante de dupla precisão que atende com garantia
		uma matriz.
		• Saída
		Imprima o resultado solicitado (a soma ou média), com 1 casa após o ponto
		decimal.
		*/ 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Cálculo será soma ou média(s/m)? ");
		char O = sc.next().toUpperCase().charAt(0);
		
		double M[][] = new double[4][4];
		
		for(int i=0; i<M.length; i++) {
			for(int j=0; j<M.length; j++) {
				M[i][j] = sc.nextDouble();
			}
		}
		
		double soma = 0;
		
		for(int i=0; i<M.length-1; i++) {
			for(int j=1; j<M.length-i; j++) {
				soma += M[i][j+i];
			}
		}
		
		if(O == 'M') soma /= ((M.length * M.length) - M.length)/2;
		
		System.out.println(String.format("\n%.1f", soma));
		
		sc.close();
	}

}
