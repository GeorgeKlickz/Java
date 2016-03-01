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

public class Second
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print (" Give me a word? ");
        keyboard.next();
        System.out.print(" keyboard");
        
        //Scanner keyboard = new Scanner(System.in);
        System.out.print("Give me a second world ");
        keyboard.next();
        
        System.out.print(" Great, now your favourite number ");
        keyboard.next();
        System.out.print(" Your second-favourite number ");
        keyboard.next();
        
        System.out.print(" Whew, wasn't that fun?");
       
    }
}
