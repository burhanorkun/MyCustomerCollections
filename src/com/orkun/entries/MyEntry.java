package com.orkun.entries;

public class MyEntry<K,V> {
    private K k;
    private V v;
    private MyEntry<K,V> next;

    public MyEntry(K k, V v, MyEntry<K, V> next) {
        this.k = k;
        this.v = v;
        this.next = next;
    }

    public K getK() {
        return k;
    }

    public void setK(K k) {
        this.k = k;
    }

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }

    public MyEntry<K, V> getNext() {
        return next;
    }

    public void setNext(MyEntry<K, V> next) {
        this.next = next;
    }
}
