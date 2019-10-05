import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a string ");
        String str = scanner.nextLine();
        System.out.println("enter the string to be replaced");
        String strep = scanner.nextLine();
        System.out.println("enter the replacement");
        String streped = scanner.nextLine();
        System.out.println(str.replaceAll(strep,streped));
    }
}
