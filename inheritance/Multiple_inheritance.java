import java.util.*;

class Exam 
{
	float total_marks , average;
	Scanner sc=new Scanner(System.in);
	int m1,m2,m3;
	void getMarks()
	{
		System.out.println("Enter marks of 3 subjects : ");
		m1=sc.nextInt();
		m2=sc.nextInt();
		m3=sc.nextInt();
	}
}

interface Result
{
	void calMarks();
	String c_name="AISSMS";
}

 class Student extends Exam implements Result
{
	int r_no;
	String s_name;
	void getStud()
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Name : ");
		s_name=sc.nextLine();
		System.out.println("Enter Your Roll No. : ");
		r_no=sc.nextInt();
	}
	public void calMarks()
	{
		total_marks=m1+m2+m3;
		average=total_marks/3;
	}

	void putData()
	{
		System.out.println("Student Name : "+s_name);
		System.out.println("Student Roll No.  : "+r_no);
		System.out.println("Marks of Three Subjects : "+m1+"\t"+m2+"\t"+m3);
		System.out.println("Total marks : "+total_marks);
		System.out.println("Average : "+average);
	}
}

public class Multiple_inheritance {
    public static void main(String args[])
	{
		Student std1= new Student();
		std1.getMarks();
		std1.getStud();
		std1.calMarks();
		System.out.println("Name of collage : "+Student.c_name);		
		std1.putData();		
	}
    
}
