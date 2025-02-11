package GuviTask;
import java.util.Scanner;
public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int num = scanner.nextInt();
		int fact = 0;
		
		for(int count=1;count<=num;count++) {
			 fact = fact + count;
		}
		System.out.println("Factorial of "+num+" is "+fact);
	}

}
