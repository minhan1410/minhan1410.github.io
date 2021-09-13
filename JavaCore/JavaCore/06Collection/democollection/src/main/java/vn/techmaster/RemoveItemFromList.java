package vn.techmaster;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class RemoveItemFromList {
  private ArrayList<Integer> listInt;

  public RemoveItemFromList() {
    listInt = new ArrayList<>();
    initListFromArray(1, 2, 3, 7, 6, 5, 8, 9, 0, 1, 2, 3);
  }

  public void initListFromArray(Integer ... numbers) {
    /* Cách này chậm
    for (Integer num: numbers){
      listInt.add(num);      
    }
    */

    //Cách nhanh hơn
    Collections.addAll(listInt, numbers);
  }

  public void removeOddNumbersBuggy() {
    for (int i = 0; i < listInt.size(); i++) {
      if (listInt.get(i) % 2 == 1) {
        listInt.remove(i);        
      }
    }
  }

  public void removeOddNumbers() {
    for (int i = 0; i < listInt.size(); i++) {
      if (listInt.get(i) % 2 == 1) {
        listInt.remove(i);
        i--;
      }
    }
    System.out.println(listInt);
  }  


  public void removeIfOddNumbers() {
    listInt.removeIf(n -> (n % 2 == 1)); //removeIf chỉ có trong ArrayList
    System.out.println(listInt);
  }

  public void removeOddNumbersIterator() {
    Iterator<Integer> iterator = listInt.iterator();
    while (iterator.hasNext()) {
      if (iterator.next() % 2 == 1) {
        iterator.remove();
      }      
    }
    System.out.println(listInt);
  }

  public void clearAllItems() {
    listInt.clear();
    System.out.println(listInt);
  }
}
