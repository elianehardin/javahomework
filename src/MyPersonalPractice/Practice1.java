package MyPersonalPractice;

public class Practice1 {
    public static void main(String[] args) {

        /*
        Task 2: Create a Java program and name it Variables
        In your program create different type of variables to store student’s information:
        (name, last name, grade, city, state, phone number)
        and then print value of those variables in the format:
        My name is __ and my last name is __
        I am __ student
        I live in city and country __
        And my phone number is __
         */
        String myName = "Eliane";
        String lastName = "Hardin";
        char myGrade = 'A';
        int myAge = 40;
        String myCity = "Rio De Janeiro";
        String myCountry ="Brazil";
        String myPhoneNumber = "7033990938";
        boolean myCitizenshipStatus = true;

        System.out.println("My name is" + " " + myName + " " + "and my last name is" + " " + lastName);
        System.out.println("I am" + " " + myGrade+" "+ "student");
        System.out.printf("My age is"+" " + myAge + "years old");
        System.out.println("I live in"+" "+ myCity +" "+"and Country" + " " +myCountry);
        System.out.println("My phone number"+" "+ myPhoneNumber);

        if (myCitizenshipStatus==true) {
            System.out.println("And my citizenship status: America nationality not by origin");}
        if (myCitizenshipStatus == false) {
            System.out.println("And my citizenshipStatus: Permanent Residence");}
        // Task 3: Change student’s city, state, phone number and grade. And print those updated values

        myGrade = 'A';
        myCity = "Frederiscksburg";
        myPhoneNumber = "0000000000";

        System.out.println("My name is" + " " + myName + " " + "and I moved to new city" + " " + myCity + " " + "and my new phone number is:" + " " + myPhoneNumber);
        }

}
