package week1.day2;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		
		int[] data = {10,30,20,15,40,12,11};
		Arrays.sort(data);
		//System.out.println("The sorted array is:"+data);
		
      for (int i=0 ;i<data.length;i++)
        {
		 System.out.println(data[i]);
		}
      System.out.println("The sorted array is:"+data[data.length-2]);
	}                                             
	}
