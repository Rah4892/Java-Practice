public class Demo1 {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer();

        str.append("test test test test");
        System.out.println("Length:"+str.length());
        System.out.println("Capacity:"+str.capacity());
    }
}
