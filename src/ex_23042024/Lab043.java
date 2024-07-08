package ex_23042024;


import java.util.Scanner;

public class Lab043 {
    public static void main(String[] args) {

        // ✅ Grade Calculator
        // Write a program that calculates and displays the letter grade for a given
        // numerical score (e.g., A, B, C, D, or F) based on the following
        // grading scale:
        //
        //A: 90-100
        //B: 80-89
        //C: 70-79
        //D: 60-69
        //E: 0-59


        // 1. Find the user Inputs
        // score - data type? - int
        // return -> grade -> data type -> char
        // // DAA- Ask for the confirmation of the doubts
        // Interviewer ->  int, char


        // 2. Basic Logic
        // if ( score >= 90 && score <= 100 ) -> return or print grade - A
        // else if score <=89 && score >= 80 -> return or orint grade - B
        // else -> grade -> F



        // 3. Write the code

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the Score");
        int score = sc.nextInt();

        if(score>=90 && score<=100){
            System.out.println("Your Grade is A");

        } else if (score<=89 && score >= 80) {

            System.out.println("Your Grade is B");

        } else if (score<=79 && score >= 70) {
            System.out.println("Your Grade is C");

        } else if (score<=69 && score >= 60) {
            System.out.println("Your Grade is D");

        }else if(score<=59 && score >= 01){
            System.out.println("Your Grade is E");

        } else{
            System.out.println("Not a Valid Score");
        }


    }
}
