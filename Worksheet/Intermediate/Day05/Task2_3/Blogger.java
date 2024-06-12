package Day05.Task2_3;

interface Blogger {
    default void blog() {
        System.out.println("Blogger: Writes a blog.");
    }
}
