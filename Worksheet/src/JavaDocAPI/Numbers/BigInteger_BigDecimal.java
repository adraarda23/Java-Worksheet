package JavaDocAPI.Numbers;
import java.math.BigInteger;
import java.math.BigDecimal;
public class BigInteger_BigDecimal {

	public static void main(String[] args) {
	runBigInteger(40);
	runBigDecimal(20);
		

	}
	public static void runBigInteger(int a) {
		BigInteger test = BigInteger.valueOf(a);
		System.out.println(test.add(test)); //only accepts BigInteger
		System.out.println(System.identityHashCode(test));
		test=test.abs(); //doesnt change directly
		
		System.out.println(test);
		System.out.println(System.identityHashCode(test));
	}
	public static void runBigDecimal (int a) {
//BigDecimal test = BigDecimal.valueOf((long)3.123123213213123280402348230984032840239840932840932849328490238904023094238904320983209);
//		test=BigDecimal.valueOf(3);
//		BigDecimal test2 =BigDecimal.valueOf(2);
//		System.out.println(test.divide(test2));
        String longValue = "3.123123213213123280402348230984032840239840932840932849328490238904023094238904320983209"; //way to declare
        // decimals which passes the maximum long or integer value
        String longValue2 = "3.17213672376312876312863268213688623168723186712386779237983247983249783427983427983243";
        BigDecimal test = new BigDecimal(longValue);
        BigDecimal test2 = new BigDecimal(longValue2);
        System.out.println(test);
        System.out.println(test2);
        test=test.add(test2);
        System.out.println(test);  //answer of how can i calculate big values and return as String
      
        
	}
}

//Note: BigInteger or BigDecimal values doesn't changes directly like StringBuffer or StringBuilder
