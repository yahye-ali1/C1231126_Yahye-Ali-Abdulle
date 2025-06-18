import java.util.*;
public class Password_Generator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        // Dhammaan characters ka aan rabo
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String special = "!@#$%&*";

        // Isku darka dhammaan characters
        String allCharacters = upper + lower + digits + special;

        // Dhirirka passworka weydii userka
        System.out.print("Fadlan geli dhererka password ka aad rabto: ");
        int length = input.nextInt();

        String password = "";

        for (int i = 0; i < length; i++) {
            int index = rand.nextInt(allCharacters.length());
            password += allCharacters.charAt(index);
        }
        System.out.println("Password kaagu waa: " + password);

    }
}
