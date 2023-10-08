package Day01;

public class Exercise02{
	public static void main(String[] args) {
		boolean testValue = true;
		
		System.out.println(testValue);
		System.out.println("\u20BA");
		
		char testValue2 = '\u20BA';
		System.out.println((int)testValue2);
		
		int sayi1 = 0b1010;
		int sayi2 = 0132;
		int sayi3 = 0x5a;
		
		long sayi4 = 0b1010L;
		byte sayi5 = 017;
		short sayi6 = 0x5a;

		System.out.println(sayi1 + " " + sayi2 + " " + sayi3);
		System.out.println(sayi4 + " " + sayi5 + " " + sayi6);
		
		int sayi7 = sayi1 + sayi2 + sayi3;
		int sayi8 = sayi1 * sayi2 * sayi3;	
		System.out.println(sayi7);
		System.out.println(sayi8);
		
		System.out.println(Short.SIZE);
		System.out.println(Integer.SIZE);
	}
}


/*
Note1: Boolean values cannot  convert into a integer
Note2: {' '} for char and {" "} for String casting
Note3: if integers not contains { L } on the right position default size 
is 32 byte but if integer has that its size 64 byte
Note4: there are no lower size than 32 byte (so is that mean other types like short int 
kind a useless ?)

  */
