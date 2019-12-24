
class Ab{
    int a;
public void m1(){
     a=10;
    int c=20;
    System.out.println("this is class a"+a+" "+c);
}
public void m2(){
    int b=10;
    System.out.println("this is class a"+b);
}
}

class B extends Ab{
    public void m3(){
        int ab=10;
        int cd=20;
        System.out.println("this is class a"+ab+" "+cd);
    }
    public void m4(){
        int b=10;
        System.out.println("this is class a"+b);
    }   


}


public class Demoinheritance{
    public static void main(String[] args){
        B b=new B();
        b.m1();
        b.m2();
    
        System.out.println("value is"+b.a);
    }
    
}