package activities;

import java.util.ArrayList;

public class Activity9 {
	
	public static void main(String[] args) {
		ArrayList<String> myList = new ArrayList<String>();
		String expectedName = "Alex";
		myList.add("Akshay");
		myList.add("Bharath");
		myList.add("Alex");
		myList.add("Virat");
		myList.add("Suraj");
		
		for (String name : myList) {
			System.out.println(name);
		}
		
		System.out.println("Third name in the list: "+myList.get(2));
		
		if(myList.contains(expectedName)) {
			System.out.println("Expected name "+expectedName+" exists in the list");
		}else {
			System.out.println("Expected name "+expectedName+" does not exists in the list");
		}
		
		System.out.println("Number of names in the list: "+myList.size());
		myList.remove("Alex");
		System.out.println("Number of names in the list after deletion: "+myList.size());
	}
}
