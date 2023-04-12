package class9;

public class E1Array12 {// Array store 10,50,60, 45, 100 - expected output 50 - 45
    public static void main(String[] args) {
        int [] numbers = { 10, 50, 60,45,100};
        for (int i = 0; i <numbers.length; i++){
             if(i%2!= 0){
                 System.out.println(numbers[i]);
             }

        }

    }
}
