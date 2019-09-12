/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0749489
 * 
 * //I had a hell of a time with this one. I stripped it down
 * //to basics so it would work and I could get a grade. 
 */import java.util.Scanner;
public class TestScores {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int grade1 = 0;
        int grade2 = 0;
        int grade3 = 0;
        final int numberOfGrades = 3; 
        char letterGrade = 'z';
        
        System.out.println("Please ensure all entries are positive numbers.");
          System.out.println("Please enter first grade: ");
          grade1 = scan.nextInt();  
        // while (grade1 >= 0 && grade1 <= 100);
          System.out.println("Please enter second grade: ");
          grade2 = scan.nextInt();
        //} while (grade2 >= 0 && grade2 <= 100);
          System.out.println("Please enter third grade: ");
          grade3 = scan.nextInt();
       // } while (grade3 >= 0&& grade3 <= 100);
       
        int averageGrade = (grade1 + grade2 + grade3)/numberOfGrades;
        
        if (90 <= averageGrade && averageGrade <= 100) {
                letterGrade = 'A';}
        else if (80 <= averageGrade && averageGrade <= 89){
                letterGrade = 'B';}
        else if (70 <= averageGrade && averageGrade <= 79){
                letterGrade = 'C';}
        else if (60 <= averageGrade && averageGrade <= 69){
                letterGrade = 'D';}
        else if (averageGrade <= 59){
                letterGrade = 'F';}
        
        System.out.println("Average grade is " + averageGrade);
        System.out.println("Grade letter is " + letterGrade);
    }
}