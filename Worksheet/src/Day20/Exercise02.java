package Day20;

public class Exercise02 {

	public static void main(String[] args) {
		defaultObjectMethods test = new defaultObjectMethods();
		defaultObjectMethods test2 = new defaultObjectMethods();
		
		System.out.println(test.equals(test2));
		System.out.println(test.getClass());
		System.out.println(test.hashCode());
		System.out.println(test.toString());
		//test.notify();
		//test.notifyAll();
		//test.wait();
		
	}

}
class defaultObjectMethods{
	
	public String toString(){ //Overrides java.lang.Object.toString
		return "Overrided toString method";
	}
//	public !!float!! hashCode() { // return type must be compatible
//		return 3;
//	}
	
}


//Note1: There is an implicit inheritance for classes; every object extends java.lang.Object if it does not explicitly extend another class.
//Note2: return type must be compatible with Object methods or it is an error
//Note3: equals and hashCode -> Technical Debt


//AK-NMPG-> Inheritance violates encapsulation.
