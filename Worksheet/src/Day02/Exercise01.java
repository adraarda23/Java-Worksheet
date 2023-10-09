package Day02;

public class Exercise01{
	public static void main(String[] args) {
		int a=3;
		float b=3.12F;
		double c = 2.17213123;
		boolean d = true;
		int e = 2147483647;
		char f ='A';
		
		System.out.println((int)b);
		System.out.println((float)(int)b);
		
		System.out.println((float)(e+1));
		System.out.println((f+1));
		System.out.println((char)(f+1));
		
		
		
		
	}


}
/*
 
 Casting NOTES
 Note1: Boolean values cannot converted to another types
 Note2: Some values can be lost after type casting
 Note3: sum of int values type casting can be meanless if its overflow as a int
 Note4: if its sum operation Java instantly converts char to int 


  
*/
 