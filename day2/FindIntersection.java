package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		int[] firstarray = {74,84,12,3,4,2};
        int[] secondarray = {1,2,5,12};
        int count = 0;
         
        for(int i=0;i< firstarray.length ; i++)
        {
        	for(int j=0; j< secondarray.length ; j++)
            {  
        		if(firstarray[i]==secondarray[j])
        		{
        			System.out.println(firstarray[i]);
        		}
        
            }
        }
	}
}
