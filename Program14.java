//Question 14: Write a Java program to check if a given string is a palindrome or not.
import java.util.Scanner;
public class Program14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String dup="";
        for(int i=0;i<s.length();i++){
            dup=s.charAt(i)+dup;
        }
        if(dup.equals(s)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
    }
}
