package class7;

public class E11WhileLoop {
    public static void main(String[] args) {
 int counter = 100;
 while (counter>= 0){

         System.out.print(counter + " ");
     counter--;
     }
 counter=20;
        System.out.println();
 while (counter<=100){
     System.out.print(counter+ " ");
     counter+= 2;
 }

 counter=100;
        System.out.println();
 while (counter>=1){
     if(counter%2==1){ // he calls % sing = modules
         System.out.print(counter+ " ");
     }
     counter--;
 }
 }

    }

/* print number from 100 to 1
print even number from 20 to 100
print only odd number from 100 to 1
*/