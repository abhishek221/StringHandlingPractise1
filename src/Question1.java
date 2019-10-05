import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        System.out.println("enter a string");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int l=str.length();
        System.out.print("index:\t");
        for(int i=0;i<l;i++){
            System.out.print(i+"\t");
        }
        System.out.print("\nchars \t");
        for(int i=0;i<l;i++){
            System.out.print(str.charAt(i)+"\t");
        }
    }
}
