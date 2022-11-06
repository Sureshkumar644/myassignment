package week1.day1;

public class MyMobile {

	String mobileBrandName = "Honor";
	char mobileLogo = 'H';
	short noOfMobilePiece = 4;
	int modelNumber = 2121;
	long mobileImeiNumber =  38492020111L;
	float mobilePrice = 34456.0f;
	boolean isDamaged = false;
	
	public static void main(String[] args) {
	
		MyMobile mb= new MyMobile();
		System.out.println(mb.mobileBrandName);
		System.out.println(mb.mobileLogo);
		System.out.println(mb.noOfMobilePiece);
		System.out.println(mb.modelNumber);
		System.out.println(mb.mobileImeiNumber);
		System.out.println(mb.mobilePrice);
		System.out.println(mb.isDamaged);
	}

}
