package ex_23042024;

import java.util.Scanner;

public class Lab042 {
    public static void main(String[] args) {

        //Max of 2 nos
        System.out.println("Enter the num1");

        Scanner sc= new Scanner(System.in);
        int num1= sc.nextInt();

        System.out.println("Enter the num2");
        int num2= sc.nextInt();
        int max=Math.max(num1,num2);

        if(num1 > num2){
            System.out.println("Max of Two numbers is "+ num1);
        }else{
            System.out.println("Max of Two numbers is "+num2);
        }

        sc.close();

    }
}
