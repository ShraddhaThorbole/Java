public class Anonymous_Class 
{
    public static void main(String args[])
    {
        Sample s1=new Sample()
        {
            public void display()
            {
                System.out.println("Inside Anonymous_Class");
            }
        };
        s1.disp();
    }
}

class Sample
{
    void disp()
    {
        System.out.println("In Sample Class");
    }
}