package class7;

public class E7WhileLoop {
    public static void main(String[] args) { // print 3  5 7 9 11 13
        int counter = 3;
        while (counter < 14)
        {
            System.out.print(counter+" ");
            counter += 2;
        }
    }
}