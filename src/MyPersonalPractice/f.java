package MyPersonalPractice;

import java.util.Scanner;

public class f {
    public static void main(String[]args){


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the roll number of the Child");

        String student = scan.next();
        int num = scan.nextInt();
        if (num==101){

            System.out.println("Ramesh");

        }else if (num == 102){
            System.out.println("Mahesh");

        }else if (num == 103){

            System.out.println("Mukesh");

        }else if(num <101|| num >103);

        System.out.println("Not found Student name: in Class");

    }
}


