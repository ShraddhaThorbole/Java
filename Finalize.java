public class Finalize 
{
    int i = 50;
    protected void finalize() throws Throwable
    {
        System.out.println("From Finalize Method");
    }
    public static void main(String[] args)
    {
        Finalize F1 = new Finalize();
        Finalize F2 = new Finalize();
        F1 = F2;
        System.out.println("done");
        System.gc(); 
    }
}

