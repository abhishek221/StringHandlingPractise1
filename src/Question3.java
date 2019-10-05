import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a string ");
        String str = scanner.nextLine();
        str=str.replace('a','*');
        str = str.replace('e','*');
        str = str.replace('i','*');
        str = str.replace('o','*');
        str = str.replace('u','*');
        System.out.println("new string is \t"+str);
    }
}

