package Day05.Task2_3;

public abstract class Engineer {
    protected String name;

    public Engineer(String name) {
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("Engineer: " + name);
    }
}
