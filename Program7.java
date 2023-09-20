//Question 7: Write a Java program to print the first non-repeating character in a string using only one loop.
import java.util.Scanner;
public class Program7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char ch[]=s.toCharArray();
        for(int i=0;i<s.length();i++){
            int c=0;
           for(int j=0;j<ch.length;j++){
              if(s.charAt(i)==ch[j]){
                 c++;
              }
           }
           if(c==1){
            System.out.println("The First Non-Repeating character in a String is: "+s.charAt(i));
            break;
           }
        }
    }
}
