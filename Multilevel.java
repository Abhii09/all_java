
class Abhi{
    public void m1(){
        int x=10;
       System.out.println("class a m1 method"+x);

    }

}
class B extends Abhi{
    public void m2(){
        int x=20;
        System.out.println("class a m2 method"+x);

    }
}

class C extends B{
    public void m3(){
        int x=30;
        System.out.println("class a m3 method"+x);

    }
}

public class Multilevel{
public static void main(String[] args){
 
    C c=new C();
    c.m1();
    c.m2();
    c.m3();

    

}
}


