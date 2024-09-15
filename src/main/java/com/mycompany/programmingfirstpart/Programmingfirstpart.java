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
        String password="Berry@01";
         String firstname;
        String lastname;
        
        //Creating an object of the Scanner
        Scanner sc=new Scanner(System.in);
        
        //Prompting the user 
        System.out.print("Enter your username");
        String enteredusername=sc.next();
        
        System.out.print("Enter your password");
        String enteredPassword=sc.next();
        
        System.out.print("Enter your firstname");
         firstname=sc.next();
        
        System.out.print("Enter your lastname");
         lastname=sc.next();
        
         Login login=new Login();
         //Calling the checkusername method
        boolean result=Login.checkusername(enteredusername);
        System.out.print(result);
        
        //calling the passwordcomplexity method
        boolean output=Login.PasswordComplexity(enteredPassword);
        
    }
    
    }

