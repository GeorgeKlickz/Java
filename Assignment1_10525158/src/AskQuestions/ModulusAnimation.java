/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GEORGE KLICKZ
 */

import java.util.Scanner;
public class LittleQuiz {
    public static void main(String[] args){
        //variable declaration and scanner object creation
        Scanner input = new Scanner (System.in);
        int answer;
        //count of the items
        int count = 0;
        String ready;
        
        System.out.print("Are you ready for the quiz? ");
        ready = input.next();
        System.out.println("Okay, jere it comes!");
        System.out.println();
        System.out.println("Q1) What is the capital of Ghana?");
        System.out.println("\t1)Accra\n\t2)Kumasi\n\t3)Cape Coast");
        answer = input.nextInt();
        //test if ans is correct basedon incre
        if (answer == 1){
            System.out.println("That's right");
            count++;
        }
        else{
            System.out.println("Ooops sorry, that was wrong");
        }
        System.out.println("Q2) Can you store the value \"cat\" in a variable of type int ?");
        System.out.println("\t1)Yes\n\t2)No");
        answer = input.nextInt();
        if (answer == 2){
            System.out.println("That's correct");
            count++;
        }
        else{
            System.out.println("Ooops sorry, that was wrong");
        }
        System.out.println("Q1)What is the result of 9+6/3?");
        System.out.println("\t1)5\n\t2)11\n\t3)15/3");
        answer = input.nextInt();
        if (answer == 2){
            System.out.println("That's correct");
            count++;
        }
        else{
            System.out.println("Ooops sorry, that was wrong");
        }
        System.out.println();
        
        //displ. rslt
        
        System.out.println("Overall, you got "+count+" out of 3 correct");
        System.out.println("Thanks for playing!");
        
        
    }
    
}

