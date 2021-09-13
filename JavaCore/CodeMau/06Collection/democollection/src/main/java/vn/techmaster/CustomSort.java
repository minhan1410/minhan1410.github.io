package vn.techmaster;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Stock implements Comparable<Stock> {
  String name;
  double price;
  public Stock(String name, double price) {
    this.name = name;
    this.price = price;
  }

  public double getPrice() {
    return price;
  }
  @Override
  public int compareTo(Stock stock) {    
    return this.name.compareTo(stock.name);
  }

  @Override
  public String toString() {
    return this.name + " : " + this.price;
  }

}
public class CustomSort {
  private ArrayList<Stock> stocks = new ArrayList<>();

  public CustomSort() {
    stocks.add(new Stock("VING", 29.3));
    stocks.add(new Stock("MSFT", 12.5));
    stocks.add(new Stock("APPL", 31.5));
    stocks.add(new Stock("GOGL", 24.7));
    stocks.add(new Stock("TESLA", 39.8));    
  }

  public void sort() {
    System.out.println("==============\nSort by name A to Z");
    Collections.sort(stocks);
    System.out.println(stocks);

    System.out.println("==============\nSort by price from Small to Big");
    Comparator<Stock> stockPriceComparator = Comparator.comparing(Stock::getPrice);
    Collections.sort(stocks, stockPriceComparator);
    System.out.println(stocks);


    System.out.println("==============\nSort by price from Big to Small");
    Collections.sort(stocks, stockPriceComparator.reversed());
    System.out.println(stocks);
  }
  
}
