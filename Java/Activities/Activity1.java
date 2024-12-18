package activities;

public class Activity1 {
	public static void main(String[] args) {
		Car tata = new Car();
		
		tata.color = "Black";
		tata.transmission = "Manual";
		tata.make = 2014;
		
		tata.displayCharacteristics();
		tata.accelarate();
		tata.brake();
	}
}
