/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coursework2023;

/**
 *
 * @author wijes
 */
public class Clothing extends Product{
    private int size;
    private String Color;
    
    public Clothing(String productId, String productName, int numOfAvailableItems,double price,String category, int size,String color){
        super(productId,productName,numOfAvailableItems,price,category);
        this.size=size;
        this.Color=color;
    }
    public void setSize(int size){
        this.size=size;
    }
    public int getSize(){
        return size;
    }
    public void setColor(String Color){
        this.Color=Color;
    }
    public String getColor(){
        return Color;
    }
    @Override
    public String toString(){
        return super.toString()+" "+"[Size is: "+this.size+"]"+" "+"[Color is: "+this.Color+"]";
    }
    
    @Override
    public int compareTo(Product p2){
        return this.getProductId().compareTo(p2.productId);}
}
