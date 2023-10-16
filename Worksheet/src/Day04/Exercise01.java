package Day04;

public class Exercise01 {
    public static void main(String[] args) {
        writeRectangle(10, 10);
        System.out.println();
        int a=Recursion(5);
        System.out.println(a);
    }
    
    

    public static void writeRectangle(int i, int j) {
        for (int row = 0; row < i; row++) {
            for (int col = 0; col < j; col++) {
                if (row == 0 || row == i - 1 || col == 0 || col == j - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static int Recursion(int x) {
    	if(x==1) {
    		return 1;}
    	return x*Recursion(x-1);
    	
    }
}
