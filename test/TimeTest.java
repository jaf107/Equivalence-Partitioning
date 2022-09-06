package test;

import code.Time;
import junit.framework.TestCase;

public class TimeTest extends TestCase {

	public void testA() {
		Time time = new Time(12,40,30);
        assertEquals("12:40:30",time.getTimeString());       
	}
	public void testB() {
		Time time2 = new Time(125,42,30);
		System.out.println(time2.getTimeString());
        assertEquals("Invalid time",time2.getTimeString());       
	}
	

	public void testC() {
        Time time = new Time(12,65,30);
        assertEquals("Invalid time",time.getTimeString());
    }


	public void testD() {
        Time time = new Time(25,65,30);
        assertEquals("Invalid time",time.getTimeString());
    }
	
	public void testE() {
        Time time = new Time(65,40,12);
        assertEquals("Invalid time",time.getTimeString());
    }


	public void testF() {
        Time time = new Time(65,40,25);
    }


	public void testG() {
        Time time = new Time(65,65,12);
        assertEquals("Invalid time",time.getTimeString());
    }


	public void testH() {
        Time time = new Time(65,65,25);
        assertEquals("Invalid time",time.getTimeString());
    }

}
