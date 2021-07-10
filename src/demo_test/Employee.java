package demo_test;

public class Employee {
     int age;
     String name;
     public void age(int age){
         System.out.println("this is age functions--"+age);

     }
     public void name(String name){
         System.out.println("this is name functions--"+name);
     }
     public static void main(String[] args){
         Employee demo_test=new Employee();
           demo_test.age(23);
           demo_test.name("Ritu_raj");
         }


    }


