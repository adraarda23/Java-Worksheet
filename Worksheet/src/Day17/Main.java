package Day17;

public class Main {
    public static void main(String[] args) {
        Singleton singletonInstance1 = Singleton.getInstance();
        System.out.println("Veri 1: " + singletonInstance1.getData());

        Singleton singletonInstance2 = Singleton.getInstance();
        Singleton singletonInstance3 = Singleton.getInstance();
        System.out.println("Veri 2: " + singletonInstance2.getData());

        singletonInstance1.setData("Yeni veri");

        System.out.println("Veri 1 Güncellendi: " + singletonInstance1.getData());
        System.out.println("Veri 2: " + singletonInstance2.getData());
        int hashCode1 = System.identityHashCode(singletonInstance1);
        int hashCode2 = System.identityHashCode(singletonInstance2);

        if(singletonInstance1==singletonInstance2)
        	System.out.println(true);
        else
        	System.out.println(false);
        System.out.println(hashCode1);
        System.out.println(hashCode2);
        

        System.out.println(singletonInstance2.getCreateCounter());
    }
}

//Note1: Changes in data1 changes data2 (Address of singletons are same because its same object)
