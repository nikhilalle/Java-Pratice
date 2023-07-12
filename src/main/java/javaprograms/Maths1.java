package javaprograms;

public class Maths {
    int a=10;
    int b=20;

    public void add(){
        int sum;
        sum=a+b;
        System.out.println(sum);
    }
    public void division(){
        int div;
        div=a/b;
        System.out.println(div);
    }
    public void multiplication(){
        int mutl;
        mutl=a*b;
        System.out.println(mutl);
    }
    public void substration(){
        int sub;
        sub=a-b;
        System.out.println(sub);
    }

    public static void main(String[] args) {
       Maths maths=new Maths();
       maths.add();
       maths.division();
       maths.substration();
       maths.multiplication();
    }
}
