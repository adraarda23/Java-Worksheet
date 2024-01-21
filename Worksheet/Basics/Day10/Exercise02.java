package Day10;

public class Exercise02 {
	//Arity
	public static void main(String[] args) {
		System.out.println(average(3,5,2,3));
		System.out.println("f(3+5)");

	}
	static double average(int ... number) {
		double sum =0;
		for(int i:number) {
			sum+=i;
		}
		double average=sum/number.length;
		return average;
	}

}
//Note1: {...} return number to array and its length decided by users parameter length