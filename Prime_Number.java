import java.util.*;
public class Prime_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        boolean isPrime;

        for (;;) {
            System.out.print("Fadlan geli number: ");
            number = scanner.nextInt();

            isPrime = true;

            if (number <= 1) {
                isPrime = false;
            }
            else {
                for (int i = 2; i <= number / 2; i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                System.out.println("Lambarka " + number + " waa prime number.");
                break;
            } else {
                System.out.println("Lambarka " + number + " ma aha prime, fadlan isku day mid kale.");
            }
        }
    }
}
