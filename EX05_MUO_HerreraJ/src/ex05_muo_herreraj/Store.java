package ex05_muo_herreraj;

import java.util.*;

public class Store {
  private String name;
  private double earnings;
  private ArrayList<Item> itemList;
  private static ArrayList<Store> storeList = new ArrayList();

  public Store(String name){
    // Initialize name to parameter and earnings to zero
    // Initialize itemList as a new ArrayList
    // add 'this' store to storeList
    this.name = name;
    this.itemList = new ArrayList<>();
    this.storeList.add(this);
  }

  public String getName(){
    return name;
  }
  public double getEarnings(){
    return earnings;
  }
  public void sellItem(int index){
    // check if index is within the size of the itemList (if not, print statement that there are only x items in the store)
    // get Item at index from itemList and add its cost to earnings
    // print statement indicating the sale
    if (index > this.itemList.size() - 1){
        System.out.println("There are only " + this.itemList.size() + " items in the store");
    } else {
        Item purchasedItem = itemList.get(index);
        earnings += purchasedItem.getCost();
        System.out.println("You have purchased " + purchasedItem.getName() + " for " + purchasedItem.getCost() + " pesos.");
    }
  }
  public void sellItem(String name){
    // check if Item with given name is in the itemList (you will need to loop over itemList) (if not, print statement that the store doesn't sell it)
    // get Item from itemList and add its cost to earnings
    // print statement indicating the sale
    boolean purchasedDone = false;
    for(Item e: this.itemList) {
        String item = e.getName();
        if (item.equalsIgnoreCase(name) == true){
            earnings += e.getCost();
            System.out.println("You have purchased " + e.getName() + " for " + e.getCost() + " pesos.");
            purchasedDone = true;
        }
    }
    if (purchasedDone == false){
        System.out.println("This store doesn't sell " + name + ".");
    }
  }
  public void sellItem(Item i){
    // check if Item i exists in the store (there is a method that can help with this) (if not, print statement that the store doesn't sell it)
    // get Item i from itemList and add its cost to earnings
    // print statement indicating the sale
    boolean purchasedDone = false;
    for(Item e: this.itemList) {
        if (e == i){
            earnings += e.getCost();
            System.out.println("You have purchased " + e.getName() + " for " + e.getCost() + " pesos.");
            purchasedDone = true;
        }
    }
    if (purchasedDone == false){
        String thing = i.getName();
        System.out.println("This store doesn't sell " + i.getName() + ".");
    }
  }
  public void addItem(Item i){
    // add Item i to store's itemList
    itemList.add(i);
  }
  public void filterType(String type){
    // loop over itemList and print all items with the specified type
    for(Item e: this.itemList) {
        if (e.getType().equalsIgnoreCase(type) == true){
            System.out.println(e.getName() + ": P" + e.getCost());
        }
    }
  }
  public void filterCheap(double maxCost){
    // loop over itemList and print all items with a cost lower than or equal to the specified value
    for(Item e: this.itemList) {
        if (e.getCost() <= maxCost){
            System.out.println(e.getName() + ": P" + e.getCost());
        }
    }
  }
  public void filterExpensive(double minCost){
    // loop over itemList and print all items with a cost higher than or equal to the specified value
    for(Item e: this.itemList) {
        if (e.getCost() >= minCost){
            System.out.println(e.getName() + ": P" + e.getCost());
        }
    }
  }
  public static void printStats(){
    // loop over storeList and print the name and the earnings'Store.java'
    for(int i = 0; i < storeList.size(); i++){
        System.out.println("Store: " + storeList.get(i).getName() + ", Earnings: " + storeList.get(i).getEarnings());
    }
  }
}
