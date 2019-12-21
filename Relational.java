public class Relational{
    int a=10;
    int b=20;
    public void eq(){
        if(a==b)
        {
            System.out.println("value is equal");
        }
        else{
            System.out.println("value is not equal");
        }
    }
    public void neq(){
        if(a!=b)
        {
            System.out.println("value is not equal");
        }
        else{
            System.out.println("value is equal");
        }
    }public void gt(){
        if(a>b)
        {
            System.out.println("a is greater");
        }
        else{
            System.out.println("a is not greater");
        }
    }public void lt(){
        if(a<b)
        {
            System.out.println("a is small");
        }
        else{
            System.out.println("a is not small");
        }
    }
    public static void main(String args[]){

        Relational r=new Relational();
        r.eq();
        r.neq();
        r.gt();
        r.lt();


    }





}