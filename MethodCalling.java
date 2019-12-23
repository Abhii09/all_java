
public class MethodCalling{
    public static int minValue(int n1, int n2){
        int min;
        if(n1<n2)
            min=n1;
        else
            min=n2;

        return min;
    }
    public static void main(String[] args){

        int a=10;
        int b=20;
        int c= minValue(a, b); //Method calling
        System.out.println("minimum value is:"+c);


    }



}