package activities;

public class Activity2 {

	public static void main(String[] args) {
		int arrName[] = {10, 77, 10, 54, -11, 10};
		int expectedSum = 30;
		int number = 10;
				
		System.out.println("Result: " + checkArray(arrName, number, expectedSum));		
	}
	
	public static boolean checkArray(int[] arrName,int number,int expectedSum) {
		int temp = 0;
		for (int i = 0; i < arrName.length; i++) {
			if(arrName[i] == number) {
				temp = temp + arrName[i];
			}
			if (temp > expectedSum) {
				return false;
			}
		}
		return (temp == expectedSum);
	}
}
