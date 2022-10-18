package exercícios;

public class ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String vetorfrutas[] = new String[10];
		vetorfrutas[0] = ("banana");
		vetorfrutas[1] = ("maçã");
		vetorfrutas[2] = ("abóbora");
		vetorfrutas[3] = ("abacaxi");
		vetorfrutas[4] = ("limão");
		vetorfrutas[5] = ("melão");
		vetorfrutas[6] = ("kiwi");
		vetorfrutas[7] = ("jaca");
		vetorfrutas[8] = ("milho");
		vetorfrutas[9] = ("cenoura");

		System.out.println("A quantidade de frutas no vetor:" + vetorfrutas.length);
		System.out.println("A ultima fruta do vetor:" + vetorfrutas[9]);
	}

}
/*
 * Crie um vetor de String de tamanho 10 (dez) com valores pré-definidos. Você
 * não deve usar Scanner. Em seguida, exiba no console os dados do vetor (um a
 * um) e o tamanho dele. Além disso, exiba apenas o último elemento acessando-o
 * diretamente.
 */