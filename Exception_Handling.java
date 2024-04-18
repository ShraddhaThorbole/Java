public class Exception_Handling 
{
    public static void main(String[] args)
    {
        int a = 10 , b = 0 ;
        try
        {
            int result = a / b;
            System.out.println(" result"+result);
        }
        catch(Exception e)
        {
            System.out.println("Exception caught"+e);
        }
        finally
        {
            System.out.println("Finallyyy!!");
        }
    }
}