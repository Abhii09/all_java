

public class DemoArray{

    public void onedArray(){
        
        int[] x=new int[5];
        x[0]=10;
        x[1]=20;
        byte b=30;
        x[2]=b;
        x[3]=40;
        x[4]=50;
        //x[5]=60; array index out of Bound

        for(int a:x){

            
            System.out.println("Arrray is:"+a);
        }
        System.out.println("length is:"+x.length);
        System.out.println("\n.....");
    }

    public void twodArray(){
       int[][] x ={{10,20,30},{40,50}};

      // int[] x={10,20,30,40,50};

 //     System.out.println(x[1][1]);

        for(int j:x[0]){
            System.out.println(j);
                     
        }
        for(int i:x[1]){

                
            System.out.println(i);          
        }
        System.out.println("\n.....");
    }

    public void len(){
        int[] z={10,20,30,40,50};
        for(int a:z){
            System.out.println(a);

        }
        System.out.println(z.length);    
        System.out.println("\n.....");

        String s="aaa";
        System.out.println(s.length());

        System.out.println("\n.....");

        String[] st={"a","aa","aaa"};
        System.out.println(st.length); //lenght of arra, is s 3.
        System.out.println(st[1].length()); //length of st[0], is a 2.


        int[][] m=new int[6][3];

        System.out.println("length is :"+m.length);//in two dimension arrry length considerd base. is a 6  
        System.out.println("\n.....");
    }

    public static void sum(int[] x){

        int total=0;
        for(int xi:x){
            total=total+1;
            System.out.println(xi);

            System.out.println("total is:"+total);
        }
    }
    

    public static void main(String[] args){
        DemoArray d=new DemoArray();

        d.onedArray(); 
        d.twodArray();
        d.len();

        sum(new int[]{10,20,30,40}); //need a static refrance for a method.


    }






}