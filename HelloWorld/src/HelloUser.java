import java.util.Scanner;

public class HelloUser {

	public static String userName;
	
	public static void greetUser () {
		System.out.println("Hello, " + userName);
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner( System.in );
		System.out.println("Hello ASE2016 - how are you? :)");
		System.out.print("Please enter your name: ");
		userName = input.next( );
		greetUser();
		input.close();
	}

}
