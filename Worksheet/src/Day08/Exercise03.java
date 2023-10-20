package Day08;
public class Exercise03{
	public static void main(String[] args) {
		//Goal : how can i initialize a new list without last indexed element ??
		int[] test = {1,2,3};
		print(pop(test));
		
	}
	
	//pop method
	public static int[] pop(int[] tempList) {
		int n = (tempList.length)-1;
		int[] newList = new int[n];
		for(int i=0;i<n;i++)
			newList[i]=tempList[i];
		return newList;
	}
	public static void print(int[] tempList) {
		int n=tempList.length;
		for(int i=0;i<n;i++)
			System.out.println(tempList[i]);
		
	}
}