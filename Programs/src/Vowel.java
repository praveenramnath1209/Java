import java.util.*;

class Vowel{
	public static void main(String [] args){
		Scanner y = new Scanner(System.in);
		char c = y.next().charAt(0);
		c = Character.toLowerCase(c);
		char[] cx = {'a','e','i','o','u'};
		String result = (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') ? "Vowel" : "Consonant";
        System.out.println(result);		
	}
}