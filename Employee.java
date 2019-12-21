

public class Employee{
    public String name;
    private double sallary;

    public Employee(String empname){
        name=empname;


    }

    public void setsallary(double empsal){

        sallary=empsal;

    }

    public void printsal(){
        System.out.println("name is:" +name);
        System.out.println("sallary is:"+ sallary);
    }

    public static void main(String args[]){

        Employee e=new Employee("abhi");
        e.setsallary(100000);
        e.printsal();
    }

}