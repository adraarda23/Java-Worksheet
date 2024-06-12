package Day05.Task1;

import java.util.Date;

public class GraduateStudent extends AbstractStudent {
    protected String advisor;
    protected String thesis;

    public GraduateStudent(int no, String name, int year, Date dob, String major, String advisor, String thesis) {
        super(no, name, year, dob, major);
        this.advisor = advisor;
        this.thesis = thesis;
    }

    @Override
    public void study() {
        // Implement study method
    }

    @Override
    public void register() {
        // Implement register method
    }

    public void writeThesis() {
        // Implement writeThesis method
    }

    public void meetWithAdvisor() {
        // Implement meetWithAdvisor method
    }
}
