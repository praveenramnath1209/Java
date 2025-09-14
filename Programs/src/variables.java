//Variables 

/* Types of variables 
	1.instance
	2.static
	3.local*/
	
import java.util.*;

class Variables{
	static String school_name = "XYZ School";//static variable
	String st_name; //instance variable
	int rno;
	
	
	
	public static void main (String [] args){
		Variables v = new Variables();
		v.st_name = "Shanks";
		v.rno = 20;
		System.out.println("Name:"+v.st_name);
		System.out.println("Roll No:"+v.rno);
		System.out.println("School:"+v.school_name);
	}
	
}