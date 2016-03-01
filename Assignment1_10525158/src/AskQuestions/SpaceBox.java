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
public class SpaceBox {
    public static void main(String[] args){
        //variable declaration and Sanner object creation
        int earthweight;
        int planet;
        Scanner input = new Scanner (System.in);
        //prompt statement and user input
        System.out.print("Please enter your current earth weight: ");
        earthweight = input.nextInt();
        System.out.println();
        System.out.println("I have information for the following planets: ");
        System.out.println("1. Venus    2. Mars     3. Jupiter");
        System.out.println("4. Saturn   5. Uranus   6. Neptune");
        System.out.print("Which planet are you visiting? ");
        planet = input.nextInt();
        //computations
        if (planet == 1){
            System.out.println("Your weight would be "+earthweight*0.78+" pounds on that planet");
        }
        else if (planet == 2){
            System.out.println("Your weight would be "+earthweight*0.39+" pounds on that planet");
        }
        else if (planet == 3){
            System.out.println("Your weight would be "+earthweight*2.65+" pounds on that planet");
        }
        else if (planet == 4){
            System.out.println("Your weight would be "+earthweight*1.17+" pounds on that planet");
        }
        else if (planet == 5){
            System.out.println("Your weight would be "+earthweight*1.05+" pounds on that planet");
        }
        else{
            System.out.println("Your weight would be "+earthweight*1.23+" pounds on that planet");
        }
      
    }
    
}

    

