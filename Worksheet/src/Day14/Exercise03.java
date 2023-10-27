package Day14;

public class Exercise03 {
	//Class Initialization conflict test
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Object1 test1 = new Object1();
//		Object3 test2 = new Object3();
//		Object4 test21 = new Object4();

		

	}
}
class Object1{
	   public Object1() {
	        System.out.println("selam1");
	        Object2 test2=new Object2();
	    }
	}
class Object2{
	   public Object2() {
	        System.out.println("selam2");
	        Object1 test2=new Object1();
	    }
	}
class Object3{
	public Object3() {
		System.out.println("Object3");
		Object4 test2=new Object4();
	}
}
class Object4{
	static {
		i=5;
	}
	final static int i;
	public Object4() {

		System.out.println("Object4");
	}
}


//Note1: Java tries to compile infinite objects but at some point it throws an error





