import java.util.Scanner;

public class AgeGuess {

	public static void main(String[] args) {
		
		String name;
		int ageGuess;
	
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter your name:");
		name = scan.nextLine();
		
		System.out.print("Enter your Age:");
		ageGuess = scan.nextInt();
		
		System.out.print("Your Name is " + name);
		System.out.print(" and you are " + ageGuess + " years old!");
		
		
	}

}
