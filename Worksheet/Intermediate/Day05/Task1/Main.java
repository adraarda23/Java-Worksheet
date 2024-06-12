package Day05.Task1;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Date date = new Date();
		GraduateStudent obj1 =new MasterStudent(3,"a",2001,date, "major", "TuTu","Tez");
		Student obj2 =new MasterStudent(3,"a",2001,date, "major", "TuTu","Tez");   //Same object but obj2 cannot reach GraduateStudent methods
		

		GraduateStudent obj3 =new PhdStudent(3,"a",2001,date, "major", "TuTu","Tez",true);
		GraduateStudent obj4 =new MasterStudent(3,"a",2001,date, "major", "TuTu","Tez"); //Differen object but both type is GraduateStudent
		//They cannot reach their spesific methods
		PhdStudent obj5 =new PhdStudent(3,"a",2001,date, "major", "TuTu","Tez",true);
		obj5.writePaper(); //legit here
		//obj3.writePaper(); not legit
	}

}
