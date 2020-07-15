package com.prac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Customer {
	
	private String name;
	private int age;
	List<Integer> phoneNumber;
	
	
	
	public Customer() {
		super();
	}

	public Customer(String name, int age, List<Integer> phoneNumber) {
		super();
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Integer> getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(List<Integer> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	
	public static void main(String[] args) {
		Customer c=new Customer();
		Customer customer1=new Customer("Dev",25,Arrays.asList(1,2,3));
		Customer customer2=new Customer("Virat",26,Arrays.asList(4,5));
		Customer customer3=new Customer("Rohit",27,Arrays.asList(6,7));
		Customer customer4=new Customer("Abhi",28,Arrays.asList(8,9));
		Customer customer5=new Customer("Anuraag",29,Arrays.asList(410,11));
		
		List<Customer> customerList=new ArrayList<>();
		customerList.add(customer1);
		customerList.add(customer2);
		customerList.add(customer3);
		customerList.add(customer4);
		customerList.add(customer5);
		
		// create object of optional class
		Optional<Customer> emptyOpt= Optional.empty();
		Optional<Customer> valueOfOpt= Optional.of(customer1);
		Optional<Customer> nullOrNotNullOpt = Optional.ofNullable(customer1);
		Optional<Customer> opt= Optional.of(new Customer());
		
		String name="Ram";
		Optional<String> opt1 = Optional.ofNullable(name);

		
		
		List<Integer> list=customer1.getPhoneNumber();
		Optional<Customer> customerOpt=findCustomer(customerList, "Rohit");
		
		if(customerOpt.isPresent()) {
			Customer customer=customerOpt.get();
			System.out.println(customerOpt.get().getName() +"  "+customer.getAge() +" "+customer.getPhoneNumber().get(0));
		}
		else {
			System.out.println("There is no customer with name Rohit");
		}
		
		//orElse
		String str=null;
		String name1=Optional.ofNullable(str).orElse("Not found");
		System.out.println("orElse: "+ name1);
	}
	
	public static Optional<Customer> findCustomer(List<Customer> customerList, String name){
		for(Customer c: customerList) {
			if(c.getName().equalsIgnoreCase(name)) {
				return Optional.of(c);
			}
		}
		return Optional.empty();
	}		
			

	
}
