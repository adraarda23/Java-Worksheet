package Day02;

public class MainTest{

	public static void main(String[] args) {
		AbstractTest Test = new AbstractSubClass();
		//AbstractTest Test2 = new AbstractTest(); Its instance cannot be created because its abstract
		Test.abstractTest();
		System.out.println(Test instanceof AbstractSubClass);

	}

}
