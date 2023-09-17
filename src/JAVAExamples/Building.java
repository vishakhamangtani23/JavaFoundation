package JAVAExamples;

public class Building<T> {
    private T flat;

    public T getFlat() {
        return flat;
    }

    public Building(T flat) {
        this.flat = flat;
    }

    public void setFlat(T flat) {
        this.flat = flat;
    }
}
