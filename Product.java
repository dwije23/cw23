/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coursework2023;

/**
 *
 * @author wijes
 */
public abstract class Product implements Comparable<Product>{ //abstrct class
    protected String productId;  //instance variables
    private String productName;
    private int numOfAvailableItems;
    private double price;
    private String category;
   

    
    //constructor to initialize instance variables
    public Product(String productId, String productName, int numOfAvailableItems,double price,String category){
        this.productId=productId;
        this.productName=productName;
        this.numOfAvailableItems=numOfAvailableItems;
        this.price=price;
        this.category=category;
        

    }
    public void setProductId(String productId){
        this.productId=productId;
    
    }
    public String getProductId(){
        return productId;
    }
    public void setProductName(String productName){
        this.productName=productName;
    
    }
    public String getProductName(){
        return productName;
    }
    public void setNumOfAvailableItems(int numOfAvailableItems){
        this.numOfAvailableItems=numOfAvailableItems;
    
    }
    public int getNumOfAvailableItems(){
        return numOfAvailableItems;
    }
    public void setPrice(double price){
        this.price=price;
    
    }
    public double getPrice(){
        return price;
    }
    public void setCategory(String category){
        this.category=category;
    
    }
    public String getCategory(){
        return category;
    }

    
    @Override
    public String toString(){
        return "[Product Id: "+ this.productId +"]"+ " "+"[Product Name: "+this.productName+"]"+" "+"[Available Items: "+this.numOfAvailableItems+"]"+" "+"[Price is: "+this.price+"]"+" "+"[Category is: "+this.category+"]";
    }
    @Override
    public int compareTo(Product p){
        if(this.getProductId().compareTo(p.productId)>0){
            return 1;
        }else if(this.getProductId().compareTo(p.productId)<0){
            return -1;
        }else if(this.getProductId().compareTo(p.productId)==0){
            return 0;
        }
        
        return 00;
        

    
    }
    
    
    
}
