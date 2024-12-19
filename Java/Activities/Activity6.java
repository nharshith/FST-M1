package activities;

public class Activity6 {

	public static void main(String[] args) throws InterruptedException {
		Plane plane = new Plane(10);
		
		plane.onboard("Akash");
		plane.onboard("Bharath");
		plane.onboard("Sharath");
		plane.onboard("Virat");
		
		System.out.println("Plane take off time "+plane.takeOff());
		System.out.println("List of Passengers "+plane.getPassengers());
		Thread.sleep(5000);
		plane.land();
		System.out.println("Plane landing time "+plane.getLastTimeLanded());
	}
}
