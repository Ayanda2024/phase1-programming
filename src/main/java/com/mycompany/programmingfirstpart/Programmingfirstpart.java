/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programmingfirstpart;
import java.util.Scanner;
/**
 *
 * @author RC_Student_lab
 */
public class Programmingfirstpart {

    public static void main(String[] args) {
        //Declarations
        String username="Aya_1";
       
         String firstname="Ayanda";
        String lastname="Ngwenya";
        
        //Creating an object of the Scanner
        Scanner sc=new Scanner(System.in);
        
        //Prompting the user 
        System.out.println("Enter your username:");
        String enteredusername=sc.next();
        
        System.out.println("Enter your password:");
        String enteredPassword=sc.next();
        
        System.out.println("Enter your firstname:");
         firstname=sc.next();
        
        System.out.println("Enter your lastname:");
         lastname=sc.next();
        //Creating instance of the class 
         Login login=new Login();
         //Calling the checkusername method
        boolean result=login.checkusername(enteredusername);
        System.out.println(result);
        
        //calling the passwordcomplexity method
        
       boolean output= login.PasswordComplexity(enteredPassword);
      System.out.println(output);
      
        //Method that returns necessary registration messages 
        String display=login.Registeruser(enteredusername, enteredPassword);
        System.out.println(display);
        //Method that checks if user has provided the correct username and password
        String show=login.loginUser(enteredusername, enteredPassword);
        System.out.print(show);
        
        //Method that returns necessary login status
        
    }
    
    }

