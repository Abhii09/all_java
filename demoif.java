public class demoif{
    int x=10;
    int y=20;
    int z=30;

    public void dif(){

        if(x==10){

            System.out.println("value is 10");
        }
    }

    public void difelse(){


        if(x==20){
            System.out.println("the valu is 20");
        }else{

            System.out.println("the value is not 20");

        }

    }

    public void deleseif(){
        if(x==20){
            System.out.println("value is 20");
        }
        else if(x==30){
            System.out.println("value is 30");

        }
        else{
            System.out.println("value is 10");
        }
    }
    public void nestedif(){

        if(x==10)
        {
            if(x==20){
                System.out.println("value is 20");
            }else{
                System.out.println("value is not 20");
            }   
        }
        else{
            System.out.println("vslue is not 10");
        }
    }
    
    public static void main(String args[]){

        demoif d=new demoif();
        d.dif();
        d.difelse();
        d.deleseif();
        d.nestedif();
    }
    
    }




