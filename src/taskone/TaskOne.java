/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taskone;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class TaskOne {

    public static void main(String[] args) {
        
  Scanner scan = new Scanner(System.in);
   
  //Declaring Variables
  String user; 
  String pass;
  String firstName; 
  String lastName;
  
  System.out.println(" Enter your First Name: ");
  firstName = scan.nextLine();
  
  System.out.println("Enter your Surname: ");
  lastName = scan.nextLine();  
  
  System.out.println(" Enter your username: ");
  user = scan.nextLine();
  
  System.out.println("Enter your password: ");
  pass = scan.nextLine();   
  
  System.out.println(valUserName(user));
  
  System.out.println(PasswordCallOut(pass));
  
  System.out.println(returnLoginstatus( pass, user, firstName, lastName));
    } 
            //Returns total Login status
public static boolean returnLoginstatus(String pass, String user, String firstName, String lastName){    

if(PasswordCallOut(pass)== true && (valUserName(user)== true)){

System.out.println("Welcome " + firstName +", "+ lastName +" its great to see you again" );
return true;    
}
else{
System.out.println("Username or password incorrect, please try again");
return false;    
}
}    
    
    public static boolean valPassword(String pass){
    
        if(pass.length() > 7)
        {
        if(checkPass(pass)){
        return true;  
        
        }
        else{
            return false;
        }
        }
        
        else
        {    
            System.out.println("Too small");
            return false;
        }
    }
 
    
public static boolean valUserName(String user){
    
        if((user.length() < 6) == true)
        {
        if(CheckUser(user)){
        
        System.out.println("Username successfully captures");
        return true;        
        }
        }
        System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters long");
       return false; 
}
         

public static boolean CheckUser(String user)
    {    
        Pattern rPattern = Pattern.compile("^[a-zA-Z0-9_-]{5,15}$");
        Matcher rMatcher = rPattern.matcher(user);
        
        if(rMatcher.matches()){
            
           System.out.println("Password valid");
         return true;   
        }
        else{
             
    System.out.println("Password incorrect");
        return false;

        }
    }


    public static boolean checkPass(String pass)
    {
            //1 Capital Letter
            //1 Lowercase Letter
            //1 Number
            //1 special character will be in a second method because of simplicity
        boolean hasNum = false;
        boolean hasCap = false;
        boolean hasLow = false;
        char c;
        
        for (int i =0; i < pass.length(); i++)
        {
            
        c = pass.charAt(i);
        if(Character.isDigit(c))
        {
            hasNum = true;
        }
        else if(Character.isUpperCase(c))
        {
            hasCap = true;
        }
        else if(Character.isLowerCase(c))
        {
            hasLow = true;
        }
        if(hasNum && hasCap && hasLow){
            return true;
        }
        
        }
    return false;
    }
            //Special character requirment
    public static boolean hasSpecialCharacter(String pass)
    {    
        Pattern sPattern = Pattern.compile("[a-zA-Z0-9]*");
        Matcher sMatcher = sPattern.matcher(pass);
        
        if(!sMatcher.matches()){
            
            return true;
        }
        else{
         System.out.println("No special character found");    
    return false;
   
    }
    }
    
            //Brings back the status of the Password
    public static boolean PasswordCallOut(String pass){    
    
    if(checkPass(pass) && hasSpecialCharacter(pass) == true ) {    
    
    System.out.println("Password successfully captured");
    return true; 

    }
    else{
    System.out.println("Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special charcter");
        return false;
    
    
    }
    }

}