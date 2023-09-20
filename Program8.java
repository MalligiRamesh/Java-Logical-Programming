//Question 8: Write a Java program to find the number of times a given word appears in a string.
import java.util.Scanner;
public class Program8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1[]=s.split(" ");
        String s2[]=s.split(" ");
        for(int i=0;i<s1.length;i++){
            int count=0;
            for(int j=0;j<s2.length;j++){
                if(s1[i].equals(s2[j])){
                   count++;
                   s2[j]="";
                }
            }
            if(count>0){
            System.out.println(s1[i]+" -> "+count);
            }
        }
    }
}
