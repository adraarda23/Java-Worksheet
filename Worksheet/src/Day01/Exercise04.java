package Day01;

public class Exercise04 {
    public static void main(String[] args) {
        Car obj1 = new Car();
        Car obj2 = new Car();
        obj1.make = "test";
        obj2.make = "test2";
        
        int hashCode1 = System.identityHashCode(obj1.make);
        int hashCode2 = System.identityHashCode(obj2.make);
        
        System.out.println("obj1.hashCode: " + hashCode1);
        System.out.println("obj2.hashCode: " + hashCode2);
        
        obj1.make = obj2.make;
        
        
        int newHashCode1 = System.identityHashCode(obj1.make);
        System.out.println("Yeni obj1.hashCode: " + newHashCode1);
        
        obj2.make = "test3";
        int hashCode3 = System.identityHashCode(obj2.make);
        System.out.println("obj2.hashCode: " + hashCode3);
        
        int finalHashCode1 = System.identityHashCode(obj1.make);
        System.out.println("Son obj1.hashCode: " + finalHashCode1);
    }
}

class Car {
    public String make;
}


/*
Note1:Object variable can share same adress but cant be changed by other Object variable adress change

  */
