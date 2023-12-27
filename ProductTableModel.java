/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coursework2023;
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

/**
 *
 * @author wijes
 */
public class ProductTableModel extends AbstractTableModel{
    private final String[] columnNames={"Product Id","Name","Category","Price($)","Info"};
    ArrayList<Product> productlist;
    
    
    public ProductTableModel(ArrayList<Product> productlist){
        this.productlist=productlist;
        
    
    }
 
    @Override
    public int getColumnCount(){
        return columnNames.length;
    }
    @Override
    public int getRowCount(){
        return productlist.size();
    }
    @Override
    
    public Object getValueAt(int row, int column) {
        Object temp = null;
        Product product = productlist.get(row);
        

    switch (column) {
    case 0:
        temp = product.getProductId();
        break;
    case 1:
        temp = product.getProductName();
        break;
    case 2:
        temp = product.getCategory();
        break;
    case 3:
        temp = product.getPrice(); // Convert to String
        break;
    case 4:
        if(product instanceof Electronics){
        temp = ((Electronics) product).getBrand()+" "+((Electronics) product).getWarrenty();}
        else if(product instanceof Clothing){
        temp = ((Clothing) product).getSize()+" "+((Clothing) product).getColor()  ;
        }

        break;
    default:
        // Handle the default case or leave it empty if not needed
        break;
}

    return temp;
    
}

    public String getColumnName(int column){
        return columnNames[column];
    }
    


    


    @Override
    public Class getColumnClass(int column){
        if(column==3){
            return Double.class;
        }else{
            return String.class;
        }
    }
    
}
