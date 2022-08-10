// Abaixo da Diagonal Principal

/*
Leia um caractere mai�sculo, que indica uma opera��o que deve ser realizada e
uma matriz M[12][12]. Em seguida, calcule e mostre a soma ou a m�dia
considerando somente aqueles elementos que est�o abaixo da diagonal principal
da matriz, conforme ilustrado abaixo (�rea verde).
 
vide arquivo em assets abaixo-diagonal-principal.png
� Entrada
A primeira linha de entrada cont�m um caractere �nico Mai�sculo O ('S' ou 'M'),
indicando a opera��o (Soma ou M�dia) que deve ser realizada com os elementos
da matriz. Seguem os valores de ponto flutuante que variam1 a matriz.
� Sa�da
Imprima o resultado solicitado (a soma ou m�dia), com 1 casa ap�s o ponto
decimal.
*/

package desafio_aritmetico_em_Java;

import java.util.Locale;
import java.util.Scanner;

public class AbaixoDiagonalPrincipal {

	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Calculo ser� soma ou m�dia(S/M)? ");
		char O = sc.next().toUpperCase().charAt(0);
		System.out.println("\n" + O);
		
		double M[][] = new double[12][12];
		
		for(int i=0; i<12; i++) {
			for(int j=0; j<12; j++) {
				M[i][j] = sc.nextDouble();
			}
		}
		double soma = 0.0;
		
		for(int i=1; i<12; i++) {
			for(int j=0; j<i; j++) {
				soma += M[i][j];
			}
		}
		
	    if (O == 'M') soma /= ((M.length * M.length) - 3) / 2;
		
		System.out.println(String.format("\n%.1f", soma));
		
		sc.close();

	}

}
