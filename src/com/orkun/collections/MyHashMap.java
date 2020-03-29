package com.orkun.collections;

import com.orkun.entries.MyEntry;

public class MyHashMap<K, V> {
    private MyEntry<K, V>[] entryTable;
    private int initialCapacity = 16;

    public MyHashMap() {
        entryTable = new MyEntry[initialCapacity];
    }

    public MyHashMap(int capacity) {
        initialCapacity = capacity;
        entryTable = new MyEntry[initialCapacity];
    }

    private int hashValue(K k) {
        return Math.abs(k.hashCode()) % initialCapacity;
    }

    public void put(K key, V value) {
        if (key == null) {
            throw new RuntimeException("null key is not allowed");
        }
        int hashValue = hashValue(key);
        MyEntry<K, V> entry = new MyEntry<>(key, value, null);
        if (entryTable[hashValue] == null) { //daha once eklenmemis, ekleyebilirsin
            entryTable[hashValue] = entry;
        } else { // daha once eklenmis, next e ekle (linledlist e)
            MyEntry<K, V> previous = null;
            MyEntry<K, V> current = entryTable[hashValue];
            while (current != null) {
                if (current.getK().equals(key)) {
                    if (previous == null) {
                        entry.setNext(current.getNext());
                        entryTable[hashValue] = entry;
                    } else {
                        entry.setNext(current.getNext());
                        previous.setNext(entry);
                    }
                }
                previous = current;
                current = current.getNext();
            }
            previous.setNext(entry);
        }
    }

    public V get(K key) {
        if (key == null) {
            return null;
        }
        int hastValue = hashValue(key);
        if (entryTable[hastValue] == null) {
            return null;
        } else {
            MyEntry<K, V> temp = entryTable[hastValue];
            while (temp != null) {
                if (temp.getK().equals(key)) {
                    return temp.getV();
                }
                temp = temp.getNext();
            }
        }
        return null;
    }

    public boolean remove(K key) {
        if (key == null) {
            return false;
        }
        // hash value of the key
        int hashValue = hashValue(key);
        if (entryTable[hashValue] == null) {
            return false;
        } else {
            MyEntry<K, V> previous = null;
            MyEntry<K, V> current = entryTable[hashValue];
            while (current != null) {
                if (current.getK().equals(key)) {
                    if (previous == null) {
                        entryTable[hashValue] = entryTable[hashValue].getNext();
                        return true;
                    } else {
                        previous.setNext(current.getNext());
                        return true;
                    }
                }
                previous = current;
                current = current.getNext();
            }
            return false;
        }
    }

    public boolean containsKey(K key) {
        int hashValue = hashValue(key);
        if (entryTable[hashValue] == null) {
            return false;
        } else {
            MyEntry<K, V> current = entryTable[hashValue];
            while (current != null) {
                if (current.getK().equals(key)) {
                    return true;
                }
                current = current.getNext();
            }
        }
        return false;
    }

    public int size() {
        int count = 0;
        for (int i = 0; i < entryTable.length; i++) {
            if (entryTable[i] != null) {
                int nodeCount = 0;
                for (MyEntry<K, V> e = entryTable[i]; e.getNext() != null; e = e.getNext()) {
                    nodeCount++;
                }
                count += nodeCount;
                count++;// consider also vertical count
            }
        }
        return count;
    }


    public void removeAll() {
        for(int i = 0; i<entryTable.length; i++){
            entryTable[i] = null;
        }
    }

}
