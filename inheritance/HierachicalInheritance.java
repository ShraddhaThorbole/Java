class Person 
{
    String name;
    int age;
    public Person(String name, int age) 
    {
        this.name = name;
        this.age = age;
    }
    public void displayDetails() 
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person 
{
    int rollNumber;
    public Student(String name, int age, int rollNumber) 
    {
        super(name, age);
        this.rollNumber = rollNumber;
    }
    @Override
    public void displayDetails() 
    {
        super.displayDetails();
        System.out.println("Roll Number: " + rollNumber);
    }
}

class Teacher extends Person 
{
    String subject;
    public Teacher(String name, int age, String subject) 
    {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void displayDetails() 
    {
        super.displayDetails();
        System.out.println("Subject: " + subject);
    }
}

public class HierachicalInheritance 
{
    public static void main(String[] args) 
    {
        Student student = new Student("Shraddha", 18, 101);
        Teacher teacher = new Teacher("Mr.Vinay", 35, "Mathematics");

        System.out.println("Student Details:");
        student.displayDetails();
        System.out.println("\nTeacher Details:");
        teacher.displayDetails();
    }
}















