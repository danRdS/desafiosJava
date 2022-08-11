package desafios_avancados_em_java;

import java.util.Scanner;

public class AreaSuperior {

	public static void main(String[] args) {
		//�rea Superior

		/*
		Leia um caractere mai�sculo, que indica uma opera��o que deve ser realizada e
		uma matriz M[12][12]. Em seguida, calcule e mostre a soma ou a m�dia
		considerando somente aqueles elementos que est�o na �rea superior da matriz,
		conforme ilustrado abaixo (�rea verde).
		vide arquivo em assets area-superior.png
		� Entrada
		A primeira linha de entrada cont�m um caractere �nico Mai�sculo O ('S' ou 'M'),
		indicando a opera��o (Soma ou M�dia) que deve ser realizada com os elementos
		da matriz. Seguem 14 valores ponto flutuante de dupla precis�o que atende com garantia
		uma matriz.
		� Sa�da
		Imprima o resultado solicitado (a soma ou m�dia), com 1 casa ap�s o ponto
		decimal.
		*/ 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("C�lculo ser� soma ou m�dia(s/m)? ");
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
