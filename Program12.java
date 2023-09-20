//Question 12: Write a Java program to find and print the longest substring without repeating characters in a given string.
import java.util.Scanner;
public class Program12 {
    static boolean check(String s){
        char ch1[]=s.toCharArray();
        char ch2[]=s.toCharArray();
        for(int i=0;i<ch1.length;i++){
            int c=0;
            for(int j=0;j<ch2.length;j++){
                if(ch1[i]==ch2[j]){
                    c++;
                }
            }
            if(c>1){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String str[]=s.split(" ");
        String lonString="";
        for(int i=0;i<str.length;i++){
            if(check(str[i])==true){
                if(str[i].length()>lonString.length()){
                    lonString=str[i];
                }
            }
        }
        System.out.println("The longest substring without repeating characters is "+lonString);
    }
}
