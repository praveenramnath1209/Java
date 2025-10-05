import java.util.*;

class Inp{
public static void main (String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter your name:");
String s  = sc.nextLine();
System.out.println("Enter your age:");
int a = sc.nextInt();
sc.nextLine();
System.out.println("Enter your gender (male/female):");
String s2  = sc.nextLine();
System.out.println("Enter your Role:");
String s3  = sc.nextLine();
System.out.println("===Role Card===");
System.out.println("Name: "+s);
System.out.println("Age: "+a);
System.out.println("Gender: "+s2);
System.out.println("Role: "+s3);
System.out.println("===============");
}
}