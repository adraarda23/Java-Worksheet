package Day21;
import java.lang.StringBuffer;
//String
public class StringLearn {

	public static void main(String[] args) {

		
		
        String x = new String("Bu bir sacmalik ama");
        String y = new String("Bu bir sacmalik ama");
        String z="Bu bir sacmalik ama";
        String w="Bu bir sacmalik ama";
        
        System.out.println("x-Bu bir sacmalik ama: " + System.identityHashCode(x));
        System.out.println("y-Bu bir sacmalik ama: " + System.identityHashCode(y));
        System.out.println("z-Bu bir sacmalik ama: " + System.identityHashCode(z));
        System.out.println("w-Bu bir sacmalik ama: " + System.identityHashCode(w));
        
        System.out.println(x==y);
        System.out.println(x.equals(y));
        System.out.println("---------------");
        System.out.println(z==w);
        
        
        String test = "test";
        System.out.println("test head: " + System.identityHashCode(test));
        			//Even empty string concat returns different reference
        
        for(int i=0;i<5;i++) {
        	test=test+"";   //must be constructor call
        	System.out.println("test: " + System.identityHashCode(test));
        }
        
		StringBuffer tester = new StringBuffer("test");
		
		StringBuffer deneme=tester.append("");
//		deneme=tester.append(3);
		System.out.println("deneme-StringBuffer: " + System.identityHashCode(deneme));
		System.out.println(deneme);
		System.out.println("deneme-StringBuffer: " + System.identityHashCode(deneme));
		System.out.println(deneme.toString());
;        
	}
}
//Note1: Without constructor call String values shared by reference
//Note2: String concat returns different reference
//Note3: concat with StringBuffer doesn't return different reference
//Note4: StringBuffer or StringBuilder way more better performance than += concat
