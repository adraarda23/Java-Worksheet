package Day05;
public class Exercise02{
	public static void main(String[] args) {
		
		String test1="Arda";
		int hashCode1 = System.identityHashCode(test1);
		System.out.println(hashCode1);
		
		String test2="Arda2";
		int hashCode2 = System.identityHashCode(test2);
		System.out.println(hashCode2);
	
		String test3="Arda";
		int hashCode3 = System.identityHashCode(test3);
		System.out.println(hashCode3);
	
	
	}
}