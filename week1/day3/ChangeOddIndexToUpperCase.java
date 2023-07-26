package week1.day3;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "changeme";
		int length= test.length();
		char[] ch = test.toCharArray();
		for (char c : ch) {
			 
            System.out.println(c);
        }
		for (int i=1;i<length;i=i+2)
		{
		char a= ch[i];
		char upperCase = Character.toUpperCase(a);
		System.out.print(upperCase);
			
		}
	}

}

