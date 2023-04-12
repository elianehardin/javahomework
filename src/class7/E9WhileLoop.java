package class7;

public class E9WhileLoop {
    public static void main(String[] args) { // print 25 20 10 5 in while loop - hint if condition
        int num = 25;
        while (num >= 5) {
            if (num != 10) { // use if condition and ! if does not want to print a number
                System.out.print(num + " ");


            }
            num -= 5;

        }

    }
}