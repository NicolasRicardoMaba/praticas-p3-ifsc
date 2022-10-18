package exercicio10;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {

		Scanner leitura = new Scanner(System.in);
		System.out.println("Digite o nome do aluno:");
		String nome = leitura.nextLine();
		System.out.println("Digite a nota 1 do Aluno");
		Float n1 = Float.valueOf(leitura.nextLine());
		System.out.println("Digite a nota 2 do Aluno");
		Float n2 = Float.valueOf(leitura.nextLine());
		System.out.println("Digite a nota 3 do Aluno");
		Float n3 = Float.valueOf(leitura.nextLine());

		Float mf = Float.valueOf(mediafinal(n1, n2, n3));

		if (mf >= 6) {
			System.out.println(nome+" Sua nota final foi de:"+mf);
			System.out.println("Aprovado!");
			
		} else if (mf < 6 && mf >= 4) {
			System.out.println(nome+" Sua nota final foi de:"+mf);
			System.out.println("Recuperação");
		
		} else if (mf <4) {
			System.out.println(nome+" Sua nota final foi de:"+mf);
			System.out.println("Reprovado");
		}
	}

	public static Float mediafinal(Float n1, Float n2, Float n3) {
		Float mf = ((n1 + n2 + n3) / 3);

		return mf;
	}

}
/*
 * Considere um programa a ser feito no console do Eclipse IDE que deve calcular
 * a média final (MF) de apenas um(a) discente. Considere um cálculo aritmético
 * comum com três notas. Utilize tipos primitivos (pense qual tipo mais adequado
 * para notas). Ao final, o programa deve informar: ● Se MF >= 6: Aprovado(a) ●
 * Se MF >= 4 e < 6: Recuperação ● Se MF < 4: Reprovado(a) Observações: Crie um
 * método exclusivo para realizar o cálculo da média. Pense nos parâmetros que o
 * método deve ter. Realizar leitura de dados (nomeAluno e notas) pelo teclado
 * via
 */