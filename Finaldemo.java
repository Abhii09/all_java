public class Finaldemo{
    final int ab=30;
    Finaldemo(){
        final int a=20;

        System.out.println("value of a:"+a);


    }

    public void add(){

        final int i=10;
        //for(i=0;i<10;i++){
          //  System.out.println("value is"+i) }
         // i=i+10;
          System.out.println(i);
          System.out.println(ab);

    }
    public static void main (String[] args){
        Finaldemo f=new Finaldemo();
    f.add();
    }
}