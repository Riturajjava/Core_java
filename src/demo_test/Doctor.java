package demo_test;

public class Doctor {

    public void age(int age){
        System.out.println("This is function...." +age);
    }
    public void name(String name){
        System.out.println("This is function...."+ name);
    }
    public static void main(String[] args){
        Doctor demo_test=new Doctor();
        demo_test.age(22);
        demo_test.name("Rahul");

    }
    int age;
    String name;

}
