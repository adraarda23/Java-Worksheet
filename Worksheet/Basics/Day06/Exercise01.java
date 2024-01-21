package Day06;
public class Exercise01{
	public static void main(String[] args) {
		int[] liste=new int[3];
		for(int i=0;i<3;i++) {
			liste[i]=i+1;
		}
		try {
			System.out.println(liste[-1]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error");

	}
	}
}



/*
 Note1: Arrays cant have negative index in Java
 */