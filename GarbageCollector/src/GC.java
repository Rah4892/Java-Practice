public class GC {
    GC i;
    public static void main(String[] args) {
        GC obj1 = new GC();
        GC obj2 = new GC();

        obj1.i = obj2;
        obj2.i = obj1;

        obj1 = null;
        obj2 = null; //only when both the objects are null then GC will be called on these objects.
        System.gc();

    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method called");
    }
}
