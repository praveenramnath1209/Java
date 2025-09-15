//Arithmetic oprs

class Arith{
	public static void main(String [] args){
		// +,-,/,*,%
		
		int a = 10;
		int b = 2;
		System.out.println("Addition:"+(a+b));
		System.out.println("Subraction:"+(a-b));
		System.out.println("Multiplication:"+(a*b));
		if (b != 0){
			System.out.println("Division:"+(a/b));
		}
		else{
			System.out.println("Error");
		}
		System.out.println("Modulo:"+(a%b));
	}
}