package test;
import org.joda.time.LocalTime;
public class B extends SubclassA {

	
public static void main (String [] args) {
		
		B obj1 = new B();
		obj1.test();
		
		LocalTime currentTime = new LocalTime();
	    System.out.println("The current local time is: " + currentTime);

		
	}
}
