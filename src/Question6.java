import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a string ");
        String str = scanner.nextLine();
        str = str.toUpperCase();
        System.out.println("the modified string is "+str);
    }
}
