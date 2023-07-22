package week1.day3;

import java.util.Arrays;

public class MissingElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,7,6,8};
		Arrays.sort(arr);
		for (int i=0;i<arr.length;i++) {
			//System.out.print(arr[i]);
			if (i!= arr[i])
				System.out.print(arr[i]);
		}
		
	}

}
