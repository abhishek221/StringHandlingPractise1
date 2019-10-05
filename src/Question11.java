import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a string ");
        String str = scanner.nextLine();
        System.out.println("enter the character ");
        char ch = scanner.next().charAt(0);
        int l= str.length();
        int arra[];
        for(int i=0;i<l;i++){
            if (str.charAt(i)==ch){
                System.out.println("the index is "+i);

            }

        }

    }

}
