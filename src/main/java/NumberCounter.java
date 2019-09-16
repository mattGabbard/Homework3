/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mattg
 */import java.util.Scanner;
public class NumberCounter {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a positive, nonzero number.");
        int number = scan.nextInt();
        
        while (number <= 0){
            System.out.println("Please enter a positive, nonzero number.");
            number = scan.nextInt();
        }    
        
        for (int i=0; i<number; i++){
            System.out.println("The Count: " +((int)i+1) + ", ah ah ah!");
        }
    }
}    