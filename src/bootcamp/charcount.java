package bootcamp;

import java.util.Scanner;

public class charcount {

   public static void charcount(String a,char check) {

        int x=a.length();

       System.out.println(x);
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter string");
        String str = s.nextLine();
        System.out.println(" Enter character to count");
        char c= s.next().charAt(0);
     charcount(str,c);

    }

}