// A Mudança

/*
vide arquivo em assets mudanca.png
Hermione está criando um novo Vira Tempo especialmente para programadores. É
impressionante as vantagens que ele oferece e o conforto pra codar que ele tem.
O artefato ainda está em desenvolvimento e ele prometeu consertar os bugs e
colocar uns apetrechos melhores e, em troca, pediu um sistema simples para o
modo Standy Bay. O problema é que o artefato por si só sempre tem o ângulo de
inclinação do Sol/Lua (de 0 a 360). Valendo um Vira Tempo, caso deseja aceitar:
dada em grau da inclinação do Sol/Lua, informe em qual período do dia ele se
encontra.
•	Entrada
A entrada contém um número inteiro M (0 ≤ M ≤ 360) representando o grau do
Sol/Lua. Como a posição muda constantemente seu programa receberá diversos
casos a cada segundo (EOF).
•	Saída
Imprima uma saudação referente ao período do dia que ele se encontra: "Boa
Tarde!!", "Boa Noite!!", "Bom Dia!!" e "De Madrugada!!".
*/
package desafios_avancados_em_java;

import java.util.Scanner;

public class A_mudanca {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe um número: ");
		while(sc.hasNext()) {
			int M = sc.nextInt();
			if(M>=0 && M <=90) {
				System.out.println("Bom Dia!!");
			}
			else if(M>90 &&  M<=180) {
				System.out.println("Bom Tarde!!");
			}
			else if(M>180 && M<=270) {
				System.out.println("Boa Noite!!");
			}
			else if(M>270 && M<=360){
				System.out.println("De madrugada!!");
			}
			else {
				System.out.println("Número inválido!! Informe um número entre 0 e 360!!");
			}
			System.out.print("\nInforme um número: ");
			
		}
		
		sc.close();

	}

}
