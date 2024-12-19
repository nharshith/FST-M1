package activities;

public class Activity7 {
	public static void main(String[] args) {
		MountainBike bike = new MountainBike(5, 25, 5);
		bike.bicycleDesc();
		bike.setHeight(10);
		bike.applyBrake(10);
		bike.bicycleDesc();
		bike.speedUp(8);
		bike.bicycleDesc();
	}
}
