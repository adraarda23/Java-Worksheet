package Day08;

import java.util.Arrays;

public class Exercise01{
	//Arrays library basic usages
	public static void main(String[] args) {
		
		//spesific copy
		int[] test = {1,2,3};
		int[] deneme=Arrays.copyOfRange(test, 1,3);
		print(deneme);
		
		//write list with full range
		int[] deneme2=Arrays.copyOf(test,test.length);
		print(deneme2);
		
		//sort
		int[] test2 = {1,4,7,2,3};
		Arrays.sort(test2);
		print(test2);
		
		
	}
	public static void print(int[] intArray) {
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
		System.out.println();
	}
	
	
}