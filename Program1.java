//Question 1: Write a Java program to reverse each word in a string without changing the order of the words.
import java.util.Scanner;
public class Program1{
    static String reverse(String word){
      String reversedWord="";
      for(int i=0;i<word.length();i++){
        reversedWord=word.charAt(i)+reversedWord;
      }
      return reversedWord;
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String sentence=sc.nextLine();
        String [] words=sentence.split(" ");
        String reversedSentence="";
        for(int i=0;i<words.length;i++){
            reversedSentence=reversedSentence+reverse(words[i]);
            if(i<words.length-1){
                 reversedSentence=reversedSentence+" ";
            }
        }

        System.out.println(reversedSentence);
    }

}