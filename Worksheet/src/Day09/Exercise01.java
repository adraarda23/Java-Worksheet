package Day09;

public class Exercise01 {

	public static void main(String[] args) {
		//Stack , Heap and Variables
		Test deneme = new Test();
		Test2 deneme2 = new Test2();
		System.out.println(deneme.toSting());
		deneme.tTest1 =deneme2;
		deneme2.tTest2=deneme;
		System.out.println(deneme.toSting());
		
	}
	


}
class Test{
	String name;
	String surname;
	int a;
	boolean b;
	float c;
	double d;
	Test2 tTest1;
	public String toSting() {
		return name +" "+surname+" " + tTest1;
	}

}
class Test2{
	String name1;
	String name2;
	Test tTest2;
	
	public String toSting() {
		return name1 +" "+name2+" " + tTest2;
	}
}

//Note 1: Java can automatically initializes class variables if they didn't hold anything (default values).
//Note 2: Classes can hold the addresses of other classes through variables.
