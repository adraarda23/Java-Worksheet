package Day21;
import java.util.LinkedList;
		//Wrapper
public class Exercise01 {

	public static void main(String[] args) {
//		int i = 8;										//This kind of constructor calls are deprecated since Java 9
//		Integer iObject = new Integer(i); // Boxing
//		boolean b = true;
//		Boolean bobject = new Boolean(b); // Unboxing
//		System.out.println(i);
//		System.out.println(iObject);
		
		
	        LinkedList<Integer> linkedList = new LinkedList<>();

	        linkedList.add(3);
	        linkedList.add(4);
	        linkedList.add(5);

	        // forEach kullanarak listedeki her bir öğeyi yazdırma
	        linkedList.forEach(it -> System.out.println(it));
	    


}}
//*** Java API reduces coding time ***
