import java.util.*;

class Terode{
	public static void main(String [] args){
		Scanner x = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a = x.nextInt();
		
		System.out.println((a%2==0)?"The number : "+a+" is an even number":"The number : "+a+" is an odd number");
	}
}