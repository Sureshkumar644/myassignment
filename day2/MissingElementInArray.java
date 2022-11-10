package week1.day2;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
		int[] missing = {1,2,3,4,8,9}; 
		Arrays.sort(missing);
		
		for (int i=0;i<missing.length;i++)
		{
			System.out.println(missing[i]);
		}
		
		int j=1;
		for (int k=0;k<missing.length;k++)
		{
					if (j == missing[k])
				      {
						j++;
				      }
					else
					{
						System.out.println("The missing number is: " +j);
						break;
					}
		}	
	}	
}
