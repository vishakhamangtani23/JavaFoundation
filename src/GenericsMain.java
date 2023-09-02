public class GenericsMain {
    public static void main(String[] args) {
        GenericsDemo<Integer> integerGenericsDemo = new GenericsDemo<>();
        integerGenericsDemo.setProp(123);
        System.out.println(integerGenericsDemo.getProp());
        GenericsDemo<String> stringGenericsDemo = new GenericsDemo<>();
        stringGenericsDemo.setProp("Hii vishu cutie");
        System.out.println(stringGenericsDemo.getProp());
//        The below is compile time error
//        Integer value = (Integer) stringGenericsDemo.getProp();
    }
}
