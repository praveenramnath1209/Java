import java.util.Scanner;
class Calc {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter num1:");
int a = sc.nextInt();
System.out.println("Enter num2:");
int b = sc.nextInt();
while (true) {
System.out.println("==============");
System.out.println("1. ADD");
System.out.println("2. SUB");
System.out.println("3. MUL");
System.out.println("4. DIV");
System.out.println("5. Exit");
System.out.println("==============");
System.out.println("Select an option:");
int n = sc.nextInt();
switch (n) {
case 1:
System.out.println("Addition result: " + (a + b));
break;
case 2:
System.out.println("Subtraction result: " + (a - b));
break;
case 3:
System.out.println("Multiplication result: " + (a * b));
break;
case 4:
if (b != 0) {
System.out.println("Division result: " + (a / b));
} else {
System.err.println("Division by zero is not allowed");
}
break;
case 5:
System.out.println("Exiting program...");
sc.close();
System.exit(0);
default:
System.err.println("Invalid input");
break;
}
}
}
}
