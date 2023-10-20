package Day08;

import java.util.ArrayList;

public class Quiz01{
	public static void main(String[] args) {
		//Solution1: It works but list holds extra 0's and its not we want exactly
//		//Task1: Transform this list to set
//		int[] List1= {3,3,87,56,1,87,3,2};
//		int n= List1.length;
//		int[] SetList = new int[n];
//		int lengthOfSetList=0;
//		for(int i=0;i<n;i++) {
//			boolean even =false;
//			for(int j=0;j<i;j++) {
//				if(List1[i]==List1[j]) {
//					even=true;
//					break;
//				}
//				
//			}
//			if(!even) {
//				SetList[lengthOfSetList]=List1[i];
//				lengthOfSetList++;
//			}
//		}
//		for(int i: SetList)
//			System.out.println(i);
		//Solution2 it works exactly how it suppose to be
		int[] List1= {3,3,87,56,1,87,3,2};
		int n= List1.length;
		ArrayList<Integer> liste = new ArrayList<>();
		for(int i=0;i<n;i++) {
			boolean even =false;
			for(int j=0;j<i;j++) {
				if(List1[i]==List1[j]) {
					even=true;
					break;
				}
				
			}
			if(!even) {
				liste.add(List1[i]);
			}
		
	}
		for(int i:liste)
			System.out.println(i);
}
	}