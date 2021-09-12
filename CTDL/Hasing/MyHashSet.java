package Hasing;

import java.util.ArrayList;

public class MyHashSet {

    private ArrayList<Integer> myBucket[]; //Một mảng các ArrayList
    private final int SIZE = 1000;
    
   public MyHashSet() {
       myBucket = new ArrayList[SIZE];

       for (int i = 0; i < myBucket.length; i++) {
           //Mỗi 1 phần tử của mảng là một arraylist
           myBucket[i] = new ArrayList<>();
       }
    }


    private int hashFunction(int key){
        int hashValue = key % 1000;
       return hashValue;
    } 

   public void add(int key){
        //b1: băm
        int hashValueIndex = hashFunction(key);
        //Tham chiếu hashValueIndex đễn cái bucket
        var bucket = myBucket[hashValueIndex];

        //Kiểm tra xem đã tồn tại chưa
        int keyIndex = bucket.indexOf(key);
        if(keyIndex < 0){
            bucket.add(key);
        }
   }

   public void remove(int key){
       int hashValueIndex = hashFunction(key);
       var bucket = myBucket[hashValueIndex];
       int keyIndex = bucket.indexOf(key);
       if(keyIndex >= 0){
           bucket.remove(keyIndex);
       }

   }

   public boolean contains(int key){
       int hashValueIndex = hashFunction(key);
       var bucket = myBucket[hashValueIndex];
       int keyIndex = bucket.indexOf(key);

       return keyIndex >= 0;
   }


   public static void main(String[] args) {
       MyHashSet mySet = new MyHashSet();
       mySet.add(1);
       mySet.add(2);
       mySet.add(1);
       System.out.println("mySet.contains(1): "+mySet.contains(1));
       mySet.remove(1);
       System.out.println("mySet.contains(1): "+mySet.contains(1));
   }
}
