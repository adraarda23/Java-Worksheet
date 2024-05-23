package Day03.AbstractAndCasting;

public class Engineer extends Employee {
	private String project;
	Engineer(String name , String surname,int workTime,String project){
		super(name,surname,workTime);
		this.project=project;
		
	}

	@Override
	public void work() {
		System.out.println("Engineer working");
		
	}

	@Override
	public void calculateSalary() {
		System.out.println(Employee.BASE_SALARY*3);
	}
	public void projectName() {
		System.out.println(this.project);
	}
	

}
