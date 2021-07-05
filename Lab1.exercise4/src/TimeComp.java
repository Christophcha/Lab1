import java.util.Scanner;

public class TimeComp {

	public static void main(String[] args) {
		
		int totalSeconds;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number of seconds that you want converted:");
		totalSeconds = scan.nextInt();
		
		
		int hours = totalSeconds / 3600;
		int minutes= (totalSeconds%3600 - totalSeconds%3600%60) / 60;
		int seconds = totalSeconds%3600%60;
		
		
		System.out.print(+totalSeconds+ " seconds is equivalent to: " + hours + " hours, "+ minutes +" minutes, and "+ seconds+" seconds.");
				
	}
}
