package lab20.number123;


import java.io.Serializable;

public class MyGenericClass<T extends Comparable<T>, V extends Serializable, K> {
    private T t;
    private V v;
    private K k;

    public MyGenericClass(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }

    public void printClassNames() {
        System.out.println("T class name: " + t.getClass().getName());
        System.out.println("V class name: " + v.getClass().getName());
        System.out.println("K class name: " + k.getClass().getName());
    }
}
