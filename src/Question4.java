import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a string ");
        String str = scanner.nextLine();
        int l = str.length();
        int count=1;
        for(int i=0;i<l;i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){

                if(count==1){
                    str=str.replace(str.charAt(i),'*');
                    count = count+1;
                }
                else if (count==2){
                    str = str.replace(str.charAt(i),'^');
                    count = count +1;
                }
                else if (count==3){
                    str = str.replace(str.charAt(i),'!');
                    count = 1;
                }
            }
        }
        System.out.println("the modified string is "+str);
    }
}
