import java.util.Scanner;

public class AgeGuess {

	public static void main(String[] args) {
		
		String name;
		int ageGuess;
	
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter your name:"); //prompts the user to enter name
		name = scan.nextLine();
		
		System.out.print("Enter your Age:"); //prompts the user to enter age
		ageGuess = scan.nextInt();
		
		System.out.print("Your Name is " + name);
		System.out.print(" and you are " + ageGuess + " years old!");
		
		
	}

}
