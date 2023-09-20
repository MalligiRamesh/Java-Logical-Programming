//Question 9: Write a Java program to reverse the even position word in a sentence.
import java.util.Scanner;
public class Program9 {
    static String reverse(String s){
        String revString="";
        for(int i=0;i<s.length();i++){
            revString=s.charAt(i)+revString;
        }
        return revString;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String str[]=s.split(" ");
        for(int i=0;i<str.length;i++){
            if(i%2==0){
                str[i]=reverse(str[i]);
            }
        }

     for(String ss:str){
        System.out.print(ss+" ");
     }
    }
}
