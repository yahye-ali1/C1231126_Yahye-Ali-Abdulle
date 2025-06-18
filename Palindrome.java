import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        for (;;) {
            System.out.print("Fadlan geli erey: ");
            input = scanner.nextLine();

            boolean isPalindrome = true;
            int length = input.length();

            for (int i = 0; i < length / 2; i++) {
                if (input.charAt(i) != input.charAt(length - i - 1)) {
                    isPalindrome = false;
                    break;
                }
            }

            if (isPalindrome) {
                System.out.println("'" + input + "'" + " Waa erey palindrome ah!!");
                break;
            }
        }
    }
}
