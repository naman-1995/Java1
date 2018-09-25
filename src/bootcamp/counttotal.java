package bootcamp;

import java.util.Scanner;

public class counttotal {

    public static void count(String str) {
        int countup=0;
        int countlow=0;
        int countdigit=0;
        int spclchar=0;


        for (int i = 0; i < str.length(); i++)
        {
            char ch=str.charAt(i);
            int asciivalue = (int)ch;
            if(asciivalue >=65 && asciivalue <=90)
            {
                countup=countup+1;
            }
            else if(asciivalue >=97 && asciivalue <=122){
            countlow=countlow+1;
        }
        else if(str.charAt(i)>='0'&&str.charAt(i)<='9')
        {
            countdigit=countdigit+1;
        }
        else {
            spclchar=spclchar+1;
        }
        }

        int total=countup+countlow+countdigit+spclchar;

        System.out.println(total);
        System.out.println("upper case:" + countup +" "+"percentage:" + ((float)countup/total)*100);
        System.out.println("lower case:" + countlow +" "+"percentage:" + ((float)countlow/total)*100);
        System.out.println("Digits:" + countdigit +" "+"percentage:" + ((float)countdigit/total)*100);
        System.out.println("special character:" + spclchar +" "+"percentage:" + ((float)spclchar/total)*100);
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter string");
        String str = s.nextLine();

        count(str);

    }
}