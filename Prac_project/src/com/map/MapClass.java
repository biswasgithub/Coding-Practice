package com.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

class Student2{
	int roll;
	String name;
	
	Student2(int roll, String name){
		this.roll = roll;
		this.name= name;
	}
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null || getClass() != obj.getClass())
			return false;
		
		Student2 s = (Student2)obj;
		System.out.println("Inside equals():  "+this.name +"   "+s.name);
		
		return Objects.equals(roll, s.roll) && Objects.equals(name, s.name);
		// return roll == s.roll && name.equals(s.name);
	}
	
	@Override
	public int hashCode() {
		
		final int prime = 31;
		int result = 1;
		result = prime * result + roll;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
}

public class MapClass {
	
	public static void main(String[] args) {
		
		Student s1=new Student(101,"Ram");
		
		HashMap hmap=new HashMap();
		hmap.put("Mark", 100);
		hmap.put("SMITH", 150);
		hmap.put("Mark", 175);
		System.out.println("HashMap: "+ hmap);
		s1=null;
		System.gc();
		System.out.println("HashMap: "+ hmap);
		
		
		HashMap<Integer, String> map = new HashMap<>();
		
		HashSet<String> friendList = new HashSet<>();
		friendList.add("Rahul");
		friendList.remove("Rahul");
		
		TreeMap<Integer,String> treeMap=new TreeMap<>();
		treeMap.put(3, "Rahul");
		treeMap.put(1, "Ram");
		treeMap.put(4, "John");
		treeMap.put(2, "Shyam");
		
		System.out.println("Tree Map: "+treeMap);
		
		map.put(1,"Ram");
		map.put(2, "Abir");
		map.put(3, "Bibek");
		map.put(null, "Rahul");
		System.out.println(map);
		
		if(map.containsKey(1) && map.containsKey(3)) {
			System.out.println(map.get(3));
			System.out.println("null key: "+map.get(null));
		}
		
		
		//entries using For-Each loop
		Set<Entry<Integer, String>> entrylist = map.entrySet();
		System.out.println("Set:  "+ entrylist);
		for(Entry<Integer, String> m : entrylist) {
			System.out.println(m.getKey()+"  "+ m.getValue());
		}
		
		//Iterating using Iterator.
		Iterator<Map.Entry<Integer, String>> entries=map.entrySet().iterator();
		System.out.println("Entries : "+ entries);
		while(entries.hasNext()) {
			Map.Entry<Integer, String> entry = entries.next(); // using Generices
			System.out.println("with Generices:    key = "+ entry.getKey() +"  value = "+entry.getValue());
			//without Generices
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println("without Generices: key = "+ key +"  value = "+value);

		}
		
		//all Keys
		Set<Integer> allKeys=map.keySet();
		System.out.println("All keys: "+ allKeys);
		//all values
		Collection<String> allValues=map.values();
		System.out.println("All values: "+allValues);
		
		ArrayList<Student2> list = new ArrayList<Student2>();
		Student2 a1 = new Student2(1,"Jhon");
		Student2 a4 = new Student2(1,"Jhon");
		Student2 a2 = new Student2(2, "Akki");
		Student2 a3 = new Student2(3, "Bell");
		
		list.add(a1);
		list.add(a2);
		list.add(a3);
		list.add(a4);
		
		System.out.println(a1.equals(a4));
		
		
		int[] array = { 4, 4, 2, 2, 2, 2, 3, 3, 1, 1, 6, 7, 5 };
		List<Integer> arrList = Arrays.stream(array).boxed().collect(Collectors.toList());
		Map<Integer,Integer> map2= new HashMap<Integer, Integer>(arrList.size());
		
		int count=0;
		//Iterator<Map.Entry<Integer, Integer>> itr=map2.entrySet().iterator();
		for(Integer i: arrList) {
			if(map2.containsKey(i)) {
				map2.put(i, map2.get(i)+1);
			}
			else {
				map2.put(i, 1);
			}
		}
		System.out.println(map2);
		
		Student2 stu1 = new Student2(1,"Jhon");
		Student2 stu2 = new Student2(2, "Akki");
		System.out.println(stu2+"  "+stu2.hashCode());
		stu2.setRoll(3);
		stu2.setName("rahul");
		
		System.out.println(stu2 +"  " +stu2.hashCode());
		
		
		
		List<Number> list5=new ArrayList<>();
		List<Integer> list6=new ArrayList<>();
		addAll(list6);
		
	}
	static void addAll(Collection<? extends Number> t) {
		
	}
	
}
