package third;

import java.util.Scanner;

public class Passwordvalidation {


    

    public static void main(String[] args) {
    //These are your class feilds
    //This is our "database"
    String username = "Yeetman2000";
    String password = "Powerdude3000";

        //What are the steps we need to tell the computer?
        //Prompt the user to enter their password
        //Retrieve the user's input
        //compare the user's input to what the computer has
        // ...if comparison fails
        //......display "I don't know you."
        //....if comparison pass
        //......display "Welcome!"

        //Step 1: Prompt the user to enter their password
        System.out.println("What is the password?");
        Scanner input = new Scanner(System.in);
        System.out.println(input.next());
        //Step 2: Retreive User input
        //This block of code retrieves the user's input.
        while (input.hasNext()) {
            
            //userInput "ofjhofhjfahlj;ajgoijfog"
        }

        //Step 3: compare the user's input to what the system has
        if (5 == 5) {
            System.out.println("I executed");

        }
    }

}
