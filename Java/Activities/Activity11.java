package activities;

import java.util.HashMap;
import java.util.Map;

public class Activity11 {

	public static void main(String[] args) {
		Map<Integer,String> colours = new HashMap<Integer, String>();
		colours.put(1, "Blue");
		colours.put(2, "Yellow");
		colours.put(3, "Green");
		colours.put(4, "Orange");
		colours.put(5, "White");
		
		
		System.out.println("Items in the Map: "+colours);
		System.out.println("Original size of the Map: "+colours.size());
		
		System.out.println("Removing colour White: "+colours.remove(5));
		
		if(colours.containsValue("Green")) {
			System.out.println("Green is present in the map");
		}else {
			System.out.println("Green is not present in the map");
		}
		System.out.println("Size of the Map after deletion: "+colours.size());
		System.out.println("Items in the Map after deletion: "+colours);
	}
}