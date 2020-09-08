package numerical;

import java.util.Scanner;

public class findNum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i = 0;
		int n;
		int sum = 0, avg = 0, highest = 0, lowest = 999999, totalEven = 0, totalOdd = 0;
		System.out.println("enter an enteger. zero to quit");

		do {// Start of the loop

			n = in.nextInt();// user input
			
			if (n != 0) {//this line is if you want to include the number zero in your calculations
				
				i++;//counts number of integers  entered because of loop

				sum = sum + n; // calculate sum

				if (n > highest) { // if the entered int is greater then the last highest int then it will overwrite the value
					highest = n;
				}
				if (n < lowest) {// if the entered int is lower then the last lowest int then it will overwrite the value
					lowest = n;
				}
				if ((n % 2) == 0) {// if the int is divisible by 2 and has the remainder 0 then increment the even variable
					totalEven++;
				} else {// if it has any other remainder then increment the odd variable
					totalOdd++;
				}
			}
		} while (n != 0);// end of loop once user enters zero
		avg = sum / i; // calculate average 
		
		// print values

		System.out.println("sum = " + sum);
		System.out.println("avg = " + avg);
		System.out.println("highest = " + highest);
		System.out.println("lowest = " + lowest);
		System.out.println("number of even = " + totalEven);
		System.out.println("number of odd = " + totalOdd);

	}
}
