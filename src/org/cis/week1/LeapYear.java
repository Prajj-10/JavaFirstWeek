/**
 * 
 */
package org.cis.week1;
import java.util.Scanner;

/**
 * 
 */
public class LeapYear {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a year : ");
		int year = input.nextInt();
		if(year % 400 == 0 && year % 100 != 0 || year % 4 == 0) {
			System.out.println(year + " is a leap year !");
			
		}
		else {
			System.out.println(year + " is not a leap year.");
		}
		input.close();
		
	}

}
