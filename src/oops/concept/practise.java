package oops.concept;
import java.util.Scanner;

public class practise {
	Scanner sc = new Scanner(System.in);
	int amount = sc.nextInt();
	int attempt = 2;
	int originalpin = 3456;
	int balance = sc.nextInt();
	
	System.out.println("Enter Pin: ");
	int pin = sc.nextInt();
	
	while(attempt > 0) {
		if(pin == originalpin) {
			balance = balance - amount;
			System.out.println("Withdrawl Successful. Your Balance is : "+balance);
			break;
		}else {
			System.out.println("Invalid Pin Please try again");
			pin = sc.nextInt();
			attempt--;
		}
		if (attempt == 0) {
			throw new CardBlockedException();
		}
		
			
	}
	public static void main(String[] args) {
		ATM

	}
}
