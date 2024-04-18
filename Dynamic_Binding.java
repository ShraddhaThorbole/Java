import java.util.Scanner;
class Shape 
{
    double a;
    double b;
    Scanner sc = new Scanner(System.in);
    void input() 
    {
        System.out.println("Enter the value of a : ");
        a = sc.nextDouble();
        System.out.println("Enter the value of b : ");
        b = sc.nextDouble();
    }
    void computeArea()
    {
        //default implementation
    }
}

class Triangle extends Shape 
{
    @Override
    void computeArea() 
    {
       double a1=  (1.0/2)* a * b;
       System.out.println("Area of Triangle:"+a1);
    }
}

class Rectangle extends Shape 
{
    @Override
    void computeArea() 
    {
        double a2= a * b;
        System.out.println("Area of Rectangle:"+a2);
    }
}

public class Dynamic_Binding 
{
    public static void main(String[] args) 
    {
        Shape t=new Triangle();
        Shape r=new Rectangle();
        t.input();
        t.computeArea();
        r.input();
        r.computeArea();
    }
}
