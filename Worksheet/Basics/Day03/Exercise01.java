package Day03;

public class Exercise01{
	public static void main(String[] args) {
		int a=1,b=2,c=3;
		float test1 = a + ++b * c / a * b;
		/*
		 Step1: Firstly , ++b increase b's value by one
		 Step2: while there is no parenthesis left to right all operations can done by correct 
		 mathematical hierarchy
		 */
		
		System.out.println(test1);
		
		System.out.println("Java" + 1 + 2); 		// Java12
		System.out.println("Java" + (1 + 2)); 	// Java
		System.out.println(1 + 2 + "Java");		// 3Java 

		int i =1;
		
		i = ++i;
		System.out.println(i);
		i=i++;
		System.out.println(i);
		
		
		
	}
}




/*
 Note1: Operator Precedences starts from left to compute but some precedence of operations have a priority
 Note2: In a theory string concat operations similar to javascript
 Note3: i=i++ logically does nothing because first sets i equal to i then increase i's value but i declared as i before increase
 
 
  */
