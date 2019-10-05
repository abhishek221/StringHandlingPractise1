import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a string ");
        String str = scanner.nextLine();
        int l= str.length();
        int wt=0;
        for(int i = 0; i<l;i++){
            if((int)str.charAt(i)>=65 && (int)str.charAt(i)<=91){
                wt=wt+(int)str.charAt(i);
            }
        }
        System.out.println("the weight is "+wt);
    }
}
