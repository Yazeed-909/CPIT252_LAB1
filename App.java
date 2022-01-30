/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cpit252_lab1;

import java.time.LocalDate;

/**
 *
 * @author yzeed
 */
public class App{

  public static void main(String[]args){
   // Product p1 = new Product(6745, 5.50, "Penne Pasta");
    //Product p2 = new Product(8853, 6.50, "Spaghetti Pasta");
    //Product p3 = new Product(2106, 4.50, "Linguine Pasta");
    //p3.printTotalQuantity();
    
    FoodProduct p = new FoodProduct(1234, 9.99, "water",LocalDate.parse("2022-06-07"));
    FoodProduct p4 = new FoodProduct(3452, 10.0, "Cheddar Cheese", 
    LocalDate.parse("2022-06-07"));
    ElectricProduct p5 = new ElectricProduct(4875, 30.0, "Extension cord", "220v");
    Product[] array=new Product[2];
     array[0]=p5;
     
      for (Product array1 : array) {
          if (array1 instanceof FoodProduct) {
              System.out.println("food");
              
          }
                  }
  }
}