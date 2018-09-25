package bootcamp;



public class check_overload {

    public static int add(int a,int b)
    {
        int sum=0;
        return sum=a+b;
    }

    public static double add(double a,double b)
    {
        double sum=0;
        return sum=a+b;
    }

    public static int mult(int a,int b)
    {
        int prod=0;
        return prod=a*b;
    }

    public static float mult(float a,float b)
    {
        float prod=0;
        return prod =a*b;
    }

    public static String concat(String str1, String str2)
    {
        String str;
         return str=str1+str2;
    }

    public static String concat(String str1, String str2, String str3)
    {
        String str;
        return str=str1+str2+str3;
    }

    public static void main(String[] args) {

        int ans=add(10,20);
        double ans1=add(10.0,25.5);
        int ans2=mult(10,20);
        float ans3=mult(2.5f,1.5f);
        String ans4=concat("abc","def");
        String ans5=concat("abc","def","ghi");
        System.out.println(ans +" "+ ans1+" "+ans2+" "+ans3+" "+ans4+" "+ans5);

    }
}
