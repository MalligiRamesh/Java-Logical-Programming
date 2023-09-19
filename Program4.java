//Question 4: Write a Java program to find the common characters between two strings.
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
public class Program4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch1[]=sc.next().toCharArray();
        char ch2[]=sc.next().toCharArray();

        String s="";
        for(int i=0;i<ch1.length;i++){
            int c=0;
            for(int j=0;j<ch2.length;j++){
                if(ch1[i]==ch2[j]){
                    c++;
                    ch2[j]='\0';
                }
            }
            if(c>0){
                s=s+ch1[i];
            }
        }
        System.out.println("The comman characters are: "+s);
    }
}
