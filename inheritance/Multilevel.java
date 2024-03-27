import java.util.*;
class Student  
{
	String s_name;
	int r_no;
    float m1,m2;
	void getStud()
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter student name:");
	    s_name=sc.nextLine();
	    System.out.println("Enter student roll no.:");
	    r_no=Integer.parseInt(sc.nextLine());
        System.out.println("Enter Marks of subject1:");
	    m1=Float.parseFloat(sc.nextLine());
        System.out.println("Enter Marks of subject2:");
	    m2=Float.parseFloat(sc.nextLine());
	}
}

class Test extends  Student 
{
    float avg;
    void findavg()
    {
        avg= (m1 + m2)/2;
    }
}
   
class Result extends Test
{
    void putData()
	{
		System.out.println("Student Name:"+s_name+"\n Student Roll no. :"+r_no+
        "\n Marks of Subject1"+m1+"\n Marks of Subject2"+m2+"\n Total Marks Obtained:"+avg);
	}
}

class Multilevel
{
	public static void main(String args[])
	{
		Result s=new Result();
		s.getStud();
		s.findavg();
		s.putData();
	}
}










