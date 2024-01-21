package Day14;

public class Exercise01 {
		//Inıtialization Blocks
	public static void main(String[] args) {
//		Test experiment1 = new Test();
//		System.out.println(experiment1.total);
		
		//Test2 experiment2 = new Test2();
		//experiment2.a  accesses static like a object value ! it works but not the correct way to do that
		System.out.println(Test2.a);
		
		
		
	}
	

}
class Test{
	int test =1;
	double total = percentage * test; // There is no scope error 
	final static double percentage=0.82;
}
class Test2{

	static {
		a=5;
		b=3;
	}
	static int a,b;
}
class Test3{
	static {
		//a=a; //Error forward reference
	}
	static int a;
	static int b=3;	
}

//Note1: ***Static variables initializes before objects ***