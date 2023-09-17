package JAVAExamples;

public class Pair <K,V> {
    public K getKey() {
        return key;
    }

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public void setKey(K key) {
        this.key = key;
    }

    private K key;
    private V value;

}
//K-KEY
//V-VALUE
//T-TYPE
//E-ELEMENT
