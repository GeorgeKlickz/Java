/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AskQuestions;

/**
 *
 * @author GEORGE KLICKZ
 */

    
import java.util.Scanner;
public class NameAgeAndSalary {
    public static void main(String[] args){
        //variable declaration
        String userName;
        int age; //age of user
        double salary;
        Scanner input = new Scanner(System.in);
        
        //prompt statements and data input
        System.out.println("Hello. What is your name?");
        userName = input.next();
        System.out.println("Hi, "+userName+"! How old are you?");
        age = input.nextInt();
        System.out.println("So you're "+age+" eh? That's not old at all!");
        System.out.println("How much do you make, "+userName+"?");
        salary = input.nextDouble();
        System.out.println(salary+"! I hope that's per hour and not per year! LOL!");
        
    }
    
}

    

