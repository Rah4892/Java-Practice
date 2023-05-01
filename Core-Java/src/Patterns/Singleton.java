package Patterns;

class Helper {
    //static instance of type Singleton
    private static Helper instance = null;

    private String str;

    //Private constructor
    private Helper() {
        str = "Singleton class";
    }

    //static method to check and create a instance
    //will create instance only when no instances exist
    public static Helper getInstance() {
        if (instance == null) {
            instance = new Helper();
        }
        return instance;
    }
}

public class Singleton {
    public static void main(String[] args) {
        Helper obj1 = Helper.getInstance();
        Helper obj2 = Helper.getInstance();
        Helper obj3 = Helper.getInstance();

        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
        System.out.println(obj3.hashCode());
    }
}
