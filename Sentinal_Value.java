import java.util.*;
public class Sentinal_Value {
    public static void main(String[] args) {

        // Sentinal value
        String stops = "n";
        // holds total values
        int sum = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers to add \nPress n to exit!: ");

        while (true) {
            System.out.println("Enter an integer number");
            String pause = input.nextLine();
            char n = pause.charAt(0);
            if (n == 'n') {
                break;
            }
            try {
                int number = Integer.parseInt(pause);
                if (number < 0){
                    System.out.println("invalid number");
                }
                else {
                    sum += number;
                }

            }catch (Exception e){
                System.out.println("invalid input");
            }

        }
        System.out.println("The total numbers is : " + sum);
    }
}
