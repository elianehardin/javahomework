package Class2;

public class Variable {

    public static void main(String[] args) {
        String studentName = "Eliane";
        String studentLastName = "Hardin";
        String studentGrade = "A/B";
        String city = "Fairfax";
        String state = "Virginia";

        String phoneNumber = "+7033990938"; // old phone number
        System.out.println("My name is " + studentName + " and my last name is " + studentLastName + "");
        System.out.println("I am a " + studentGrade + " student");
        System.out.println("I live in " + city + ", " + state + "");
        System.out.println("And my phone number is " + phoneNumber + "");
        city = "fredericksburg";
        state = "Virginia";
        phoneNumber = "+1 543_943_3112";
        System.out.println("My name is " + studentName + " and I moved to " + city + ", " + state + ". My phone number is " + phoneNumber + "");
    }
}