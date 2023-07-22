package week1.day2;

public class NegativetoPositiveConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = -20;
		if (x<0) {
			//System.out.println("Number is a negative number " +x);
			int y= x * (x);
			System.out.println("Given number is " +x+ " Converted number is " +y);
		}
		else {
			System.out.println("Number is a positive number " +x);
		}
		}
	}


