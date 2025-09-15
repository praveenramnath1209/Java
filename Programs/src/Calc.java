import java.util.*;

class Calc{
	static void add(int a, int b){
		System.out.println(a+b);
	}
	
	static void sub(int a , int b){
		System.out.println(a-b);
	}
	
	static void mul(int a , int b){
		System.out.println(a*b);
	}
	
	static void div(int a, int b){
		System.out.println((b!=0)? a/b: "B cannot be zero ");
		}
		
	public static void main (String [] args){
		Scanner c = new Scanner(System.in);
		System.out.print("Enter value 1 :");
		int a = c.nextInt();
		System.out.print("Enter value 2 :");
		int b = c.nextInt();
		System.out.println();
		System.out.println("1)Addition");
		System.out.println("2)Subraction");
		System.out.println("3)Multiplication");
		System.out.println("4)Division");
		System.out.println("Choose one option :");
		int n = c.nextInt();
		
		switch(n){
			case 1:
			add(a,b);
			break;
			
			case 2:
			sub(a,b);
			break;
			
			case 3:
			mul(a,b);
			break;
			
			case 4:
			div(a,b);
			break;
			
			default:
			break;
		}
	}
	
}
