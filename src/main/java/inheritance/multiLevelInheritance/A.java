package inheritance.singleInheritance;

public class Child extends Parent {

    public static void main(String[] args) {
        //Reference   Object
        Child ch=new Child();
        ch.emp();
        ch.studentDetails();

        System.out.println("----------------");
        //Reference   Object
        Parent pr=new Child();
        pr.emp();
        pr.studentDetails();

        System.out.println("----------------");
        //Reference   Object
        Parent pr1=new Parent();
        pr1.studentDetails();
        pr1.emp();

        System.out.println("----------------");

        Parent pr5=new Parent();
        pr5.emp();
        pr5.studentDetails();

        System.out.println("----------------");

        Parent1 pr6=new Parent1();
        pr6.emp();
        pr6.studentDetails();

        //Reference   Object
//        Parent pr3=new Parent1();
//        pr3.emp();
//        pr3.studentDetails();
//
//        Parent1 pr4=new Parent();
//        pr4.emp();
//        pr4.studentDetails();
//        Child ch1=new Parent();
//        ch1.emp();
//        ch1.studentDetails();







    }

}
