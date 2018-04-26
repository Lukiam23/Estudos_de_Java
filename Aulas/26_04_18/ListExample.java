import java.util.*;
public class ListExample {
	public static void main(String[] args){
		ArrayList set = new ArrayList();
		set.add("one");
		set.add("XXX");
		set.add("second");
		set.add("3rd");
		set.add(new Integer(4));
		set.add(new Float(5.0));
		set.add("second"); //duplicado, não será adicionado
		set.add(new Integer(4)); //duplicado, não será adicionado

		System.out.println(set);
	}
}

