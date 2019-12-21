//number and char both practis in 1 program.
public class Number{

    public static void main(String args[]){
        byte b=10;
        short s=20;
        int i=30;
        float f=40;
        double d=100.0;
        char ch='a'; //character is also there.
        boolean bo=true;

        b+=10;
        s+=20;
        i+=30;
        f+=10.5;
        d+=110;
        ch+='b';

        
        Byte byteobj=b;
        Short shortobj=s;
        Integer intobj=i;
        Float floatobj=f;
        Double dobj=d;
        Character chobj=ch;
        Boolean bobj=bo;

        System.out.println("value"+byteobj);
        System.out.println("value"+shortobj);
        System.out.println("value"+intobj);
        System.out.println("value"+floatobj);
        System.out.println("value"+dobj);
        System.out.println("value"+chobj);
        System.out.println("value"+bobj);


        byte bytval=byteobj;
        short shval=shortobj;
        int intval=intobj;
        float fval=floatobj;
        double dval=dobj;
        char chval=chobj;

        System.out.println("\n \n");
        System.out.println("value"+bytval);
        System.out.println("value"+shval);
        System.out.println("value"+intval);
        System.out.println("value"+fval);
        System.out.println("value"+dval);
        System.out.println("value"+chval);

        System.out.println(Character.isLetter('a'));
        System.out.println(Character.isDigit('a'));
        System.out.println(Character.isWhitespace('a'));
        System.out.println(Character.isUpperCase('a'));
        System.out.println(Character.isLowerCase('a'));
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toLowerCase('a'));








    }
}