import java.util.Scanner;
public class TheaterKiosk {
    static void main() {
        Scanner in = new Scanner(System.in);

        int age = 0;
        final int AGE_CUTOFF = 21;
        String trash = "";

        IO.print("Enter your age, must be 21 to see this film: ");

       if (in.hasNextInt()) {
           age = in.nextInt();
           in.nextLine();

           if (age >= 21) {
                IO.println("You are old enough to see this film, you get a wristband.");
           }
           else{
               IO.println("You are not old enough to see this film!");
           }

       }
       else {
           trash = in.nextLine();
           IO.println("Please enter a valid age, not : " + trash);
       }










    }
}
