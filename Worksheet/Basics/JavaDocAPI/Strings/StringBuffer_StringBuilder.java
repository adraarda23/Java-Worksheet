package JavaDocAPI.Strings;
import java.lang.StringBuffer;
import java.lang.StringBuilder;
public class StringBuffer_StringBuilder {

	public static void main(String[] args) {
		callStringBuffer();
		System.out.println("-------------");
		callStringBuilder();

	}

	private static void callStringBuffer() {
		StringBuffer test = new StringBuffer();
		System.out.println(System.identityHashCode(test));
		test.append("a");
		test.append(13.7);
		test.reverse();
		test.delete(0, test.length());
		test.append(false);
		test.insert(2, "ulsa\n");
		test.deleteCharAt(3);
		
		
		System.out.println(test.toString());
		System.out.println(test.substring(0, 2));
		System.out.println(System.identityHashCode(test)); //memory address doesn't changes 
	}
	
	private static void callStringBuilder() {
		StringBuilder testVariable = new StringBuilder("ab");
		StringBuilder test = new StringBuilder();
		test.append("a");
		System.out.println(System.identityHashCode(test));
		System.out.println(test.hashCode()); //same thing
		//test.compareTo((StringBuilder)testVariable); cannot cast from StringBuilder to String
		
		System.out.println(test.compareTo(testVariable)); //correct returns 0 wrong returns -1
		System.out.println(test.chars());
		System.out.println(test.toString());
		System.out.println(test);
	}
}
