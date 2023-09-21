//Question 17: Write a Java program to count the total number of words in a sentence.
import java.util.Scanner;
public class Program15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String str[]=s.split(" ");
        System.out.println("The number of words in a sentence are: "+str.length);
    }
}
