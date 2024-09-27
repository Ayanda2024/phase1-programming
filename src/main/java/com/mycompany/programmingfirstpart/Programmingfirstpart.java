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
        
        //Creating an object of the Scanner
        Scanner sc=new Scanner(System.in);
        
        
        
        //Creating instance of the class 
         Login login=new Login();
        
        //Method that returns necessary registration messages 
       String registrationmessage=login.Registeruser();
       System.out.println(registrationmessage);
       //Prompts for login
       System.out.println("Please enter username");
       String enteredusername=sc.next();
       System.out.println("Enter password");
       String enteredpassword=sc.next();
        //Method that checks if user has provided the correct username and password
        
        
        String validation=login.loginUser(enteredusername,enteredpassword);
        System.out.println(validation);
        
       
        //Method that returns necessary login status
        boolean isLoggedIn=validation.startsWith("Welcome");
        String loginresult=login.returnLoginStatus(isLoggedIn);
        System.out.println(loginresult);
    }
    
    }

        

