package com.company;
import java.util.Scanner;

public class game1 {

    public static void main( String args[] )
    {
        int min = 1;
        int max = 3;

        int a;
        System.out.println("Enter a number between 1 to 3 where\n\t1 is rock\n\t2 is paper\n\t3 is scissor\n==> ");
        Scanner sc = new Scanner (System.in);
        a = sc.nextInt();

        switch (a) {
            case 1 -> System.out.println("Rock");
            case 2 -> System.out.println("Paper");
            case 3 -> System.out.println("scissor");
        }

        System.out.println();
        System.out.println("Computer selected option is: ");
        int b = (int)(Math.random()*(max-min+1)+min);
        System.out.println(b);

        switch (b) {
            case 1 -> System.out.println("Rock");
            case 2 -> System.out.println("Paper");
            case 3 -> System.out.println("scissor");
        }

        if (a==b){
            System.out.println("Match is Draw");
        }
        else if (a==1 && b==2) {
            System.out.println("Computer Wins!!");
        }
        else if (a==1 && b==3)
        {
            System.out.println("You Win!!");
        }
        else if (a==2 && b==3)
        {
            System.out.println("Computer Wins!!");
        }
        else if (a==3 && b==2)
        {
            System.out.println("You Win!!");
        }
        else if (a==3 && b==1)
        {
            System.out.println("Computer Wins!!");
        }
        else if (a==2 && b==1)
        {
            System.out.println("You Win!!");
        }
        else {
            System.out.println("Condition is wrong");
        }

    }
}