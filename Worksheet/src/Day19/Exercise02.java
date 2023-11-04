package Day19;
//Hiding and Overriding
public class Exercise02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Test2.a);
		Test2 test=new Test2();
		System.out.println(test.calculateArea(3));
		Test2 test2=new Test2();
		System.out.println(test2.calculateArea2(3));
	}

}

class Test{
	protected static int a=5;
	public int b=3;
	protected int calculateArea(int x) {
		return x*x;
	}
	protected int calculateArea2(int y) {
		return y*y;
	}
}

class Test2 extends Test{
	protected static int a=3; //Hiding
	
	protected int calculateArea() {
		//Wrong Over Ride because Signatures are not same 
		//Only names are not enough !
		return 1;
	}
	protected int calculateArea(int randomIntNumber) {
		//Signature don't have to be exactly same it can take
		//different variable names but variable type must be same

		return randomIntNumber*randomIntNumber;
	}
	protected int calculateArea2(int y) { 
		//Over Ride
		return y*y*y;
	}
	
	
}


//Note1: with super() subClasses can access to upper classes too 
//Note2: subclass cannot override upper class but upper class can
//Note3: Static Methods cannot over ride but it can hided by user 