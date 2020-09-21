
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author frys
 */
public class NewClass {
    public static void main(String[] args) {
         Scanner keyboard = new Scanner(System.in); 
        System.out.println("Enter a positive nonzero integer value:");
        double integerValue = keyboard.nextDouble();
        int holder = 0;
        for (int i=1; i<= integerValue; i++){
            
         holder += i;
        }
        System.out.println(holder);
 }
    
}
