package activities;

public class MountainBike extends Bicycle {
	
	int seatHeight;
	public MountainBike(int gears, int speed, int height){
		super(gears, speed);
		seatHeight = height;
	}
	
	public void setHeight(int height) {
		seatHeight = height;
		System.out.println("Seat Height set to "+height);
	}
	
	public void bicycleDesc() {
		super.bicycleDesc();
		System.out.println("Current Seat Height: "+seatHeight);
		System.out.println("*********************************************");
	}
}
