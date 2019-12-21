public class Logical{
    int a=10;
    int b=20;

    public void and()
    {
        if(a<b && a<=b){

            System.out.println("a is small and less equal");
        }
        else{
            System.out.println("a is greater and not less than equal");


        }
    }
    public void or()
    {
        if(a<b || a<=b){

            System.out.println("a is small and less equal");
        }
        else{
            System.out.println("a is greater and not less than equal");


        }
    }
    
    public static void main(String args[]) {
        Logical l= new Logical();
        l.and();
        l.or();
    }



}