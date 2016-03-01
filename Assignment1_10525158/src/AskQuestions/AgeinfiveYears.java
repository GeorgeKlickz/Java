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
public class AgeinfiveYears {
    public static void main(String[] args){
       
        String name;
        int age ;
        
        //accept input
        Scanner input= new Scanner (System.in);
        
        System.out.println("Hello. What is your name?");
        name = input.next();
        System.out.println("Hi! " + name + "How old are you?");
        age = input.nextInt();
        int newAge = age + 5; 
        int prevAge = age - 5;
        System.out.println("Did you know that in 5 years you will be " + newAge +"years old? ");
        System.out.println("And five years ago you were " + prevAge + "! Imagine that");
    }
}


