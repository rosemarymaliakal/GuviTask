package GuviTask;
import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter first number : ");
		int a = scanner.nextInt();
		
		System.out.println("Enter second number : ");
		int b = scanner.nextInt();
		
		
		int temp;
		
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("The value of a is "+a);
		System.out.println("The value of b is "+b);

	}

}
