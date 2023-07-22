package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int range = 8;
		int firstNum = 0;
		int secNum= 1;
		System.out.print(firstNum+ " " +secNum);
		for (int i=2;i<range;++i)
		{
			int sum = firstNum+secNum;
			System.out.print(" " +sum);
			firstNum = secNum;
			secNum = sum;
			
		}
	}

}
