/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coursework2023;


/**
 *
 * @author wijes
 */
public class User {
    private String username;
    private int password;
    
    public User(String username, int password){
        this.username=username;
        this.password=password;
    }
    public void setUsername(String username){
        this.username=username;
    }
    public String getUsername(){
        return username;
    }
    public void setPassword(int password){
        this.password=password;
    }
    public int getPassword(){
        return password;
    }
    @Override
    public String toString(){
        return "Username is: "+this.username +" "+"Password is: "+this.password;
    }
}
