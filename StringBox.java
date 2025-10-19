import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.Scanner;

public class StringBox {
    private static final int ORIGIN_CAPACITY = 2;
    private int highestIndex;
    private String[] box;

    // Constructor aan lahayn parameter
    StringBox() {
        this(ORIGIN_CAPACITY);
    }

    // Constructor leh size
    StringBox(int capacity) {
        highestIndex = 0;
        box = new String[capacity];
    }

    // Tirada element-yada ku jira
    public int count() {
        return highestIndex;
    }

    // Ku dar element
    public void add(String item) {
        if (count() == box.length)
            grow();
        box[highestIndex] = item;
        highestIndex++;
    }

    // Ka saar element ugu dambeeya
    public String remove() {
        if (isEmpty())
            throw new EmptyStackException();
        String removedItem = box[--highestIndex];
        box[highestIndex] = null;
        return removedItem;
    }

    // Fiiri element ugu sareeya
    public String top() {
        if (isEmpty())
            throw new EmptyStackException();
        return box[highestIndex - 1];
    }

    // Check empty
    public boolean isEmpty() {
        return highestIndex == 0;
    }

    // Kordhi size-ka
    private void grow() {
        box = Arrays.copyOf(box, box.length * 2);
    }

    // Soo bandhig element-yada
    public void show() {
        if (isEmpty())
            throw new EmptyStackException();
        System.out.println("Waxyaabaha ku jira box-ka:");
        for (int i = 0; i < highestIndex; i++) {
            System.out.println(box[i]);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringBox myBox = new StringBox();

        while (true) {
            System.out.println("\n1. Ku dar");
            System.out.println("2. Ka saar");
            System.out.println("3. Fiiri top");
            System.out.println("4. Show");
            System.out.println("5. Tirada");
            System.out.println("6. Exit");
            System.out.print("Dooro: ");
            int choice = input.nextInt();
            input.nextLine(); // Clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Geli xogta: ");
                    String data = input.nextLine();
                    myBox.add(data);
                    break;
                case 2:
                    try {
                        System.out.println("Waxaad ka saartay: " + myBox.remove());
                    } catch (EmptyStackException e) {
                        System.out.println("Box-ku waa faaruq!");
                    }
                    break;
                case 3:
                    try {
                        System.out.println("Top element waa: " + myBox.top());
                    } catch (EmptyStackException e) {
                        System.out.println("Box-ku waa faaruq!");
                    }
                    break;
                case 4:
                    try {
                        myBox.show();
                    } catch (EmptyStackException e) {
                        System.out.println("Box-ku waa faaruq!");
                    }
                    break;
                case 5:
                    System.out.println("Tirada xogta: " + myBox.count());
                    break;
                case 6:
                    System.out.println("Program-ka wuu dhammaaday!");
                    return;
                default:
                    System.out.println("Doorasho khaldan!");
            }
        }
    }
}