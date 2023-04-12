package Class5;

public class E4NestedIf {
    public static void main(String[] args) {
        int money =20000;
        String day = ("Sunday");
        if(money> 10000){ // both == and .equals will work when comparing
            if (day.equals("Sunday")){
                System.out.println("Let's go shopping now");

            }else {
                System.out.println("Lets wait for Sunday");
            }

            }else {
            System.out.println( "lets save more");
        }

    }
}
