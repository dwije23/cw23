/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coursework2023;

/**
 *
 * @author wijes
 */
public class Electronics extends Product {
    private String brand;
    private int warrentyPeriod;
    
    public Electronics(String productId, String productName, int numOfAvailableItems,double price,String category,String brand,int warrentyPeriod){
        super(productId,productName,numOfAvailableItems,price,category);
        this.brand=brand;
        this.warrentyPeriod=warrentyPeriod;
    }
    public void setBrand(String brand){
        this.brand=brand;
    }
    public String getBrand(){
        return brand;
    }
    public void setWarrenty(int warrentyPeriod){
        this.warrentyPeriod=warrentyPeriod;
    }
    public int getWarrenty(){
        return warrentyPeriod;
    }
    @Override
    public String toString(){
        return super.toString()+"[Brand is: "+this.brand+"]"+" "+"[Warrenty Period is: "+this.warrentyPeriod+"]";
    }
    @Override
    public int compareTo(Product p1){
        return this.getProductId().compareTo(p1.productId);}

}
