public class MethodOverloading{
    public static int minValue(int n1, int n2)//same method name nut diffrent paramiter will passed
    {

        int min;
        if(n1<n2)
        min=n1;
        else
        min=n2;

        return min;

    }
    public static int minValue(short n1, short n2) //seam method name nut diffrent paramiter will passed
    {

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
        short c=30;
        short d=20;
        int result1=minValue(a, b);
        int result2=minValue(c, d);

        System.out.println("min value is:"+result1);
        System.out.println("min value is:"+result2);

    }
}