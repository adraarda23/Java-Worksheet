package Day05.Task1;

import java.util.Date;

public class UndergraduateStudent extends AbstractStudent {
    private String minor;

    public UndergraduateStudent(int no, String name, int year, Date dob, String major, String minor) {
        super(no, name, year, dob, major);
        this.minor = minor;
    }

    @Override
    public void study() {
        // Implement study method
    }

    @Override
    public void register() {
        // Implement register method
    }

    @Override
    public String toString() {
        return super.toString() + ", minor='" + minor + '\'' + '}';
    }
}

