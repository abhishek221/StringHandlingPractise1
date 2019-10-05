import java.util.Scanner;

public class Question7{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a string ");
        String str = scanner.nextLine();
        int wt=0;
        int l = str.length();
        for(int i=0;i<l;i++){
            wt=wt+ (int)str.charAt(i);

        }
        System.out.println("the weight is "+wt);
    }
}
