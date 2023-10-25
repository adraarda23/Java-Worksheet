package Day12;

public class Exercise02 {
    int a;
    int b;
    int i;
   static int d;

    public Exercise02(float a, int b) {
        this.a = (int) a;
        this.b = b;
    }

    public void arda() {
        i = 7; // can access
        d=3; //also non statics can access static variable
    }
    public static void  tester() {
    	//int j=3;
    	d=5; //can accessible to static
    }

    public static void main(String[] args) {
//        Exercise02 deneme = new Exercise02(2.2f, 3);
//        System.out.println(deneme.a);
//        System.out.println(deneme.b);
//        deneme.arda();
//        System.out.println(deneme.i);
        //i=5; cannot access to static
        //j=4;
    	Exercise02.d=4; // static methods can change without instance
    }
}
 
//Note1:statics cannot access to non static variables
//Note2: static variables can accessible without its instance
//Note3:

