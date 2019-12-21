
public class Math{
    int a=20;
    int b=10;
    int c=0;

    public void add(){

        c=a+b;
        System.out.println("additioon is:" + c);

    }
    public void sub(){

        c=a-b;
        System.out.println("sub is:" + c);

    }public void div(){

        c=a/b;
        System.out.println("dive is:" + c);

    }public void multi(){

        c=a*b;
        System.out.println("multi is:" + c);

    }public void mod(){

        c=a%b;
        System.out.println("mod is:" + c);

    }public void inc(){

        a++;
        System.out.println("additioon is:" + a);

    }
    public void dic(){

        a--;
        System.out.println("additioon is:" + a);

    }

    public static void main(String args[])
    {
        Math m =new Math();
        m.add();
        m.sub();
        m.div();
        m.multi();
        m.mod();
        m.inc();
        m.dic();


    }
}