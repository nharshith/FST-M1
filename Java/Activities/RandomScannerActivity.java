package activities;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RandomScannerActivity {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		Random indexGen = new Random();
		
		System.out.println("Enter the numbers: ");
		while(scan.hasNextInt()) {
			list.add(scan.nextInt());
		}
		
		Integer nums[] = list.toArray(new Integer[0]);
		Integer randomIndex = indexGen.nextInt(nums.length);
		System.out.println("Random index generated: "+randomIndex);
		System.out.println("Value at the random index: "+nums[randomIndex]);
		
		scan.close();
	}
}
