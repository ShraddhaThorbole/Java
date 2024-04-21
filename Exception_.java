import java.util.*;
class Exception_ 
{
    public static void main(String[] args)
    {
        int num1, num2, result;
        Scanner sc =new Scanner(System.in);
        try
        {
            System.out.println("Enter first number : ");
            num1 =Integer.parseInt(sc.nextLine());
            System.out.println("Enter second number : ");
            num2 =Integer.parseInt(sc.nextLine());
            result = num1 / num2;
            System.out.println("Result : "+result);
        }
        catch(NumberFormatException e)
        {
            System.out.println("Invalid input! Please enter valid integers."+"\n"+e);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Exception Occured! Division by zero"+"\n"+e);
        }
        finally
        {
            System.out.println("Finally  Block");
        }
        sc.close();
    }
}