package bootcamp;

import java.util.Scanner;

public class single_elem {

    public static void single_element(int[] arr)
    {


        for(int j=0;j<arr.length;j++)
        {
            int count =0;
            for(int k=0;k<arr.length;k++)
            {
                if(arr[j]==arr[k])
                {
                    count++;
                }
            }
            if(count!=2)
            {
                System.out.println("Single element :" + " " + arr[j]);
            }
        }

    }

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.println("Enter required size");
        int size=s.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter elements");
        for(int i=0;i<size;i++)
        {
            arr[i]=s.nextInt();
        }
    single_element(arr);
    }

}
