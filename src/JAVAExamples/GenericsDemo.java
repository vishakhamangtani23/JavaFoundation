package JAVAExamples;

public class GenericsDemo<T> {


    //    T stands for Type --Always use this convention
    public T getProp() {
        return prop;
    }

    public void setProp(T prop) {
        this.prop = prop;
    }

    private T prop;

}
