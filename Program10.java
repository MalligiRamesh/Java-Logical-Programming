//Question 10: Write a Java program to find the length of the longest common substring between two strings.
import java.util.Scanner;
public class Program10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        String s3[]=s1.split(" ");
        String s4[]=s2.split(" ");
        String commString="";
        for(int i=0;i<s3.length;i++){
            for(int j=0;j<s4.length;j++){
                if(s3[i].equals(s4[j])){
                    if(s3[i].length()>commString.length()){
                        commString=s3[i];
                    }
                }
            }
        }
        System.out.println("The length of longest common substring is: "+commString.length());
    }
}
