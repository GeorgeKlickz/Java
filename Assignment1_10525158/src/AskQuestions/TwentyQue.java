/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Edwin Etornam
 */
import java.util.Scanner;
public class TwentyQue {
    public static void main(String[] args){
        //variable declaration and scanner object creation 
        String object; //for animal, vegetable or mineral
        String bigger;//is it bigger than a lunchbox?Yes or no
        Scanner input = new Scanner (System.in);
        
        //prompts and user inputs
        System.out.println("Question 1) Is it animal, vegetable, or mineral? ");
        object = input.next();
        System.out.println();
        System.out.println("Question 2) Is it bigger than a breadbox? ");
        bigger = input.next();
        
        //computation
        
        if (object.equals("animal")){
            if (bigger.equals("no") ){
                System.out.println("My guess is that you are thinking of a mouse");
                System.out.println("I would ask you if I'm right, but I don't actually care.");
                
            }
            else if (bigger.equals("yes")){
                System.out.println("My guess is that you are thinking of a lion");
                System.out.println("I would ask you if I'm right, but I don't actually care.");
            }
            
        }
        
        else if (object.equals("mineral")){
            if (bigger.equals("no") ){
                System.out.println("My guess is that you are thinking of a gold");
                System.out.println("I would ask you if I'm right, but I don't actually care.");
                
            }
            else if (bigger.equals("no")){
                System.out.println("My guess is that you are thinking of a diamond");
                System.out.println("I would ask you if I'm right, but I don't actually care.");
            }
            
        }
       
        else if (object.equals("vegetable")){
                 if (bigger.equals("no") ){
                System.out.println("My guess is that you are thinking of onion");
                System.out.println("I would ask you if I'm right, but I don't actually care.");
                 }
                 else if (bigger.equals("yes")){
                     System.out.println("My guess is that you are thinking of a cabbage");
                System.out.println("I would ask you if I'm right, but I don't actually care.");
                 }
            }
            
    }
    
}
