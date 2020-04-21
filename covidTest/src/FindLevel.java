import java.util.*;

public class FindLevel {
	Scanner reader = new Scanner(System.in);
	public void giveLevel(int max) {
		System.out.println("Your max peak flow should be " + max + ".");
		System.out.println("What value did you read on your peak flow meter?");
		double read = reader.nextDouble();
		double percent = read / max;
		if (percent >= .80) {
			System.out.println("You are safe, you don't need to go to the hospital.");
		}
		else if (percent >= .50) {
			System.out.println("Your condition is uncertain, monitor your health closely for the next few days.");
		}
		else {
			System.out.println("You need help right away. Contact a health care provider.");
		}
	}
}
