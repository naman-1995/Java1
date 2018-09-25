package bootcamp;

public class static_print {
    static String namef;
    static String namel;
    static int age1;

    static{
        namef="NAMAN";
        namel="GUPTA";
        age1=22;
    }

    public static void info()
    {
        String fname="Naman";
        String lname="Gupta";
        int age=22;
        System.out.println(fname);
        System.out.println(lname);
        System.out.println(age);
    }


    public static void main(String[] args) {

        System.out.println("1. Variable");

        System.out.println(information.Fname);
        System.out.println(information.Lname);
        System.out.println(information.age);

        System.out.println("2. Block");

        System.out.println(namel);
        System.out.println(namef);
        System.out.println(age1);

        System.out.println("3. Method");
        info();

    }
}

class information{
    static String Fname="Naman";
    static String Lname="Gupta";
    static int age=22;
}
