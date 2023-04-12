package class7;

public class E12WhileLoop {
    public static void main(String[] args) {/*add all the numbers from 1 to 10 and display the result 55
    first write a loop that goes from 1 to 10  - create the variable to hold the sum and all numbers*/
        int counter=1;
        int sum=0;
        while (counter<=10){
            sum=sum+counter;
            counter++;

        }
        System.out.println(sum);
    }
}
