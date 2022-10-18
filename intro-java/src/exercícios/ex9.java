package exercícios;

public class ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Double calculaAbastecimento(Double qtdLitros, Double precoLitro) {
		if(qtdLitros == null) {
			System.out.println("ERRO! VALOR INVÁLIDO");
		}
		return qtdLitros * precoLitro;
	}
}
/*Escreva um método responsável por calcular o abastecimento de um veículo. O método deve retornar o
valor total a ser pago a partir do precoLitro e quantidadeLitros. Utilize wrapper classes do Java para os
tipos usados e valide - utilizando controle de fluxo - caso valores nulos sejam fornecidos para precoLitro e
quantidadeLitros. Você deve apenas fazer um método. A sua classe Java não pode ter o método main(),
apenas este método.*/
