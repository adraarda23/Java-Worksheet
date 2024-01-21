package Day08;
public class Quiz02{
	public static void main(String[] args) {
		//bolenler(35);
		asalBolenler(74582);
		
	}
	public static void bolenler(int n) {
		for(int i=1;i<=n;i++) {
			if(n%i==0)
				System.out.println(i);
		}
	}
	public static void asalBolenler(int n) {
		for(int i=2;i<=n;i++) {
			if(n%i==0) {
				boolean asal = true;
				for(int j=2;j<i;j++) {
					if(i%j==0) {
						asal = false;
						break;
					}		
				}
				if(asal)
					System.out.println(i);
			}

		}
	}
}

//Fundamental theorem of arithmetic