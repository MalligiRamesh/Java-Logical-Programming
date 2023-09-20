//Question 6: Write a Java program to find the length of the longest substring without repeating characters in a given string.
import java.util.Scanner;
public class Program6 {
    static boolean check(String s){
        char c1[]=s.toCharArray();
        char c2[]=s.toCharArray();
        for(int i=0;i<c1.length;i++){
         int c=0;
          for(int j=0;j<c2.length;j++){
            if(c1[i]==c2[j]){
                c++;
                c2[j]='\0';
            }
          }
          if(!(c<=1)){
              return false;
          }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String subString[]=s.split(" ");
        String lonString="";
        for(int i=0;i<subString.length;i++){
           if(check(subString[i])==true){
              if(subString[i].length()>lonString.length()){
                lonString=subString[i];
              }
           }
        }
        System.out.println("The longest Substring is "+lonString);
    }
}
