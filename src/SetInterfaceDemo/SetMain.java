package SetInterfaceDemo;

public class SetMain {
    public static void main(String[] args) {
        SetClasses set = new SetClasses();
        set.hashSetDemo();
        System.out.println("====================");
        set.treeSetDemo();
        System.out.println("====================");
        set.linkedHashSetDemo();
        System.out.println("====================");
        set.removeDuplicatesfromArray();
        System.out.println("====================");
        set.seperateUnique();
        System.out.println("====================");
        set.bulkOperation();
    }
}
