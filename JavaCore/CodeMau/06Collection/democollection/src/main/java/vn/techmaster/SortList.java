package vn.techmaster;

import java.util.ArrayList;
import java.util.Collections;


public class SortList {
  private ArrayList<Integer> listInt;

  public SortList() {
    listInt = new ArrayList<>();
    initListFromArray(1, 2, 3, 7, 6, 5, 8, 9, 0, 1, 2, 3);
  }
  public void initListFromArray(Integer ... numbers) {
    Collections.addAll(listInt, numbers);
  }

  public void sortListSimple() {
    System.out.println("==============\nFrom small to big");
    Collections.sort(listInt);    
    System.out.println(listInt);

    System.out.println("==============\nFrom big to small");
    Collections.sort(listInt, Collections.reverseOrder());
    System.out.println(listInt);
  }
}
