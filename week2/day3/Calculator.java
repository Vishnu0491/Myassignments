package week2.day3;

public class Calculator {
	
	public void add (int a, int b)
	{
		int c = a+b;
		System.out.println("adding 2 int " +c);
	}
	public void add(int a,int b,int c)
	{
		int d= a+b+c;
		System.out.println("addition of 3 int " +d);
	}
	public void multiple(double a, double b)
	{
		double c = a*b;
		System.out.println("multiplication of double numbers is " +c);
		}
	public void multiple(float x, float y)
	{
		float z = x*y;
		System.out.println("multiplication of float numbers is " +z);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc = new Calculator();
		calc.add(20, 30);
		calc.add(50, 60, 90);
		calc.multiple(25.055,100.500);
		calc.multiple(5.5f, 0.05f);
	}

}
