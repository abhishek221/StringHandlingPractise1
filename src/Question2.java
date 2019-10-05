import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a string ");
        String str = scanner.nextLine();
        System.out.println("enter the index");
        int index = scanner.nextInt();

        System.out.println(str.substring(index));
    }
}
