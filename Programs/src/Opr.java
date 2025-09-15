//other operators 

class Opr{
	public static void main (String [] args){
		int a = 10;
		int b = 2;
		int c = 1;
		
		//Relational opr  --  ==,!=,>=,<=,<,>
		System.out.println("===Relational operators===");
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println("==========================");
		System.out.println();
		System.out.println("===Logical operators===");
		if (a>b && a>c){
			System.out.println("A is Bigger");
		}
		else if (b>a && b>c){
			System.out.println("B is Bigger");
		}
		else if (a==0 || b==0){
			System.out.println("Values should not be zero");
		}
		
	}
}