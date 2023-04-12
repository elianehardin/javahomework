package class9;

public class E11Array { // create an Array of int with size 5
    public static void main(String[] args) {
        int [] numbers = new int[5];
        numbers [0]=50;
        numbers[1]= 60;
        for (int number : numbers){
            System.out.println(number);
        }
    }
}
