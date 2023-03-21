/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

/**
 *
 * @author mdalla
 */
public class User {
    private String firstName;
    private String email;
    private String password;

    public String getName(){
        return this.firstName;
    }
    public void setName(String name){
        this.firstName = name;
    }
    public String getEmail(){
        return this.email;

    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword(){
        return this.password;
    }
    public void setPassword (String password){
        this.password=password;

    }
    //instance method that returns CSV OF THE ObJECT
    public String convertToCsv(){
        return this.getName()
                + "," + this.getEmail()
                + "," + this.getPassword();
    }

}
