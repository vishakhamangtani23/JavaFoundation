package CollectionFrameWorkImplementation;

public class ChildParentMain {
    public static void main(String[] args) {
        ChildClass c = new ChildClass();
        ParentClass p = new ChildClass();
        ParentClass pv = new ParentClass();
        c.perform1();
        p.perform1();
        pv.perform1();
//        p.perform2();
//        p is parent and p cant access c ka function
        System.out.println(p.prop);
        System.out.println(c.prop);
    }
}
