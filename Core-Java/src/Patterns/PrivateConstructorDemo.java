package Patterns;

class RestrictInstances {
    private static int instanceCount = 0;
    public static RestrictInstances getInstance() {
        if(instanceCount < 5) {
            return new RestrictInstances();
        }
        System.out.println("Limit of instances reached");
        return null;
    }

    private RestrictInstances() {
        instanceCount++;
        System.out.println("instance "+instanceCount+" created");
    }

}
public class PrivateConstructorDemo {
    public static void main(String[] args) {
        RestrictInstances obj;
        int i=1;
        while(i<10) {
            obj = RestrictInstances.getInstance();
            i++;
        }
    }
}
