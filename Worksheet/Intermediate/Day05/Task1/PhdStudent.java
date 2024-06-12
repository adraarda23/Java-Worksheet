package Day05.Task1;

import java.util.Date;

public class PhdStudent extends GraduateStudent {
    private boolean qualifyingExamTaken;

    public PhdStudent(int no, String name, int year, Date dob, String major, String advisor, String thesis, boolean qualifyingExamTaken) {
        super(no, name, year, dob, major, advisor, thesis);
        this.qualifyingExamTaken = qualifyingExamTaken;
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

    public void writePaper() {
        // Implement writePaper method
    }
}

