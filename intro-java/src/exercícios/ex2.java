package exercícios;
import java.util.Scanner;
public class ex2 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		System.out.println("Escreva seu nome:");
		String nome = leitura.nextLine();
		System.out.println("Digite sua idade:");
		Integer idade = Integer.valueOf(leitura.nextLine());
		System.out.println(nome+" tem "+idade+" anos");
	}

}
