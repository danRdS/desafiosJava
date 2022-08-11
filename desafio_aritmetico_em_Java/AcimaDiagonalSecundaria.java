/* 	Acima da Diagonal Secundária

	Leia um caractere maiúsculo, que indica uma operação que deve ser realizada e
	uma matriz M[12][12]. Em seguida, calcule e mostre a soma ou a média
	considerando somente aqueles elementos que estão acima da diagonal secundária
	da matriz, conforme ilustrado abaixo (área verde).
	vide arquivo em assets acima-diagonal-secundaria.png
	•	Entrada
	A primeira linha de entrada contém um único caractere Maiúsculo O ('S' ou 'M'),
	indicando a operação (Soma ou Média) que deverá ser realizada com os elementos
	da matriz. Seguem os 144 valores de ponto flutuante que compõem a matriz.
	•	Saída
	Imprima o resultado solicitado (a soma ou média), com 1 casa após o ponto
	decimal.
 */
package desafio_aritmetico_em_Java;

import java.util.Locale;
import java.util.Scanner;

public class AcimaDiagonalSecundaria {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Cálculo será soma ou média(s/m)? ");
		char O = sc.next().toUpperCase().charAt(0);
		
		double M[][] = new double[12][12];
		
		for(int i=0; i<M.length; i++) {
			for(int j=0; j<M.length; j++) {
				M[i][j] = sc.nextDouble();
			}
		}
		
		double soma = 0;
		for(int i=0; i<11; i++) {
			for(int j=0; j<11-i; j++) {
				soma += M[i][11-1-i-j];
			}
		}
		
		if(O == 'M') soma /= ((M.length * M.length)-M.length)/2;
		
		System.out.println(String.format("\n%.1f", soma));
		sc.close();

	}

}
