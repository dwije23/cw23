/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coursework2023;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserLogin extends JFrame {

    private JLabel label1;
    private JLabel label2;
    private JTextField text1;
    private JPasswordField password;
    private JButton loginB;
    private JFrame frame1;
    private User user;
    

    public UserLogin() {
        
        setLayout(new FlowLayout());
        
        label1 = new JLabel("Username");
        label2 = new JLabel("Password");
        text1 = new JTextField(10);
        password = new JPasswordField(10);
        loginB = new JButton("Login");
        
        add(label1);
        add(text1);
        add(label2);
        add(password);
        add(loginB); 
        
        text1.setEditable(true);
        password.setEditable(true);
        
        MyListener listener = new MyListener();
        loginB.addActionListener(listener);
        
        
        
        
    }

    private class MyListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String username = text1.getText();
            char[] enteredPasswordChars = password.getPassword();
            String password = new String(enteredPasswordChars);

            if (username.equals("duleesha") && password.equals("123445")) {
                System.out.println("Login successful");
                dispose();
                openCenter();
               
                
            } else {
                System.out.println("Login Error");
            }
        }
    }

    
    public void setSeen(boolean b) {
        
    }
    public void openCenter(){
        westminsterShoppingCenter frame2 = new westminsterShoppingCenter();
        frame2.setTitle("Westminster Shopping Center");
        frame2.setSize(500, 300);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setVisible(true);
    
    }
}
