package Day03.AbstractAndCasting;

public abstract class Employee {
	public final static int BASE_SALARY=10000;
	public String name;
	public String surname;
	public int workTime;
	Employee(String name,String surname,int workTime){
		this.name=name;
		this.surname=surname;
		this.workTime=workTime;
	}
	public abstract void work();
	public abstract void calculateSalary();
}
