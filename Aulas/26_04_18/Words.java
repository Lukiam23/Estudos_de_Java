import java.util.*;

public class Words {

  static public void main(String[] args) {
    Set words = new HashSet();   
    int count=0;

     String texto = "meu texto";

     String [] tokens = texto.split(" ");

     for (int i=0; i< tokens.length; i++) {
        count++;
        words.add(tokens[i]);
     }

/* 
    Scanner teclado = new Scanner(System.in);

    while(teclado.hasNext()){
      count++;
      words.add(teclado.next());
    }
*/
 
   System.out.println("Qtd Palavras       = "+count );
   System.out.println("Palavras Distintas = "+words.size());
  } 

}

