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
public class MoreUserInputs {
    public static void main(String[] args){
        //variable declaration and scanner object creation
        Scanner input = new Scanner (System.in);
        String firstName, lastName, login;
        int grade, stdID;
        double gpa;
        
        System.out.print("First name: ");
        firstName = input.next();
        System.out.print("Last name: ");
        lastName = input.next();
        System.out.print("Grade (9-12): ");
        grade = input.nextInt();
        System.out.print("Student ID: ");
        stdID = input.nextInt();
        System.out.print("Login: ");
        login = input.next();
        System.out.print("GPA (0.0-4.0)");
        gpa = input.nextDouble();
        System.out.println();
        
        //print out the outputs
        System.out.println("Your information: ");
        System.out.println("\tLogin: \t"+login);
        System.out.println("\tID: \t" + stdID);
        System.out.println("\tName: \t" + lastName + ", " + firstName);
        System.out.println("\tGPA: \t"+gpa);
        System.out.println("\tGrade: \t"+grade);
        
    }
    
}

    
