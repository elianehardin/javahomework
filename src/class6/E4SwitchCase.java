package class6;

public class E4SwitchCase {
    public static void main(String[] args) {
        int day = 1;
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case  2 :
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");

            case 5:
                System.out.println("Friday");

            case 6 :
                System.out.println("saturday");
            case 7:
                System.out.println("Sunday");

            default:
                System.out.println("wrong day number");
        }
    }
}
