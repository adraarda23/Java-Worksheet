package Day17;
//Immutable Object
public class ImmutableObject {
    private final String name;
    private final int age;

    public ImmutableObject(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
