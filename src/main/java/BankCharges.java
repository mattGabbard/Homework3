/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0749489
 */
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class BankCharges {
    public static void main(String[] args) {
        
        int totalChecks = 0;
        double checkFee = 0;
        double totalCharges = 0;
        
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.CEILING);
        
        Scanner scan = new Scanner(System.in);
        
        while (totalChecks <= 0)  {
        System.out.println("Please enter how many checks were written");
        totalChecks = scan.nextInt();
        
        if (totalChecks < 0) {
            System.out.println("Please enter a positive number.");}
        }
        
        if (0 <= totalChecks && totalChecks <= 19){
            checkFee = .1;}
        else if (20 <= totalChecks && totalChecks <= 39) {
            checkFee = .08;}
        else if (40 <= totalChecks && totalChecks <= 59) {
            checkFee = .06;}
        else if (totalChecks >= 60) {
            checkFee = .04;}

        totalCharges = 10 + (checkFee * totalChecks);
        
        System.out.println("Total number of checks: " + totalChecks);
        System.out.println("Total charges: $"+ df.format(totalCharges));


    }
}    