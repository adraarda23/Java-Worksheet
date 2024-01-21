package Day16;

public class get_set {
	private int x,y;
	public int z;
	
	
	public get_set(){
		
	}
	public get_set(int x,int y,int z) {
		this.x=x;
		this.y=y;
		this.z=z;
	}
	public  int getX() {
		return x;
	}
	public void setX(int x) {
		this.x=x;
	}
	public int calculateArea() {
		return x * y;
	}
	
}
