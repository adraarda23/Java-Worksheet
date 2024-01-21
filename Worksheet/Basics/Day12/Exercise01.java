package Day12;


public class Exercise01 {

	public static void main(String[] args) {
		InitialValues nesne = new InitialValues();
		nesne.print();
	}
	//Class initial values
	public static class InitialValues {
		// Instance variables
	    boolean t;	// false
	    char c;		// 0
	    byte b;		// 0
	    short s;		// 0
	    int i;		// 0
	    long l;		// 0L
	    float f;		// 0.0F
	    double d;	// 0.0D
	    String str;	// null
	    
	    // Class variables
	    static int si;
	    static char sc;
	    static String sstr;
	    
	    void print() {
	        System.out.println(
	        "Data type      Initial values for instance variables\n" +
	        "boolean        " + t + "\n" +
	        "char           [" + c + "] "+ (int)c +"\n"+
	        "byte           " + b + "\n" +
	        "short          " + s + "\n" +
	        "int            " + i + "\n" +
	        "long           " + l + "\n" +
	        "float          " + f + "\n" +
	        "double         " + d + "\n" +
	        "String         " + str + "\n" +
	        "\nData type      Initial values for class variables\n" +
	        "char           [" + sc + "] "+ (int)sc +"\n"+
	        "int            " + si + "\n" +
	        "String         " + sstr);
	    }
}
}

