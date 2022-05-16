
 /* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.loginclass;

import java.util.Scanner;

/**
 *
 * @author Palesa Masoba
 */
public class LoginClass {

    public static void main(String[] args) {
        System.out.println("Please enter your first name");
        String firstName = input.nextLine();
        System.out.println("The" + firstName + "is successfully captured");
        
        System.out.println("Please enter your last name");
        String lastName = input.nextLine();
        System.out.println("The" + lastName + "is successfully captured");
        
        
        System.out.println("Please enter a username, username should not exceed 5 characters in length and should include an underscore");
        String username = input.nextLine();
        System.out.println("The" + username + "is successfully captured");
        
        System.out.println("Please enter your password, password should include at least 8 characters, a capital letter, a digit, and special character");
        String password = input.nextLine();
        System.out.println("The" + password + "is successfully captured");
               
        
    }
    public static Scanner input = new Scanner(System.in);
    public static boolean checkUsername(String username){
        
        boolean underscore = false;
        boolean limit = false;
        
        for(int i = 0; i<username.length(); i++){
        if(username.charAt(i)==95)
        underscore = true;
        }
       
        if(username.length()<=5){
        limit = true;   
        }
        
        if(underscore && limit){
        System.out.println("Username is successfully captured");
        }
        else
        {
        System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length");
        }
        return true;
    
       
        }
 
    public static boolean checkPasswordComplexity(String password){
        
        boolean length = false;
        boolean uppercase = false;
        boolean number = false;
        boolean specialCharacter = false;
        
        for(int x =0; x<password.length(); x++){
            
        if(password.length()>=8){
            length = true;    
        }
            
        if(password.charAt(x)>=65 && password.charAt(x)<=90){
           uppercase = true;
        }
        
        if(password.charAt(x)>=48 && password.charAt(x)<=57){
            number = true;
        }
        
        if(password.charAt(x)>=33 || password.charAt(x)<=47 || password.charAt(x)>=58 || password.charAt(x)<=64 || password.charAt(x)>=91 || password.charAt(x)<=96 || password.charAt(x)>=123 || password.charAt(x)<=126){
            specialCharacter = true;
        }
        if(length && uppercase && number && specialCharacter){
        System.out.println("Password is successfully entered");    
        }
        else
        
        System.out.println("Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a didgit and a special character");
        return true;
        }
        return false;
    }
    
    public static  String registerUser (String username, String password){
        if(checkUsername(username) && checkPasswordComplexity(password)==true){
            
        System.out.println("You have been succesfully registered");    
        }      
        else
        {
        System.out.println("The username && password is incorrect");{
        return "You have been regitered";    
        }    
        }
        return null;
    }
    
    public static boolean logInUser (String username, String password){
        
        String logInPass = input.nextLine();
        
        boolean logUsername = false;
        boolean logPassword = false;
        
        if(username.equals(username)){
           logUsername = true; 
        }
    
        if(password.equals(password)){
            logPassword = true;
        }
        if(logUsername && logPassword){
        System.out.println("Welcome back!");
        }
        else
        {
        System.out.println("The username or password is incorrect");
        }    
        return true || false;
    }
    public static boolean returnLogInStatus (String username, String password, String logInUser, String logInPass){
        
        if(logInUser.equals(username) && logInPass.equals(password)== true){
        System.out.println("The Login was successful");
        return true;
        }
        else
        {
        System.out.println("The login was unsuccessful");
        }
        return false;
    }
}
        
        
            
        
    

    

