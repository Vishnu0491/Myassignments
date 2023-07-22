package week1.day3;

public class DuplicatesString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
		int count =0;
		String[] split = text.split(", ");
		for(int i=0;i<split.length;i++) 
		{
			System.out.print(split[i]);			
			if (split[i] == "java")
				{
					count = count + 1;
					split [i] = "";
					
				}
									
			}
			
	}
}
		