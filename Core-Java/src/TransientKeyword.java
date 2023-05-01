public class TransientKeyword {
    transient int k = 25;
    static int i = 10;
    final int j = 30;
    public static void main(String[] args) {
        //TransientKeyword.k = 62;
        i = 36;
        System.out.println("i="+i);
        //System.out.println("k="+k);

    }
}
