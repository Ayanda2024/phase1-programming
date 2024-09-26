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
       String Password="Berry@1992!";
         String firstname="Ayanda";
        String lastname="Ngwenya";
        
        //Creating an object of the Scanner
        Scanner sc=new Scanner(System.in);
        
        
        //Creating instance of the class 
         Login login=new Login();
        
        //Method that returns necessary registration messages 
        login.Registeruser();
        
         //Calling the checkusername method
        boolean result=login.checkusername(username);
        System.out.println(result);
        
        
        //calling the passwordcomplexity method
        
       boolean output= login.PasswordComplexity(Password);
      System.out.println(output);
      
        
        //Method that checks if user has provided the correct username and password
        String show=login.loginUser(username, Password);
        System.out.print(show);
        
        //Method that returns necessary login status
        
    }
    
    }

