package programming.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StreamDemo {

	public static void main(String[] args) {
		List<String> lists= new ArrayList<>();
		lists.add("Anushka");
		lists.add("Tara");
		lists.add("Sameer");
		lists.add("anamika");
		lists.add("Chandra");
		for(String s:lists) {
			System.out.println(s);
		}
		
		lists.stream().filter((i)->i.startsWith("A")||i.startsWith("a")).forEach(i->System.out.println(i));
		
		//forEach(i->System.out.println(i));
		
		Map<String, Integer> map= new HashMap<>();
		map.put("a", 1);
		map.put("b", 2);
		map.put("c", 3);
		map.put("d", 4);
	
		map.entrySet().stream().filter(k->k.getValue()%2==0).forEach(i->System.out.println(i));
//		map.forEach((key,value)->System.out.println("Key is " + key +" Value is "+ value));
//		map.entrySet().stream().forEach(obj->System.out.println(obj));
	}
	
	
	
	
	
	
}
