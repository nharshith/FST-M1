package activities;

public class Activity8 {

	public static void main(String[] args) {
		try {
			Activity8.exceptionTest("Will print to console");
			Activity8.exceptionTest(null);
		} catch (CustomException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void exceptionTest(String message) throws CustomException {
		if(message == null) {
			throw new CustomException("String is null");
		}
		else {
			System.out.println(message);
		}
	}
}
