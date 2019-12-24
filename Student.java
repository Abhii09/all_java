//this is a encapsulation
public class Student{
    //encapsulatin meance wrapping data into a single capsul.
    private int rollno;
    private String name;
    private String address;
 //all private variables wrape
    public void setroll(int rollno){

        this.rollno=rollno; //this is use to assing a value for rollno from passing by object
    }

    public int getroll(){

        return this.rollno;
    }
    
    public void setname(String name){

        this.name=name;
    }

    public String getname(){

        return this.name;
    }
    public void setaddress(String address){
        this.address=address;
    }
    public String getAddress(){
        return this.address;
    }
    public static void main(String[] args){

        Student s=new Student();
        s.setroll(101);
        s.setname("abhi");
        s.setaddress("pune");
        int roll=s.getroll();
        System.out.println(roll);
        String name=s.getname();
        System.out.println(name);
        String add=s.getAddress();
        System.out.println(add);
        
    }
}