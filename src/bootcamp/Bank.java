package bootcamp;


class bank{
    String name;
    int rof;
    bank(){
        name="Bank";
        rof=0;
    }
    void getDetails(){
        System.out.println("Name : "+name+" , Rate of Interest : "+rof);
    }
}
class SBI extends bank{
    String name;
    int rof;
    SBI(){
        name="SBI";
        rof=8;
    }
    void getDetails(){
        System.out.println("Name : "+name+" , Rate of Interest : "+rof);
    }

}
class BOI extends bank{
    String name;
    int rof;
    BOI(){
        name="BOI";
        rof=10;
    }
    void getDetails(){
        System.out.println("Name : "+name+" ,Rate of Interest : "+rof);
    }

}
class ICICI extends bank{
    String name;
    int rof;
    ICICI(){
        name="ICICI";
        rof=12;
    }
    void getDetails(){
        System.out.println("Name : "+name+" ,Rate of Interest : "+rof);
    }

}
public class Bank {
    public static void main(String[] args) {
        SBI s=new SBI();
        ICICI i=new ICICI();
        BOI b=new BOI();
        s.getDetails();
        i.getDetails();
        b.getDetails();

    }
}