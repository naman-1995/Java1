package bootcamp;

import java.util.Scanner;

public class stringrev {
    public static void rem(String str )
    {
        String str1=strrev(str);
        StringBuffer sb = new StringBuffer(str1);
        sb.delete(4,9);
        System.out.println(sb);
    }

    public static String strrev(String str)
    {
        String revstr="";
      for(int i=str.length()-1;i>=0;i--)
      {
          revstr=revstr+str.charAt(i);
      }
        return revstr;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        rem(str);

    }
}
