package exercícios;

import java.util.Scanner;

public class ex6 {
	public static void main(String[] args) {

		Scanner leitura = new Scanner(System.in);
		Integer[] vetor = new Integer[10];
		Integer maior = 0;
		Integer	menor = 100000000;

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.valueOf(leitura.nextLine());
			if (vetor[i] > maior) {
				maior = vetor[i];

			}
			if (vetor[i] < menor) {
				menor = vetor[i];

			}
		}
		System.out.println("O maior número do vetor é:" + maior);
		System.out.println("O menor número do vetor é:" + menor);

	}
}
/*
 * Crie um vetor de tipo int e tamanho 10 (dez). Preencha este vetor via console
 * usando o Scanner em um laço de repetição (for array). Mostre o maior número e
 * o menor número ao final. Não é necessário exibir todo o conteúdo do vetor,
 * apenas o maior e menor número.
 */