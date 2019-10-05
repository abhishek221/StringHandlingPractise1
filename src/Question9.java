import java.util.Scanner;
import java.math.*;
public class Question9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a string ");
        String str = scanner.nextLine();
        int wt1=0;
        int wt2=0;
        int l=str.length();
        for(int i=0;i<l;i++){
            if((int)str.charAt(i)<=65 && (int)str.charAt(i)<=91){
                wt1=wt1+(int)str.charAt(i);
            }
            if((int)str.charAt(i)>=97 && (int)str.charAt(i)<=123){
                wt2=wt2+(int)str.charAt(i);
            }
        }
        int abs= wt1-wt2;
        System.out.println("absolute weight is "+Math.abs(abs));
    }
}
