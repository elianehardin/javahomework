package class7;

public class E10WhileLoop {
    public static void main(String[] args) { // print this numbers 1 2 4 5 7 8 11 13 14 16 17 19 20 hint modulus operator
        int counter = 1;
        while (counter <= 20) {
            if (counter % 3 != 0) {// you can also say, if (counter%3==0){ does not  - Also o do division use /
                System.out.print(counter + " ");
            }
            counter++;
        }
    }
}