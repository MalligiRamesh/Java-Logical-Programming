//Question 5: Write a Java program to check if a given string is a valid shuffle of two other strings.
import java.util.Scanner;
public class Program5{
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        String suffledString=sc.next();
       int c=0;
        for(int i=0;i<suffledString.length();i++){
            for(int j=0;j<s1.length();j++){
                if(suffledString.charAt(i)==s1.charAt(j)){
                    i++;
                    c++;
                    for(int k=0;k<s2.length();k++){
                        if(suffledString.charAt(i)==s2.charAt(k)){
                         c++;
                        }
                    }
                }
            }
        }
        if(c==suffledString.length()){
            System.out.println("The shuffled string is a valid shuffle of the first two strings.");
        }
        else{
            System.out.println("The shuffled string is not a valid shuffle of the first two strings.");
                   
        }
    }
}