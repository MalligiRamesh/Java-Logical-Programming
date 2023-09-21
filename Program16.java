//Question 16: Write a Java program to reverse a sentence without reversing its words.
import java.util.Scanner;
public class Program16{
   public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    String dup="";
    String str[]=s.split(" ");
    for(int i=str.length-1;i>0;i--){
       dup=dup+str[i]+" ";
    }
    System.out.println(dup);
   } 
}



