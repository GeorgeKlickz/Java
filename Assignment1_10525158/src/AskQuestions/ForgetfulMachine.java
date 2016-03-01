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
public class ForgetfulMachine {
    public static void main(String[] args){
        //creating scanner object
        Scanner keyboard = new Scanner (System.in);
        //Prompt statement and keyboard
        System.out.println("Give me a word!");
        keyboard.next();
        System.out.println("Give me a second word!");
        keyboard.next();
        System.out.println("Great, now your favorite number?");
        keyboard.nextInt();
        System.out.println("And your second-favorite number...");
        keyboard.nextInt();
        System.out.println("Whew! Wasn't that fun?");
    }
    
}

    
