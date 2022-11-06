package week1.day1;

public class TwoWheeler {

	int noOfWheels = 4;
	short noOfMirrors= 2;
	long classisNumber= 46840201L;
	boolean isPunctured= false;
	String bikeName= "Pulse";
	double runningKM= 1500;
	
	public static void main(String[] args) {
	
		TwoWheeler to = new TwoWheeler();
		System.out.println(to.noOfWheels);
		System.out.println(to.noOfMirrors);
		System.out.println(to.classisNumber);
		System.out.println(to.isPunctured);
		System.out.println(to.bikeName);
		System.out.println(to.runningKM);
		
		
	}

}
