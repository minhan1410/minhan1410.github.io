package Hasing;

import java.util.ArrayList;
import java.util.Arrays;

public class MyHashMap {
    private ArrayList<Data> myBucket[];
    private final int SIZE = 1000;

    public MyHashMap() {
        myBucket = new ArrayList[SIZE];
        for (int i = 0; i < myBucket.length; i++) {
            myBucket[i] = new ArrayList<>();
        }
    }

    private int hashFunction(int key) {
        int hashValue = key % SIZE;
        return hashValue;
    }

    public void put(int key, int value) {
        int hashValueIndex = hashFunction(key);
        var bucket = myBucket[hashValueIndex];
        Data newData = new Data(key, value);
        int keyIndex = bucket.indexOf(newData);

        if (keyIndex >= 0) {
            bucket.get(keyIndex).value = value;
        } else {
            bucket.add(newData);
        }
    }

    public void remove(int key) {
        int hashValueIndex = hashFunction(key);
        var bucket = myBucket[hashValueIndex];
        Data newData = new Data(key, 0);
        bucket.remove(newData);
    }

    public int get(int key) {
        int hashValueIndex = hashFunction(key);
        var bucket = myBucket[hashValueIndex];
        Data newData = new Data(key, 0);
        int index = bucket.indexOf(newData);
        if (index >= 0) {
            return bucket.get(index).value;
        }
        return -1;
    }

    @Override
    public String toString() {
        String str = "";
        for (ArrayList<Data> arrayList : myBucket) {
            for (Data data : arrayList) {
                if (data != null) {
                    str += data + ", ";
                }
            }
        }
        return str;
    }

    public static void main(String[] args) {
        MyHashMap myMap = new MyHashMap();
        myMap.put(1, 1);
        myMap.put(2, 2);
        myMap.put(1, 2);
        myMap.put(3, 8);
        myMap.put(4, 1);
        myMap.put(5, 3);
        myMap.put(7, 9);

        System.out.println(myMap);

        myMap.remove(3);

        System.out.println(myMap);

        System.out.println("getKey: " + myMap.get(7));
    }
}
