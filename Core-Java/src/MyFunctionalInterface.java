public interface MyFunctionalInterface {
    public void abstractShow();

    public static void display() {
        System.out.println("Static Display");
    }

    public default void show() {
        System.out.println("Default show");
    }
}
