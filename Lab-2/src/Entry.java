import static java.lang.System.out;
import java.util.*;
class Entry{
	
	
	public static void main(String[] args){
		out.println("Employee details");
		
		Employee e = null;
		date d = null;
		d= new date(22,10,2018);
		
		e = new Employee();
		e.displayDetails();

		e = new Employee("Nikhil","Panvilkar",22344,"A",d);
		e.displayDetails();
		d= new date(12, 10, 2018);
               e = new Employee("Saurabh","Karale",22344,"A",d);
	       e.displayDetails();
	       d=new date(12, 10, 2018);
               e = new Employee("Amit","Mohite",22344,"A",d);
		e.displayDetails();
		d= new date(12, 10, 2018);
e = new Employee("Vinayak","Gajam",22344,"A",d);
		e.displayDetails();
		d= new date(12, 10, 2018);
    }
	
}







