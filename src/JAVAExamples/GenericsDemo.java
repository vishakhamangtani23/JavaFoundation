package JAVAExamples;

public class GenericsDemo<T> {
    private T prop;


    //    T stands for Type --Always use this convention
    public T getProp() {
        return prop;
    }

    public void setProp(T prop) {
        this.prop = prop;
    }



}
