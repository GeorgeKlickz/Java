/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AskQuestions;


/**
 *
 * GEORGE KLICKZ
 */
import java.util.Scanner;
public class GenderGame {
    public static void main(String[] args){
        //variable declaration and scanner object creation
        String firstName, lastName, gender,mStatus;
        int age;
        Scanner input = new Scanner(System.in);
        
        //prompt statements, user inputs and computations
        System.out.print("What is your gender? (Male or Female: ");
        gender = input.next();
        System.out.print("First name: ");
        firstName = input.next();
        System.out.print("Last name: ");
        lastName = input.next();
        System.out.print("Age: ");
        age = input.nextInt();
        System.out.print("Are you married, "+firstName + " (yes or no)?");
        mStatus = input.next();
        
        if (gender.equals ("female"))
                {
            if (age>=20){
                System.out.println("Then I shall call you Mrs. "+lastName);
            }
            else{
                System.out.println("Then I shall call you Ms. "+firstName+" "+lastName);
            }
        }else if (gender .equals ("male"))
        {
            if (age>=20){
                System.out.println("Then I shall call you Mr. "+lastName);
            }
            else{
                System.out.println("Then I shall call you "+firstName + " "+lastName);
            }
        }
        
        
    }
}

