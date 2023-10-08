package Day01;

public class Exercise03{
	public static void main(String[] args) {
		float value1 = 3.27E12F;
		System.out.println(value1);
		
		
		float value4 = 3.12E12F;
		System.out.println(value4 *1.5);
		
		
		double value2 = 3.12E28D;
		
		System.out.println(value2);
		double value3 = value2 * 2.5;
		System.out.println(value3);
		
	}
}


/*
Note1: integers cannot take { E } to their right but float and double can
Note2: Java cannot hold floating points completely true with floats
Note3: "10_000" cannot converted to integer but can define as integer like 10_000
  */
