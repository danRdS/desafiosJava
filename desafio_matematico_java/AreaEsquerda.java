package desafio_matematico_java;

import java.util.Locale;
// �rea Esquerda

/*
		Leia um caractere mai�sculo, que indica uma opera��o que deve ser realizada e
		uma matriz M[12][12]. Em seguida, calcule e mostre a soma ou a m�dia
		considerando somente aqueles elementos que est�o na �rea esquerda da matriz,
		conforme ilustrado abaixo (�rea verde).
		vide arquivo em assets area-esquerda.png
		- Entrada
		A primeira linha de entrada contem um �nico caractere Mai�sculo O ('S' ou 'M'),
		indicando a opera��o (Soma ou M�dia) que dever� ser realizada com os elementos
		da matriz. Seguem os 144 valores de ponto flutuante que comp�em a matriz.
		- Sa�da
		Imprima o resultado solicitado (a soma ou m�dia), com 1 casa ap�s o ponto
		decimal.
 */
import java.util.Scanner;

public class AreaEsquerda {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Calculo ser� soma ou m�dia(S/M)? ");
		char O = sc.next().toUpperCase().charAt(0);
		
		double M[][] = new double[12][12];
		
		for(int i=0; i<M.length; i++) {
			for(int j=0; j<M.length; j++) {
				M[i][j] = sc.nextDouble();
			}
		}
		
		double soma = 0.0;
		for(int i=0; i<M.length; i++) {
			for(int j=0; j<M.length/2;j++) {
				soma += M[i][j];
			}
		}
		if(O == 'M') soma /= (M.length * M.length)/2;
		
		System.out.println(String.format("\n%.1f", soma));
		
		sc.close();

	}

}
