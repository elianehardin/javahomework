package class8;

public class E5WhileAndBreak {
    public static void main(String[] args) {
        boolean summer = true;
        int temp = 85; // create a boolean variable summer, stire true in then
        while(summer){
            if (temp<100){

                System.out.println("I enjoy summer");
            }else {
                System.out.println("its very hot");
                break;
            }

            temp = temp +2;
        }


    }
}
