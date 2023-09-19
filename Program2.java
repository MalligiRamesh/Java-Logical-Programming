//Question 2: Write a Java program to find the second most repeated character in a string.
import java.util.Scanner;
public class Program2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String word=sc.next();
        char ch1[]=word.toCharArray();
        char ch2[]=word.toCharArray();
        int max=-1;
        char ch3=word.charAt(0);
        char ch4=word.charAt(0);
        for(int i=0;i<ch1.length;i++){
            int c=0;
           for(int j=0;j<ch2.length;j++){
             if(ch1[i]==ch2[j]){
                c++;
             }
           }
           if(c>max){
            max=c;
            ch4=ch3;
            ch3=ch1[i];
           }
           else if (c > 0 && c >= max) {
            ch4 = ch1[i];
        }
        }
        System.out.println("The most repeated character is: "+ch4);
    }
}
