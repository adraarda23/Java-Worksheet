package Day13;

public class Exercise01 {
	static final double PI = Math.PI; //Static because we are accessing that with that Math class
	public static void main(String[] args) {
		//System.out.println(PI);
		//arda();
		Deneme test1=new Deneme();
		test1.ReadDeneme();
		Deneme test2=new Deneme();
		test2.ReadDeneme(); //static practice about how many  instances we have created


	}
	static void arda() {
		System.out.println(PI);
		return;
	}
}

class Deneme{
	static int counter=0;
	
	Deneme() {
		counter++;
	}
	void ReadDeneme(){
		System.out.println(counter);
	}
}


//Note1: static can not have a duplicate usage.
//Note2: Like Math library some instances cannot created 
//Note3: static final -> const in JavaScript
//Note4: declaring static requires more statics but it turns Java into non-OOP
