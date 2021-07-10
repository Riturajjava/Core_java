package demo_test;


public class Teacher {
    double age;
    String name;
    String department;
    int marks;

    public void age(double age){
        System.out.println("this is age function... "+ age);
    }
     public void name(String name){
        System.out.println("This is name function....." + name );
     }
     public void department(String department){
        System.out.println("This is department function...." +department);
     }
     public void marks(int marks){
        System.out.println("This is marks function..."+marks);
     }
     public static void main(String[] args){
        Teacher demo_test=new Teacher();
           demo_test.age(26.6);
           demo_test.name("Rohit");
           demo_test.department("Neuron");
           demo_test.marks(56);

     }
    }
