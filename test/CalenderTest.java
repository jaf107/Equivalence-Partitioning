package test;

import junit.framework.TestCase;
import code.Calender;

public class CalenderTest extends TestCase {

	public void testA() {
        Calender date = new Calender(12,"mar",2000);
        assertEquals("12-mar-2000",date.getDateString() );
	}
	
	public void testB() {
	    Calender date = new Calender(12,"mar",2001);
        assertEquals("12-mar-2001",date.getDateString() );
    }
    public void testC(){
        Calender date = new Calender(12,"jun",2000);
        assertEquals("12-jun-2000",date.getDateString() );
    }

    public void testD(){
        Calender date = new Calender(12,"jun",2001);
        assertEquals("12-jun-2001",date.getDateString() );
    }

    
    public void testE(){
        Calender date = new Calender(12,"feb",2000);
        assertEquals("12-feb-2000",date.getDateString() );
    }

    
    public void testF(){
        Calender date = new Calender(12,"feb",2001);
        assertEquals("12-feb-2001",date.getDateString() );
    }
	
    public void testG(){
        Calender date = new Calender(29,"mar",2000);
        assertEquals("29-mar-2000",date.getDateString() );
    }


    public void testH(){
        Calender date = new Calender(29,"mar",2001);
        assertEquals("29-mar-2001",date.getDateString() );
    }

    
    public void testI(){
        Calender date = new Calender(29,"jun",2000);
        assertEquals("29-jun-2000",date.getDateString() );
    }

    public void testJ(){
        Calender date = new Calender(29,"jun",2001);
        assertEquals("29-jun-2001",date.getDateString() );
    }

    public void testK(){
        Calender date = new Calender(29,"feb",2000);
        assertEquals("29-feb-2000",date.getDateString() );
    }

    public void testL(){
        Calender date = new Calender(29,"feb",2001);
        assertEquals("Invalid Date",date.getDateString() );
    }


    public void testM(){
        Calender date = new Calender(30,"mar",2000);
        assertEquals("30-mar-2000",date.getDateString() );
    }


    public void testN(){
        Calender date = new Calender(30,"mar",2001);
        assertEquals("30-mar-2001",date.getDateString() );
    }

    public void testO(){
        Calender date = new Calender(30,"jun",2000);
        assertEquals("30-jun-2000",date.getDateString() );
    }

    
    
    public void testP(){
        Calender date = new Calender(30,"jun",2001);
        assertEquals("30-jun-2001",date.getDateString() );
    }


    public void testQ(){
        Calender date = new Calender(30,"feb",2000);
        assertEquals("Invalid Date",date.getDateString() );
    }
    
    public void testR(){
        Calender date = new Calender(30,"feb",2001);
        assertEquals("Invalid Date",date.getDateString() );
    }


    public void testS(){
        Calender date = new Calender(31,"mar",2000);
        assertEquals("31-mar-2000",date.getDateString() );
    }


    public void testT(){
        Calender date = new Calender(31,"mar",2001);
        assertEquals("31-mar-2001",date.getDateString() );
    }


    public void testU(){
        Calender date = new Calender(31,"jun",2000);
        assertEquals("Invalid Date",date.getDateString() );
    }


    public void testV(){
        Calender date = new Calender(31,"jun",2001);
        assertEquals("Invalid Date",date.getDateString() );
    }


    public void testW(){
        Calender date = new Calender(31,"feb",2000);
        assertEquals("Invalid Date",date.getDateString() );
    }


    public void testX(){
        Calender date = new Calender(31,"feb",2001);
        assertEquals("Invalid Date",date.getDateString() );
    }

}
