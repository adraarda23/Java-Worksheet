package Day09;

public class Exercise02 {

	public static void main(String[] args) {
		double g= power(10,2);
		System.out.print(g);

	}
	
	static double power(double a, int b) {
	    if (b == 0)
	        return 1;
	    if (b % 2 == 0) {
	        double halfPower = power(a, b / 2);
	        return halfPower * halfPower;
	    } else {
	        double halfPower = power(a, (b - 1) / 2);
	        return a * halfPower * halfPower;
	    }
	}

}
