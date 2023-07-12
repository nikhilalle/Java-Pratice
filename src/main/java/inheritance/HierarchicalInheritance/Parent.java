package inheritance.hybrideInheritance;

public class Parent {
    public void emp(){
        System.out.println();
        System.out.println("Im in Parent ");
        String name="Nikhilesh Alle";
        int id=101;
        char div='A';
        String companyName="TCS";
        System.out.println("Name :  " +name);
        System.out.println("Company  Name :  " +companyName);
        System.out.println("Company I'D :  " +id);
        System.out.println("Designation :  " +div);
        System.out.println();
    }
    public void studentDetails(){
        System.out.println("Im in Parent ");
        String name="Kamini G";
        int rollNo=15001;
        char div='D';
        String collegeName="Pune University";
        System.out.println("Name :  " +name);
        System.out.println("College  Name :  " +collegeName);
        System.out.println("College  Roll Number  :  " +rollNo);
        System.out.println("Division :  " +div);
    }

    public static void main(String[] args) {

    }
}
