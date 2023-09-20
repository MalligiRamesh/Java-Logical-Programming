//Question 11: Write a Java program to remove all adjacent duplicates from a given string.
import java.util.Scanner;
import java.util.Stack;
public class Program11{
   public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     String s=sc.next();
     Stack<Character> str=new Stack<>();
     for(int i=0;i<s.length();i++){
        if(str.contains(s.charAt(i))){
          str.remove(str.lastIndexOf(s.charAt(i)));
        }
        else{
            str.push(s.charAt(i));
        }
     }
     String s1="";
     for(char c:str){
        s1=s1+c;
     }
     System.out.println(s1);
   }
}