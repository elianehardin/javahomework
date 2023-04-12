package class8;

import java.util.Scanner;

public class ex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the starting point and ending point");
        int start= scan.nextInt();
        int end = scan.nextInt();

        int counter = start;
        while (counter<= end){
            System.out.print(counter + " ");
            counter++;

        }
    }
}
