import java.util.*;

public class Collectionsframework {
	
	
	public static void main(String[] args) {
		List arrayList = new ArrayList();
		List linkedList = new LinkedList();
		Map hashMap = new HashMap();
		Map linkedHashMap = new LinkedHashMap();
		Map treeMap = new TreeMap();
		Set hashSet = new HashSet();
		Set linkedHashSet = new LinkedHashSet();
		Set treeSet = new TreeSet();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(1);
		arrayList.add(2);
		System.out.println(arrayList);
		arrayList.add(3);
		System.out.println(arrayList);
		arrayList.remove(new Integer(3));
		System.out.println(arrayList);
		linkedList.addAll(arrayList);
		linkedList.add("One");
		System.out.println(linkedList);
		System.out.println(linkedList.indexOf(linkedList.get(linkedList.size() - 1)));
		linkedList.remove(new String("One"));
		System.out.println(linkedList);
		hashMap.put("Suresh", 201);
		hashMap.put("", 202);
		hashMap.put("epam", 203);
		hashMap.put(203, "epam");
		System.out.println(hashMap);
		hashMap.remove("");
		System.out.println(hashMap.keySet());
		linkedHashMap.putAll(hashMap);
		System.out.println(linkedHashMap);
		linkedHashMap.put("Suresh1", 204);
		System.out.println(linkedHashMap);
		System.out.println(linkedHashMap.put("Suresh1", 205));
		linkedHashMap.remove("Suresh1");
		System.out.println(linkedHashMap);
		treeMap.put("231", 123);
		treeMap.put("123", 231);
		treeMap.put("321", 321);
		System.out.println(treeMap);
		hashSet.addAll(arrayList);
		System.out.println(hashSet);
		linkedHashSet.add(1);
		linkedHashSet.add(2);
		linkedHashSet.add(1);
		linkedHashSet.add(3);
		linkedHashSet.add(5);
		System.out.println(linkedHashSet);
		treeSet.add(101);
		treeSet.add(99);
		treeSet.add(108);
		treeSet.add(105);
		System.out.println(treeSet);
	}

}
