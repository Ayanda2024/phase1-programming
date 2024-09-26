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
       String registrationmessage= login.Registeruser();
        //Method that checks if user has provided the correct username and password
        
        String validation=login.loginUser();
        System.out.println(validation);
        boolean isLoggedIn = false;
         
      
        
        
        
        //Method that returns necessary login status
        
        String loginresult=login.returnLoginStatus(isLoggedIn);
        System.out.println(loginresult);
    }
    
    }

        

