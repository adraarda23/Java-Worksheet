package Day07;
public class Exercise01{
	public static void main(String[] args){
		int[] liste = new int[5];
		for(int i=0;i<liste.length;i++) {
			liste[i]=i;
		}
		System.out.print("liste 1[");
		for(int i:liste) {
			System.out.print(" "+ i+ ",");
		}
		System.out.print("]\n");
		int[] liste2=liste;
		System.out.print("Liste 2[");
		for(int i:liste2) {
			System.out.print(" "+ i+ ",");
		}
		System.out.print("]");
		
		liste[0]=10;
		System.out.print("\n"+liste[0]+"\n");
		System.out.print(liste2[0]);
		
	}
	
	
	
}
//Note1: List variables not hold values it hold addresses
