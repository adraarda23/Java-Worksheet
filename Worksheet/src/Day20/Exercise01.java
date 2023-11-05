package Day20;

public class Exercise01 {

    public static void main(String[] args) {
    	String a="selam";
    	String b="selam";
        String x = new String("Bu bir sacmalik ama");
        String y = new String("Bu bir sacmalik ama");
        String z="Bu bir sacmalik ama";
        String w="Bu bir sacmalik ama";
        int i = 127;
        int j = 127;
        int k = 128;
        int l = 128;
      System.out.println("a-selam: " + System.identityHashCode(a));
      System.out.println("b-selam: " + System.identityHashCode(b));
      
      System.out.println("x-Bu bir sacmalik ama: " + System.identityHashCode(x));
      System.out.println("y-Bu bir sacmalik ama: " + System.identityHashCode(y));
      System.out.println("z-Bu bir sacmalik ama: " + System.identityHashCode(z));
      System.out.println("w-Bu bir sacmalik ama: " + System.identityHashCode(w));
      
      System.out.println("i-127: " + System.identityHashCode(i));
      System.out.println("j-127: " + System.identityHashCode(j));
      System.out.println("k-128: " + System.identityHashCode(k));
      System.out.println("l-128 " + System.identityHashCode(l));
    }
}

