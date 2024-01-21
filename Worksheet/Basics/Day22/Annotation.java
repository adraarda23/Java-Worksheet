package Day22;

public class Annotation {
	
	public static void main(String[] args) {
		Test2 test = new Test2();
		System.out.println(test.b);
	}

}


class Test{
	public int a=1;
	
	public int getA() {
		return a;
	}
}

class Test2 extends Test{
	public int b=3;
	@Override
	public int getA() {
		return b;
	}
}

//Note: Annotations are not necessary but it improves quality of code
// because it makes code more understandable




//Java Doc API Times
