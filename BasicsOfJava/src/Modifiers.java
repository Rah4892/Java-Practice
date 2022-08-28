public class Modifiers {
    //static variables
    static int var;
    int var2;
    public static void main(String[] args) {
        int a;
        Modifiers obj = new Modifiers();
        //System.out.println(a); //local variables must be initialized before usage
        System.out.println(obj);
        int arr[] = new int[5];
        System.out.println(arr);

        System.out.println(var+obj.var2);
        System.exit(20);
    }
}
