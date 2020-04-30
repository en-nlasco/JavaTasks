package src;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
Scanner in= new Scanner(System.in);
        String text;
        boolean isPalindrome=true;
        System.out.println("Please insert the text you want to check if it is a palindrome");
        text=in.nextLine();
       // System.out.println(text);
        for(int i=0; i<text.length()/2;i++){

            if (text.charAt(i)!=text.charAt(text.length()-i-1)){
                isPalindrome=false;
                break;
            }}
        if (isPalindrome){
            System.out.println("The text you have inserted is a Palindrome");}
        else {
            System.out.println("The text you have inserted is NOT a Palindrome");}


    }
}
