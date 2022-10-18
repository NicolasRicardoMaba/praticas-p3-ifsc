package exercícios;
import java.util.Scanner;
public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Escreva um número:");
Scanner leitura = new Scanner(System.in);
Integer num = Integer.valueOf(leitura.nextLine());
	if(num % 2==0) {
		System.out.println("O número em questão é par");
	
	}
	else 
		System.out.println("O número em questão é ímpar");
	}

}
