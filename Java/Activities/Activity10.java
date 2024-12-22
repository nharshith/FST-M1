package activities;

import java.util.HashSet;

public class Activity10 {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		String expectedName = "India";
		hs.add("India");
		hs.add("England");
		hs.add("West Indies");
		hs.add("Australia");
		hs.add("New Zealand");
		hs.add("South Africa");
		
		System.out.println("Items in the set:");
		for (String item : hs) {
			System.out.println(item);
		}
		
		System.out.println("Number of items in the set: "+hs.size());
		hs.remove("West Indies");		
		if(hs.remove("Pakistan")) {
        	System.out.println("Pakistan removed from the Set");
        } else {
        	System.out.println("Pakistan is not present in the Set");
        }
		
		if(hs.contains(expectedName)) {
			System.out.println("Expected item "+expectedName+" is present in the set");
		}
		else {
			System.out.println("Expected item "+expectedName+" is not present in the set");
		}
		
		System.out.println("Items in the set after updation: "+hs);
	}
}
