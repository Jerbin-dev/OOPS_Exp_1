import java.util.Scanner;
public class Ex1_3_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		// Display name and roll number
		System.out.println("JERBIN");
		System.out.println("URK24CS1265");
		System.out.println();
		double balance = 10000.0;
		int choice;
		do {
		System.out.println("\n--- ATM MENU ---");
		System.out.println("1. Check account balance");
		System.out.println("2. Deposit money");
		System.out.println("3. Withdraw money");
		System.out.println("4. Exit");
		System.out.print("Enter your choice: ");
		choice = scanner.nextInt();
		switch (choice) {
		case 1:
		System.out.println("Your current balance is: Rs. " + balance);
		break;
		case 2:
		System.out.print("Enter amount to deposit: Rs. ");
		double deposit = scanner.nextDouble();
		if (deposit > 0) {
		balance += deposit;
		System.out.println("Amount deposited successfully.");
		} else {
		System.out.println("Invalid deposit amount!");
		}
		break;
		case 3:
		System.out.print("Enter amount to withdraw: Rs. ");
		double withdraw = scanner.nextDouble();
		if (withdraw > 0 && withdraw <= balance) {
		balance -= withdraw;
		System.out.println("Please collect your cash.");
		} else if (withdraw > balance) {
		System.out.println("Insufficient balance!");
		} else {
		System.out.println("Invalid withdrawal amount!");
		}
		break;
		case 4:
		System.out.println("Thank you for using the ATM. Goodbye!");
		break;
		default:
		System.out.println("Invalid choice. Please try again.");
		}
		} while (choice != 4);
	}

}
