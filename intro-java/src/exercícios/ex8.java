package exercícios;
import java.util.ArrayList;
public class ex8 {

	public static void main(String[] args) {

		ArrayList<String>frutas = new ArrayList<>();
		frutas.add("banana");
		frutas.add("maçã");
		frutas.add("melancia");
		frutas.add("kiwi");
		frutas.add("laranja");
		frutas.add("tangerina");
		frutas.add("coco");
		frutas.add("alface");
		frutas.add("melão");
		frutas.add("carambola");
		
		for (String string : frutas) {
			System.out.println(string);
		}
		System.out.println("O ultimo item da lista é:" + frutas.get(9));
		
		
		
		
		
	}

}
/*8. Crie uma lista (ArrayList) de String. Preencha esta lista com 10 elementos utilizando o método nativo
add() usando um for array. Em seguida, exiba no console os dados da lista (um a um) usando foreach, além
de exibir também o tamanho da lista (método size()). Além disso, exiba apenas o último elemento
acessando-o diretamente.*/