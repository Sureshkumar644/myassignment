package week1.day2;

public class PositiveOrNegative {

	public void posNeg()
	{
int number = -99;
		
		if (number>0)
		{
			System.out.println("Number is positive");
		}
		else if (number<0)
		{
			System.out.println("Number is negative");
		}
		else
		{
			System.out.println("Number is neither positive or negative");
		}
	}
	public static void main(String[] args) {
		
		PositiveOrNegative obj = new PositiveOrNegative();
		obj.posNeg();
		
		
	}

}
