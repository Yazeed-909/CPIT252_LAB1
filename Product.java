/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cpit252_lab1;

/**
 *
 * @author yzeed
 */
public abstract  class Product {
  protected int id;
  protected double price;
  protected String name;
  protected double weight;
  protected String orderStatus;
  protected static int quantity;
  protected int orderId;
  
  
  
  public Product(int id, double price, String name){
    this.id = id;
    this.price = price;
    this.name = name;
    this.orderStatus = "created";
    this.quantity ++;
  }
public void applySaleDiscount(double percentage){
    this.price = this.price - ((percentage/100) * this.price);
  }

  final void addToShoppingCart(){
    System.out.println(this.name + " has been added to the shopping cart.");
  }

  public void printTotalQuantity(){
    System.out.println("Total Quantity: " + this.quantity);
  }
  
  public abstract void getSellableStatus();
   

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", price=" + price + ", name=" + name + ", weight=" + weight + ", orderStatus=" + orderStatus + ", quantity=" + quantity + ", orderId=" + orderId + '}';
    }
  
  
  
  
}