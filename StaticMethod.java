public class StaticMethod{
static int a=10;
int b=20;

void display(){
    System.out.println("value is"+a);

}

static void show(){

    System.out.println("value is"+a);
   // System.out.println("value is"+b);//Cannot make a static reference to the non-static field b
}
public static void main(String[] args){

    StaticMethod st=new StaticMethod();
    st.display();
   // st.show();
}

}