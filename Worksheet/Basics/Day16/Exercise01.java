package Day16;

// Access Control Mechanism
public class Exercise01 {
	private int x=3;
	public int y=4;
	protected int z=5;
	int xyz=6;
	public static final double PI=3.1415; //public feels like an export in react
	
	public static int a=1;
	protected static int b=1;
	private static int c=1;
	static int d=1;
	
    public static void main(String[] args) {
    	final int ard=3;

        //Exercise01 ex = new Exercise01();
        //ex.new Arda().printMessage();
        Arda arda =new Arda();
        arda.printMessage();
    }
//    class Arda {
//        public void printMessage() {
//            System.out.println("Accessing System.out.println from inner class Arda!");
//        }


}

class Arda {
//	public static void main(String[] args) {
//		Exercise01 test = new Exercise01();
//	}
    public static void printMessage() {
        System.out.println("Accessing System.out.println from inner class Arda!");
    }
}
/*
 * public ->same package,inherited child,itself,and other packages can access
 * protected ->same package , inherited child,and itself can access 
 * default ->same package ,and itself can access
 * private -> only itself can access
 * private->default->protected->public
 * */

//Note1: Without public keyword classes from other packages unreachable
