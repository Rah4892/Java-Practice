public class VarArgs {
    public static void main(String[] args) {
        display(5);
        display(4,10,23,45);
        //show(1);    //This reference to the show() method is ambiguous since both the methods match for the call
    }

    public static void display(int ...values) {
        System.out.println("No of arguments: "+values.length);
        for(int i: values) {
            System.out.println(i);
        }
    }

    //creating two methods with same name
    public static void show(int ...a) {
        System.out.println("Hello Show");
    }

    //the variable argument has to be the last parameter in the method signature
    public static void show(int n, int ...a) {
        System.out.println("Hello Show Again");
    }
}
