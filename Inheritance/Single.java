import java.util.*;
class Department
{
	String dept_name;
	int dept_no;
	void getDept()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter department name:");
	dept_name=sc.nextLine();
	System.out.println("Enter department no.:");
	dept_no=Integer.parseInt(sc.nextLine());
	}
}
class Student extends Department
{
	String s_name;
	int r_no;
	void getStud()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter student name:");
	s_name=sc.nextLine();
	System.out.println("Enter student no.:");
	r_no=Integer.parseInt(sc.nextLine());
	}
	void putData()
	{
		System.out.println("Department name:"+dept_name+"Department No."+dept_no+"Student Name:"+s_name+"Student Roll no. :"+r_no);
	}
}

class Single
{
	public static void main(String args[])
	{
		Student s=new Student();
		s.getDept();
		s.getStud();
		s.putData();
	}
}









