/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coursework2023;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemListener;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author wijes
 */
public class westminsterShoppingCenter extends JFrame{
    private JButton b1;
    private JLabel l1;
    private boolean seen;
    private JTable table;
    ArrayList<Product> productlist;
    
    public westminsterShoppingCenter(ArrayList<Product> productlist){
                this.productlist =productlist;
                
                setSize(600, 600);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
                setTitle("Westminster Shopping Center");
                
        
                JLabel t1 = new JLabel("Select product category");
                topPanel.add(t1);

                JComboBox<String> products = new JComboBox<>(new String[]{"All", "Electronics", "Clothing"});
                topPanel.add(products);
                

                JButton b1 = new JButton("Shopping Cart");

                setLayout(new FlowLayout());
                add(topPanel, FlowLayout.LEFT);
                add(b1);
                MyListener mylistener1 =new MyListener();
                
                products.addItemListener(mylistener1);
                b1.addActionListener(mylistener1);
                
                

                setVisible(true);
        
  
        
        
       
    
    }
    
    private class MyListener implements ItemListener,ActionListener{
        @Override
        public void itemStateChanged(ItemEvent ie) {
            if (ie.getStateChange()==ItemEvent.SELECTED) {
                    Object selected = ie.getItem();
                    System.out.println("Selected"+" "+selected);
                       
                if(selected=="All"){
                    
                    JTable table = new JTable(new ProductTableModel(productlist));
                    JScrollPane scrollPane = new JScrollPane(table);
                    ProductTableModel model = new ProductTableModel(productlist);
                    // Add data to the model here
                    table.setModel(model);


                    // Set preferred size for the table or the container
                    table.setPreferredScrollableViewportSize(new Dimension(400, 200));

                    add(scrollPane);
                    setVisible(true);

                    
                    validate();
                    JSeparator sepa = new JSeparator();
                    sepa.setOrientation(0); 

     
                    add(sepa);
                    
                
                    
                       
                    }
            
                else if(selected=="Electronics"){
                    
                
                }
                else if(selected=="Clothing"){
                
                }else{
                    System.out.println("Invalid");
                }}
                
        
        
    }@Override
        public void actionPerformed(ActionEvent e){
            
            openCart();
            
        }
    }
    
    public void openCart(){
        ShoppingCart frame3 = new ShoppingCart();
        frame3.setTitle("Shopping Cart");
        frame3.setSize(500, 300);
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame3.setVisible(true);
        
    
    }
    

    public void setSeen(boolean seen) {
        
        
    }
}

