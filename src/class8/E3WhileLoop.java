package class8;

import java.util.Scanner;

public class E3WhileLoop {
    public static void main(String[] args) { // in a while loop ask user to enter numbers, if user uses enter any number other then -1, print Hello World" and keep asking user for a number
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = scan.nextInt();
      while (number!=-1){
          System.out.println("Try again");
          number= scan.nextInt();
      }
    }
}
