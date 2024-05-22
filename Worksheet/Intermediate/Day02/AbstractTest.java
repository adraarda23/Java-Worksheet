package Day02;

public abstract class AbstractTest {
	public int num1;
	protected int num2;
	int num3;
	//private int num4; private is not valid in abstract classes
	
	AbstractTest(){
		System.out.println("This is never created but this code is still here UwU");
	}
	
	public void test() {
		System.out.println("Tested .!.");
	}
	public abstract void abstractTest(); // abstractTest cannot have a body
	//private abstract void abstractTest2();
	//public abstract final void abstractTest3();  // abstracts cannot have a final or private keywords
	


}
