package ex_23042024;

import java.util.Scanner;

public class Lab041 {
    public static void main(String[] args) {
        // Even or Odd

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number");

        int num= sc.nextInt();
        if (num%2==0){
            System.out.println("The entered number is even");
        } else{
            System.out.println("The entered number is odd");
        }
        sc.close();
    }
}
