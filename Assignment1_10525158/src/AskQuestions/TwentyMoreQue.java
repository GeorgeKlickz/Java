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
public class TwentyMoreQue {
    public static void main(String[] args){
        //variable declaration and scanner object creation 
        String belong; //for inside, outside, both
        String alive;//is it alive?Yes or no
        Scanner input = new Scanner (System.in);
        
        //prompts and user inputs
        System.out.println("TWO MORE QUESTIONS, BABY!");
        System.out.println("Think of something and I'll try to guess it!");
        System.out.println();
        System.out.print("Question 1) Does it stay inside or outside or both? ");
        belong = input.next();
        System.out.println();
        System.out.print("Question 2) Is it a living thing? ");
        alive = input.next();
        
        //computation
        if (belong.equals("outside") && alive.equals("no")){
           
                System.out.println("My guess is that you are thinking of a billboard");
               
            
            
        }
        if (belong.equals("outside") && alive.equals("yes")){
            
                System.out.println("My guess is that you are thinking of a python");
             
                
            
            
        }
       if (belong.equals("inside") && alive.equals("no")){
           
                System.out.println("My guess is that you are thinking of a shower curtains");
                
                
            
            
        }
       if (belong.equals("inside") && alive.equals("yes")){
            
                System.out.println("My guess is that you are thinking of a ant");
                
                
            
            if (belong.equals("both") && alive.equals("no")){
            
                System.out.println("My guess is that you are thinking of dead ant");
               
                
            
            if (belong.equals("both") && alive.equals("yes")){
            
                System.out.println("My guess is that you are thinking of a cockroach");
                
                
            }
            
        }
            
        }
        
    }
    
}
