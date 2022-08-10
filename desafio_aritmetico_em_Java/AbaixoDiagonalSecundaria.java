package desafio_aritmetico_em_Java;

import java.util.Locale;
import java.util.Scanner;

public class AbaixoDiagonalSecundaria {

	public static void main(String[] args) {
		/*// Abaixo da Diagonal Secundária

			/*
			Leia um caractere maiúsculo, que indica uma operação que deve ser realizada e
			uma matriz M[12][12]. Em seguida, calcule e mostre a soma ou a média
			considerando somente aqueles elementos que estão abaixo da diagonal Secundária
			da matriz, conforme ilustrado abaixo (área verde).
			vide arquivo em assets abaixo-diagonal-secundaria.png
			• Entrada
			A primeira linha de entrada contém um caractere único Maiúsculo O ('S' ou 'M'),
			indicando a operação (Soma ou Média) que deve ser realizada com os elementos
			da matriz. Seguem os valores de ponto flutuante que variam1 a matriz.
			• Saída
			Imprima o resultado solicitado (a soma ou média), com 1 casa após o ponto
			decimal.
			*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Cálculo será soma ou média(s/m)? ");
		char O = sc.next().toLowerCase().charAt(0);
		
		System.out.println(O);
		
		double M[][] = new double[4][4];
		
		for(int i=0; i<M.length; i++) {
			for(int j=0; j<M.length;j++) {
				M[i][j] = sc.nextDouble();
			}
		}
		
		double soma = 0;
		
		for(int i=1; i<M.length; i++){
			for(int j=1; j<=i; j++) {
			soma += M[i][M.length-j];	
			} 
		}
		
		if(O == 'm') {
			soma /= ((M.length * M.length)-M.length)/2;
		}
		
		System.out.println("\n" + String.format("%.1f", soma));
		
		
		sc.close();
	}

}
