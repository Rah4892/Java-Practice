class Parent {
    String s1 = "parent";
    public void m1 ()
    {
        System.out.println("parent class");
    }
}
class Child extends Parent {
    String s1 = "child";
    public void m1 ()
    {
        System.out.println("child class");
    }

    public void m1 (String s)
    {
        System.out.println("child class " + s);
    }
}
public class ParentChildTest {
    static int x;
    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();
        p.m1();		// parent class
        c.m1();		// child class
        //p.m1("hello");
        c.m1("hi");	// child class hi

        System.out.println(p.s1);	// parent
        System.out.println(c.s1);	// child

        p=c;
        p.m1();		// child class
        c.m1();		// child class
        //p.m1("hello");		// child class hello
        c.m1("hi");	// child class hi

        System.out.println(p.s1);	// child
        System.out.println(c.s1);	// child

        ParentChildTest t1 = new ParentChildTest();
        ParentChildTest t2 = new ParentChildTest();
        t1.x = 100;
        t2.x = 200;
        System.out.println(t1.x); 	// 200

    }
}