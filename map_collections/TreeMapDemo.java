package map_collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap tm = new TreeMap((o1,o2)->(Integer)o2-(Integer)o1);
		tm.put(1,"Hi");
		tm.put(2, 85);
		tm.put(6, null);
		tm.put(7, 't');
		
		//for custom
		
		TreeMap<String,List<String>> map = new TreeMap<>();
		List<String> l1 = Arrays.asList("Hyd","Bang","Kol");
		List<String> l2 = Arrays.asList("Bih","Gwa","Bhp");
		List<String> l3 = Arrays.asList("J&K","Assam","Sky");
		
		map.put("SBI", l1);
		map.put("ICICI", l2);
		map.put("CBI", l3);
		
		System.out.println(map);
		
		Set<String> s = map.keySet();	
		Iterator<String> itr = s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		Collection<List<String>> c = map.values();
		Iterator<List<String>> itr1 = c.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		Set<Entry<String,List<String>>> s1 = map.entrySet();
		Iterator<Entry<String, List<String>>> itr2 = s1.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		
		for(Entry<String,List<String>> e:s1) {
			System.out.println(e.getKey()+"--->"+e.getValue());
		}

	}
}
