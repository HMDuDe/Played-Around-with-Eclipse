package firsteclipsproject;

import java.util.Scanner;

public class MainClass {

	Scanner input = new Scanner(System.in);
	int[] numbers = new int[10];
	
	public void insertNumbers() {
		
		int numberEntered;
		
		System.out.println("Enter numbers into array :");	
		for(int i = 0; i < 10;i++) {
			
			do {
				
				numberEntered = input.nextInt();
				if(numberEntered <= 0) {
					System.out.println("INVALID NUMBER ENTERED");
					System.out.println("Please enter valid number :");
				}
				
			}while(numberEntered <= 0);
			
			numbers[i] = numberEntered;
			System.out.println("Array Updated");
		}
	}
	
	public void showAll() {
		
		System.out.println("Numbers in Array: ");
		for(int i = 0; i < 10; i++) {
			
			System.out.println(numbers[i]);
		}
		System.out.println("Numbers printed");
	}
	
	public static void main(String[] args) {
		
		MainClass test = new MainClass();
		test.insertNumbers();
		test.showAll();

	}

}
