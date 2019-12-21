public class Assignment{
    int a=10;
    int b=20;
    

    public void add(){
        b+=a;
        System.out.println("addition is:"+b);
        b-=a;
        System.out.println("sub is:"+b);
        b*=a;
        System.out.println("mult is:"+b);
        b/=a;
        System.out.println("div is:"+b);
        b%=a;
        System.out.println("mod is:"+b);
        b<<=a;
        System.out.println("b is greater:"+b);
        b&=2;
        System.out.println("addition is:"+b);


    }
    public static void main (String args[]){

        Assignment a=new Assignment();
        a.add();
    }


}

