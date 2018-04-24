import java.util.*;

public class Words{
	public static void main(String[] args){
		int contador = 0;
		Scanner teclado = new Scanner(System.in);
		Set words = new HashSet();
		while(teclado.hasNext()){
			contador++;
			words.add(teclado.next());
		}

		System.out.println("Número de palavras "+contador);
		System.out.println("Número de palavras distintas "+words.size());
	}
}