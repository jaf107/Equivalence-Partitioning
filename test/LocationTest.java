package test;

import code.Location;
import junit.framework.TestCase;

public class LocationTest extends TestCase {

	public void testA() {
		Location tempLocation = new Location("bangladesh","dhaka");
//		System.out.println(tempLocation.getLocationString());
		assertEquals("dhaka, bangladesh", tempLocation.getLocationString());
	}
	public void testB() {
		Location tempLocation = new Location("bangladesh","comilla");
		System.out.println(tempLocation.getLocationString());
		assertEquals("Invalid Location", tempLocation.getLocationString());
	}
	public void testC() {
		Location tempLocation = new Location("bangladesh","dhaka");
//		System.out.println(tempLocation.getLocationString());
		assertEquals("dhaka, bangladesh", tempLocation.getLocationString());
	}
	public void testD() {
		Location tempLocation = new Location("bangladesh","dhaka");
//		System.out.println(tempLocation.getLocationString());
		assertEquals("dhaka, bangladesh", tempLocation.getLocationString());
	}
}
