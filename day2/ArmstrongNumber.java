package week1.day2;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int getNum = 153;
		int numGiven = getNum;
		int remNum;
		int calNum; 
		int armNum = 0;
		
				
		while(getNum >0)
		{
		
		remNum= getNum %10;
		
		calNum = remNum * remNum * remNum;
		
		armNum = calNum + armNum;
		
		getNum = getNum/10;
		
		}
		
		System.out.println("The given number is "+numGiven+".");
		System.out.println("The calculated number is "+ armNum+ ".");
		
		
		if (numGiven == armNum)
			System.out.println("User entered number is Armstrong");
		else
			System.out.println("User enetered number is not Armstrong");	
	}
}
