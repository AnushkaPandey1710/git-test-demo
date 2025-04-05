package programming.stream.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import programming.stream.example.Employee;

public class MapSortDemo {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("eight", 8);
		map.put("four", 4);
		map.put("two", 2);
		map.put("ten", 10);
		map.put("seven", 7);
		List<Entry<String, Integer>> entries= new ArrayList<>(map.entrySet());
		Collections.sort(entries, (o1,o2)-> o1.getKey().compareToIgnoreCase(o2.getKey()));
			
		
		for(Entry<String, Integer> entry:entries) {
			System.out.println(entry.getKey()+" " + entry.getValue());
		}
		
		map.entrySet().stream().sorted(Map.Entry.<String,Integer>comparingByKey().reversed()).forEach(System.out::println);
		
		
		Map<Employee, Integer> empMap = new TreeMap<>((o1,o2)->(int) (o1.getSalary()-o2.getSalary()));
		System.out.println(empMap);
		empMap.put(new Employee("Anushka", "Technology", 4000000), 60);
		empMap.put(new Employee("Roshan", "IT", 4000000), 90);
		empMap.put(new Employee("Bikash", "Sales", 4000000), 50);
		empMap.put(new Employee("Rahul", "Cyber", 4000000), 100);
		empMap.put(new Employee("Prakash", "Ast", 4000000), 72);
		
		empMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary))).forEach(System.out::println);
	}
}
