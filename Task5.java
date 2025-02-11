package GuviTask;
import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enetr the number");
		
		int Num = scanner.nextInt();
		
		boolean IsPrime = true;
		
		if(Num<=1) {
			IsPrime=false;
		} else {
			for(int i = 2; i * i <= Num; i++) {
				if(Num % i == 0) {
					IsPrime=false;
			}
		}
		}
		
		if(IsPrime) {
			System.out.println("It is a Prime number");
		}
		
		else {
			System.out.println("It is not a Prime");
		}	
	}

}
