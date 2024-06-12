package Day05.Task1;

import java.util.Date;

public class MasterStudent extends GraduateStudent {
    public MasterStudent(int no, String name, int year, Date dob, String major, String advisor, String thesis) {
        super(no, name, year, dob, major, advisor, thesis);
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
    public void writeThesis() {
        // Implement writeThesis method
    }

    @Override
    public void meetWithAdvisor() {
        // Implement meetWithAdvisor method
    }
}

