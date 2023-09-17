package JAVAExamples;
public class BoxMain {
    public static void main(String[] args) {
//        THis is raw type
        Box b1 = new Box();
        Box b2= new Box();
        Box b3 = new Box();
        Box b4 = new Box();
//        Box<String> bx = new Box<>();
//        bx.setX("pgg");
//        bx.getX();
        b1.setX("Hii Vish");
        b2.setX(99);
        b4.setX(b3);
        b3.setX(1.5);
        b1.getX();
        b2.getX();
        b3.getX();
        b4.getX();
//        Integer value = (Integer) b4.getX2();
//        System.out.println(value*100);
    }
}
