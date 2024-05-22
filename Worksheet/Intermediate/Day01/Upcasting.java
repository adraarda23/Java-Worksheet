package Day01;

public class Upcasting {

	public static void main(String[] args) {
		Employee e= new Employee();
		Manager m= new Manager();
		Director d = new Director();

		printEmployeeName(e);
		printEmployeeName(m);
		printEmployeeName(d);
	}
	public static void printEmployeeName(Employee e) {
		System.out.println(e.getName());
	}
}

class Employee{
	public String Worker="Worker";
	String getName(){
		return Worker;
	}
}
class Manager extends Employee{
	public String Worker="Manager";
	String getName(){
		return Worker;
	}
}
class Director extends Manager{
	public String Worker="Director";
	
	String getName(){
		return Worker;
	}
}