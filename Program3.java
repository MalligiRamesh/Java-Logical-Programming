//Question 3: Write a Java program to check if a given string is a rotation of another string.
import java.util.Scanner;
public class Program3 {
    static String reverse(String s1,String s2){
        char ch[]=s1.toCharArray();
        for(int i=0;i<s2.length();i++){
            for(int j=i;j<ch.length;j++){
                if(s2.charAt(i)==ch[j]){
                  char c=ch[i];
                   ch[i]=ch[j];
                   ch[j]=c;
                }
            }
        }
        return new String(ch);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        String s3=reverse(s1,s2);
        if(s3.equals(s2)){
            System.out.println("They second is a rotation of first String");
        }
        else{
            System.out.println("They second is not a rotation of first String"); 
        }
    }
}
