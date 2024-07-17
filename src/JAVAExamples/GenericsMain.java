package JAVAExamples;

public class GenericsMain {
    public static void main(String[] args) {
        GenericsDemo<Integer> integerGenericsDemo1 = new GenericsDemo<>();
        GenericsDemo<Integer> integerGenericsDemo2 = new GenericsDemo<>();
        integerGenericsDemo1.setProp(123);
        integerGenericsDemo2.setProp(123);
        System.out.println(integerGenericsDemo1.getProp());
        System.out.println(integerGenericsDemo2.getProp());
        GenericsDemo<String> stringGenericsDemo = new GenericsDemo<>();
        stringGenericsDemo.setProp("Hii vishu cutie");
        System.out.println(stringGenericsDemo.getProp());
//        The below is compile time error
//        Integer value = (Integer) stringGenericsDemo.getProp();
        System.out.println(compare(integerGenericsDemo1,integerGenericsDemo2));

    }
    public static <T>  boolean compare(GenericsDemo g1, GenericsDemo g2 )
    {
        return g1.getProp().equals(g2.getProp());
    }
}
