package ploymarphism.methodOverRriding;

public class Child1 extends Child2 {
    public void details(String name,String surName){

        System.out.println("I am in Child 1  ");
        System.out.println(name);
        System.out.println(surName);
    }
    public void student(String collegeName,String universityName){
        System.out.println("I am in Child 1  ");
        System.out.println(collegeName);
        System.out.println(universityName);
    }

    public static void main(String[] args) {
        System.out.println("------------------");
        // Referance    Object
        Child1 child1=new Child1();
        child1.student("Pune College of Arts and Science","Pune University");
        child1.details("Nikhilesh","Alle");
        System.out.println("----------------------");

        // Referance    Object
        Child2 child2=new Child2();
        child2.student("Solapur College of Arts and Science","Solapur University");
        child2.details("Ramesh","Kadam");
        System.out.println("------------------------");

        // Referance    Object
        Child2 child4=new Child1();
        child4.student("Mumbai College of Arts and Science","Mumbai University");
        child4.details("Kamini","Gunjalkar");

        // When we Create an object of Child2 Class and Ref of Child1 Class Then
        // JVM  While Running It will Check  Method on Ref Class and If it is present then and then it will called
        // whoever object of class is created as well as if it not present then also it will be called whoever object
        // of class is created


         // Referance    Object
//        Child1 child3=new Child2();
//        child3.student("Mumbai College of Arts and Science","Mumbai University");
//        child3.details("Kamini","Gunjalkar");

    }

}
