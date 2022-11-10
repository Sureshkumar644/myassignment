package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		int num = 8;
		int firstno=100;
		int secno=199;
		int sum;
		
		System.out.println(firstno);
		System.out.println(secno);
		
		for (int i = 0; i <=num; i++) 
		{
			sum = firstno+secno;
			firstno =secno;
			secno =sum;
			System.out.println(sum);
	}
	}
}
