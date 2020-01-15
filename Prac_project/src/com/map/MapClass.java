package com.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
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
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1,"Ram");
		map.put(2, "Abir");
		map.put(3, "Bibek");
		System.out.println(map);
		
		
		//entries using For-Each loop
		Set<Entry<Integer, String>> entrylist = map.entrySet();
		for(Entry<Integer, String> m : entrylist) {
			System.out.println(m.getKey()+"  "+ m.getValue());
		}
		
		//Iterating using Iterator.
		Iterator<Map.Entry<Integer, String>> entries=map.entrySet().iterator();
		while(entries.hasNext()) {
			Map.Entry<Integer, String> entry = entries.next(); // using Generices
			System.out.println("with Generices:    key = "+ entry.getKey() +"  value = "+entry.getValue());
			//without Generices
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println("without Generices: key = "+ key +"  value = "+value);

		}
		
		//all Keys
		System.out.println("All keys: "+map.keySet());
		//all values
		System.out.println("All values: "+map.values());
		ArrayList<Student2> list = new ArrayList<Student2>();
		Student2 a1 = new Student2(1,"Jhon");
		Student2 a4 = new Student2(1,"Jhon");
		Student2 a2 = new Student2(2, "Akki");
		Student2 a3 = new Student2(3, "Bell");
		
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
	}
	
	
}
