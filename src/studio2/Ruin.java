package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//startAmount
		System.out.println("what is the starting amount? ");
		double startAmount = scan.nextDouble();
		
		//winChance
		System.out.println("what is the win chance? ");
		double winChance = scan.nextDouble();
		
		//randomNumber
		double randomNumber = (Math.random()); 
		
		//winLimit
		System.out.println("what is the win limit? ");
		int winLimit = scan.nextInt();
		
		//loop
		double finalAmount = 0;
		for (double i = startAmount; i < winLimit && i > 0; i++)
		/*while (startAmount > 0 && startAmount < winLimit)*/ {
			if (winChance > randomNumber) {
				finalAmount = (i + 1);
				System.out.println(finalAmount);
			} else {
				finalAmount = (i - 1);
				System.out.println(finalAmount);
			}
		}
		
		//success or ruin
		if (finalAmount >= winLimit) {
			System.out.println("Success");
		} else {
			System.out.println("Ruin"); 
		}
	}

}
