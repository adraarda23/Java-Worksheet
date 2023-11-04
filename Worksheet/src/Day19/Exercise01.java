package Day19;
//Initialize and Inheritance
public class Exercise01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test6 randomName=new Test6();
	}

}

class Test5{
	public Test5() {
		System.out.println("In a Test 5"); //Test5 initialize before Test6
	}
}
class Test6 extends Test5{
	public Test6() {
		super();
		System.out.println("In a Test 6");
	}
}
//Note1: upper classes initializes before its child class initialize
//Note2: first comes works first (statics are exclusive) -Exercise02