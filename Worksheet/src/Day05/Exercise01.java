package Day05;
import java.util.Random;
//Monte Carlo Method
public class Exercise01{
	private static Random rgen = new Random();
	public static void main(String[] args) {
		int atis_sayisi =0;
	     int cemberde=0;
	for(int i = 0; i<1000000; i++){
	      double a= 2 * rgen.nextDouble() - 1;
	         double b =2 * rgen.nextDouble() - 1; 
	   atis_sayisi+=1;
	   if (Math.pow(a, 2) + Math.pow(b, 2) < 1) {
	    cemberde+=1;
	   }
	  }
	     double pi = 4 * (cemberde*1.0/atis_sayisi);
	     System.out.println("Pi sayisinin yaklasik degeri: "+pi);
		
	}
}