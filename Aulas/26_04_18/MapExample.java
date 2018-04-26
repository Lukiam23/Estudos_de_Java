import java.util.*;

public class MapExample {
	public static void main(String[] args){

                Vector v = new Vector();
                v.add("Jose");
                v.add("Ana");
                v.add("Maria");

		Map map = new HashMap();
		map.put("a", v);
		map.put("b", "Segundo");
		map.put("c", "Terceiro");
		System.out.println("Valor de a: "+map.get("a"));
		Iterator iter = map.keySet().iterator();
		while(iter.hasNext()){
			Object k = iter.next();
			System.out.println(k+" -> "+map.get(k));
		}
	}
}

