import java.util.Scanner;

interface Exam {
    static final int marks1=99;
    static final int marks2=98;
    abstract void display();
}

class Sports{
    int score;
    public void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Score :");
        score=sc.nextInt();
    }
}

class Interface_main extends Sports implements Exam{
    public void display()
    {
        System.out.println("Total Score :"+(marks1+marks2+score));
    }   
    public static void main(String args[])
    {
        Interface_main im=new Interface_main();
        im.accept();    
        im.display();    
    }
       
}  
