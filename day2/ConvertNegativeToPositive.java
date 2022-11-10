package week1.day2;

import java.util.Scanner;

public class ConvertNegativeToPositive {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); 
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		if (num<0)
		{
			num = num *(-1);
			System.out.println("Given no is converted to Positive:"+num);
		}
		else
			System.out.println("It is positive number");
	}

}
