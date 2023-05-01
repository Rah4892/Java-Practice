import java.util.Objects;

class Test implements Cloneable{
    int id;
    String name;

    Test(int id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class CloneableTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Test obj = new Test(52, "Rahul");
        Test obj2 = (Test) obj.clone();

        System.out.println(obj2.id);
        System.out.println(obj2.name);

    }
}
