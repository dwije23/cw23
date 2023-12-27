/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coursework2023;

import java.util.Scanner;
import java.util.ArrayList;

import java.io.*;
import java.io.IOException;

import javax.swing.JFrame;

/**
 *
 * @author wijes
 */
public class WestminsterShoppingManager implements ShoppingManager{
    
    public ArrayList<Product> productlist;
    private westminsterShoppingCenter center;
    ProductTableModel p = new ProductTableModel(productlist);
    public WestminsterShoppingManager(){
       productlist = new ArrayList<>(50);
    }
    public static void main(String[] args){
        WestminsterShoppingManager manager = new WestminsterShoppingManager();
        int i=0;
        while(i<100){
        System.out.println("Welcome to the Online Shopping Center");
        System.out.println("----------------------------------------------");
        System.out.println("1)Add a product");
        System.out.println("2)Delete a product");
        System.out.println("3)Print products");
        System.out.println("4)Save products");
        System.out.println("5)GUI");        
        System.out.println("Enter your option:");
        System.out.println("----------------------------------------------");

        Scanner option= new Scanner(System.in);
        int input=option.nextInt();
        
        switch(input){
            case 1:
                manager.addProduct();
                break;
            case 2:
                manager.deleteProduct();
                break;
            case 3:
                manager.printProduct();
                break;
            case 4:
                manager.saveProduct();
                break;
            case 5:
                manager.gui();
                break;
            default:
                System.out.println("Invalid option");
            
        }i++;
        
        
        }
        
      

    }
    public void addProduct(){
        
        Scanner input2= new Scanner(System.in);
        System.out.println("Enter the 1 for Electronics and 2 for Clothing of the product:");
        int type =input2.nextInt();
        if(type==1){
            System.out.println("Welcome to electronics");
            Scanner input3 = new Scanner(System.in);
            System.out.println("Enter productId: ");
            String id = input3.next();
            System.out.println("Enter productName: ");
            String name = input3.next();
            System.out.println("Available items: ");
            int items= input3.nextInt();
            System.out.println("Enter the price:");
            double price =input3.nextDouble();
            System.out.println("Enter the Category:");
            String category =input3.next();
            System.out.println("Enter the brand:");
            String brand1 =input3.next();
            System.out.println("Enter the warrenty period:");
            int warrenty =input3.nextInt();
            Electronics e1 = new Electronics(id,name,items,price,category,brand1,warrenty);
            System.out.println(e1);
            productlist.add(e1);
            System.out.println(productlist);
            System.out.println("Product has been added");
            System.out.println(" ");
            
            
        }else if(type ==2){
            System.out.println("Welcome to clothing");
            Scanner input4 = new Scanner(System.in);
            System.out.println("Enter productId: ");
            String id1 = input4.next();
            System.out.println("Enter productName: ");
            String name1 = input4.next();
            System.out.println("Available items: ");
               int items1= input4.nextInt();
            System.out.println("Enter the price:");
               double price1 =input4.nextDouble();
            System.out.println("Enter the Category:");
            String category1 =input4.next();
            System.out.println("Enter the size1:");
               int size1 =input4.nextInt();
            System.out.println("Enter the color:");
               String color1 =input4.next();
            Clothing c1 = new Clothing(id1,name1,items1,price1,category1,size1,color1);
            System.out.println(c1);
            productlist.add(c1);
            System.out.println("Product has been added");
            System.out.println(" ");
        
        }else{
            System.out.println("Invalid option");
        }
        
        
        
    }
    
    public void deleteProduct(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter productId of the product to be removed:");
        String n1 = sc.next();
        for(int i=0; i<productlist.size();i++){
            if(n1.equals(productlist.get(i))){
                productlist.remove(i);
                System.out.println("product removed");
        
        }else{
            System.out.println("Invalid option");
            }
        
        }
    
    }
    public void printProduct(){
       
       System.out.println("All products");
       for(Product p: productlist){
            if(p instanceof Electronics){
                System.out.println("Electronics"+p);
            }
            else if(p instanceof Clothing){
                System.out.println("Clothing"+p);        
                       
            }
       }
       System.out.println("Sorted products");
       for(Product p: productlist){
            if(p instanceof Electronics){
                System.out.println("Electronics"+p);
            }
            else if(p instanceof Clothing){
                System.out.println("Clothing"+p);        
                       
            }
       }
      
       System.out.println(productlist+"\n");
        
    
    }
    public void saveProduct(){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("products.txt"))) {
            for (Product product : productlist) {
                if(product instanceof Electronics){
                    writer.write("Electronics"+ product);
                    writer.newLine();
                }else if(product instanceof Clothing){
                    writer.write("Clothing"+ product);
                    writer.newLine();
                }
            }
            System.out.println("Products saved to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void gui(){
       westminsterShoppingCenter frame2 = new westminsterShoppingCenter(productlist);
       frame2.setSeen(true);
        
       
        
    }
    public ArrayList<Product> getProductList() {
        return productlist;
        
    }
    
    
}
