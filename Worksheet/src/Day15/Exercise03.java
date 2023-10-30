package Day15;
//EASY ADDRESS

//javac -d ./bin x.java
//javac -d ./bin *.java -> compiles all of them (better solution)

//Classpath
//javac -classpath ./bin -d ./bin CarTest java
//javac -cp ./bin -d ./bin CarTest java


/*
export CLASSPATH=PATH
/Users/ardaaydin > java Test    -MacOS
  
 */

public class Exercise03 {

	public static void main(String[] args) {
		int[][] selam = {{1,2,3},{1,2,3}};
		System.out.println(selam[0][0]);
		System.out.println(Day16.Exercise01.PI); 
	}

}
