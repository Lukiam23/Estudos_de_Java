import java.util.*;
public class SetExample {
	public static void main(String[] args){
		Set set = new HashSet();
		set.add("one");
		set.add("XXX");
		set.add("second");
		set.add("3rd");
		set.add(new Integer(4));
		set.add(new Float(5.0));
		set.add("second"); //duplicado, não será adicionado
		set.add(new Integer(4)); //duplicado, não será adicionado

		System.out.println(set);

                Iterator iter = set.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}


	}
}

