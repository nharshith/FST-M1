package activities;

public class Bicycle implements BicycleParts, BicycleOperations {

	public int gears;
	public int speed;
	
	public Bicycle(int gears, int speed) {
		this.gears = gears;
		this.speed = speed;
	}
	

	public void applyBrake(int decrement) {
		this.speed = this.speed - decrement;
		System.out.println("Speed decreased by "+decrement);
	}

	public void speedUp(int increment) {
		this.speed = this.speed + increment;
		System.out.println("Speed increased by "+increment);
	}
	
	public void bicycleDesc() {
		System.out.println("Number of Gears: " +this.gears);
		System.out.println("Current Speed: " +this.speed);
	}
}
