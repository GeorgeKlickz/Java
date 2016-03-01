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
public class DumbCalculator {
    public static void main(String[] args){
        //variable declaration and scanner object creation
        Scanner input = new Scanner (System.in);
        double first, second, third, answer;
        System.out.print("What is your first number? \n");
        first = input.nextDouble();
        System.out.print("What is your second number? \n");
        second = input.nextDouble();
        System.out.print("What is your third number? \n");
        third = input.nextDouble();
        answer = (first+second+third)/2;
        System.out.println(first+"+"+second+"+"+third+"/2" + " is "+answer);
        
    }
    
}

    

