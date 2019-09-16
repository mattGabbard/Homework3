/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mattg
 */import java.util.Scanner;
public class BarChart {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the sales for Store 1. ");
        int store1 = scan.nextInt();
        System.out.println("Please enter the sales for Store 2. ");
        int store2 = scan.nextInt();
        System.out.println("Please enter the sales for Store 3. ");
        int store3 = scan.nextInt();
        System.out.println("Please enter the sales for Store 4. ");
        int store4 = scan.nextInt();
        System.out.println("Please enter the sales for Store 5. ");
        int store5 = scan.nextInt();
        
        store1 = store1/100;
        store2 = store2/100;
        store3 = store3/100;
        store4 = store4/100;
        store5 = store5/100;
                
        String printStringOfAsterisks = " ";
        System.out.println("Sales Bar Chart");
        for (int asterisk = 1; asterisk <= store1; asterisk++) {
            printStringOfAsterisks += "*";}
            System.out.println("Store 1:" + printStringOfAsterisks);
            printStringOfAsterisks = " ";
        for (int asterisk = 1; asterisk <= store2; asterisk++) {
            printStringOfAsterisks += "*";}
            System.out.println("Store 2:" + printStringOfAsterisks);
            printStringOfAsterisks = " ";
        for (int asterisk = 1; asterisk <= store3; asterisk++) {
            printStringOfAsterisks += "*";}
            System.out.println("Store 3:" + printStringOfAsterisks);
            printStringOfAsterisks = " ";
        for (int asterisk = 1; asterisk <= store4; asterisk++) {
            printStringOfAsterisks += "*";}
            System.out.println("Store 4:" + printStringOfAsterisks);
            printStringOfAsterisks = " ";
        for (int asterisk = 1; asterisk <= store5; asterisk++) {
            printStringOfAsterisks += "*";}
            System.out.println("Store 5:" + printStringOfAsterisks);
            printStringOfAsterisks = " ";
    }
}
