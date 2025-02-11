package GuviTask;
import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the age");
		
		int MyAge = scanner.nextInt();
		
		if(MyAge >= 60) {
			System.err.println("You are a Senior Citizen");
			
		}
		else {
			System.out.println("You are not a Senior Citizen");
		}
	}

}
