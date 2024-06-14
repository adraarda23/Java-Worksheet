
public class NestedClassesExample {

    public static void main(String[] args) {
        // Statik İç Sınıf
        TopClass.StaticInnerClass staticInner = TopClass.getStaticInnerClassInstance();
        staticInner.show();

        // İç Sınıf
        TopClass topClass = new TopClass();
        TopClass.InnerClass inner = topClass.getInnerClassInstance();
        inner.show();

        // Yerel Sınıf
        topClass.doIt(10);

        // Anonim Sınıf
        topClass.doAnonymousClass();
    }
}

class TopClass {
    private int i = 5;
    private static int j = 8;

    // Statik İç Sınıf
    static class StaticInnerClass {
        public StaticInnerClass() {
            // Statik iç sınıf sadece dış sınıfın statik üyelerine erişebilir
            System.out.println("in StaticInnerClass() and j: " + j);
        }
        
        public void show() {
            System.out.println("in show() of StaticInnerClass");
        }
    }

    public static StaticInnerClass getStaticInnerClassInstance() {
        return new StaticInnerClass();
    }

    // İç Sınıf
    class InnerClass {
        public InnerClass() {
            // İç sınıf dış sınıfın hem statik hem de statik olmayan üyelerine erişebilir
            System.out.println("in InnerClass() and i: " + i + " and j: " + j);
        }
        
        public void show() {
            System.out.println("in show() of InnerClass");
        }
    }

    public InnerClass getInnerClassInstance() {
        return new InnerClass();
    }

    // Yerel Sınıf
    public void doIt(int k) {
        // Yerel sınıf bir metodun içinde tanımlanır
        class LocalClass {
            public LocalClass() {
                System.out.println("in LocalClass()");
            }
            
            public void doLocal() {
                // Yerel sınıf metot içindeki değişkenlere ve dış sınıfın üyelerine erişebilir
                System.out.println("in doLocal() and i: " + i + " and j: " + j + " and k: " + k);
            }
        }

        LocalClass local = new LocalClass();
        local.doLocal();
    }

    // Anonim Sınıf
    public void doAnonymousClass() {
        new MyInterface() {
            {
                System.out.println("An instance initializer instead of a constructor.");
            }

            @Override
            public void aMethod() {
                // Anonim sınıf dış sınıfın üyelerine erişebilir
                System.out.println("aMethod in an anonymous class and i: " + i + ", j: " + j);
            }
        }.aMethod();
    }
}

interface MyInterface {
    void aMethod();
}
