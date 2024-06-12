package Day05.Task1;

import java.util.Date;

public abstract class AbstractStudent implements Student {
    protected int no;
    protected String name;
    protected int year;
    protected Date dob;
    protected String major;

    public AbstractStudent(int no, String name, int year, Date dob, String major) {
        this.no = no;
        this.name = name;
        this.year = year;
        this.dob = dob;
        this.major = major;
    }


	@Override
    public String toString() {
        return "Student{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", dob=" + dob +
                ", major='" + major + '\'' +
                '}';
    }
}

