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
public class BMIcategories {
    public static void main(String[] args){
        //variable declaration and Scanner object creation
        double height, BMI, iHeight, fHeight;
        double weight, pWeight;
        Scanner input = new Scanner(System.in);
        
        //prompt and user input
        System.out.print("Your height in m: ");
        height = input.nextDouble();
        System.out.print("Your weight in kg:");
        weight = input.nextInt();
        BMI = weight/height*height;
        System.out.println("Your BMI is "+BMI);
        
        //computing BMI Cats
        if (BMI < 15.0){
            System.out.println("BMI Category: very severely underweight");
        }
        if (BMI >=15.0 && BMI <=16.0){
            System.out.println("BMI Category: severely undereweight");
        }
        if (BMI >=16.1 && BMI <=18.4){
            System.out.println("BMI Category: underweight");
        }
        
        if (BMI >= 18.5 && BMI <25){
            System.out.println("BMI Category: normal weight");
        }
        if (BMI >=25.0 && BMI <30.0){
            System.out.println("BMI Category: overweight");
        }
        if (BMI >= 30.0 && BMI <=34.9){
            System.out.println("BMI Category: moderate obese");
        }
        if (BMI >=35.0 && BMI <=39.9){
            System.out.println("BMI Category: severely obese");
        }
        if (BMI > 40.0){
            System.out.println("BMI Category: very severely obese");
        }
        
    }   
    
}


