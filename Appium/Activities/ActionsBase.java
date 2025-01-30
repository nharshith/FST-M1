package activities;

import static java.time.Duration.ofMillis;
import static org.openqa.selenium.interactions.PointerInput.MouseButton.LEFT;
import static org.openqa.selenium.interactions.PointerInput.Origin.viewport;

import java.util.Arrays;

import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.PointerInput.Kind;
import org.openqa.selenium.interactions.Sequence;

import io.appium.java_client.AppiumDriver;

public class ActionsBase {
	
	// Create pointer
	static final PointerInput pointer = new PointerInput(Kind.TOUCH, "finger");
	// Create action function
	public static void doSwipe(AppiumDriver driver, Point start, Point end, int duration) {
		// Create sequence of actions
		Sequence swipe = new Sequence(pointer, 1)
				.addAction(pointer.createPointerMove(ofMillis(0), viewport(), start.getX(), start.getY()))
				.addAction(pointer.createPointerDown(LEFT.asArg()))
				.addAction(pointer.createPointerMove(ofMillis(duration), viewport(), end.getX(), end.getY()))
				.addAction(pointer.createPointerUp(LEFT.asArg()));
		
		// Perform actions
		driver.perform(Arrays.asList(swipe));
	}
}
