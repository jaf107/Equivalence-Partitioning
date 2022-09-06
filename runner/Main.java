package runner;

import code.Location;
import code.Time;

public class Main {

	public static void main(String[] args) {

		Location tempLocation = new Location("bangladesh","Lmao");
//		System.out.println(tempLocation.getLocationString());
		
		Time time = new Time(25,40,30);
      System.out.println(time.getTimeString());
	}

}
