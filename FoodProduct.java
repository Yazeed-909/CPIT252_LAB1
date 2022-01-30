/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cpit252_lab1;

/**
 *
 * @author yzeed
 */
import java.time.LocalDate;

public class FoodProduct extends Product{
  private LocalDate expirationDate;

  public FoodProduct(int id, double price, String name, LocalDate expirationDate){
   super(id, price, name);
    
    this.expirationDate = expirationDate;
    
  }
 @Override
  public void getSellableStatus(){
    System.out.println("This product is sellable");
  }
  @Override
  public String toString(){
     
    return super.toString() +"\t Expiration Date: " + this.expirationDate;
  }

  
    
   
    
    
}