public class Reverse {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("This is a moon");
        //System.out.println("Reverse:"+str.reverse());

        str.insert(5, "RAHUL ");
        System.out.println("New string:"+str);

        str.replace(5, 11, "Sun ");
        System.out.println("After replace:"+str);

        str.delete(5,8);
        System.out.println("After delete:"+str);

    }
}
