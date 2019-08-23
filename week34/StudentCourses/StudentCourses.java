import java.util.ArrayList;
import java.util.Scanner;

public class StudentCourses
{
    static Scanner in;


    public class Course
    {
        String name;
        String code;
        Course(){}
        Course(String name, String code)
        {
            this.name = name;
            this.code = code;
        }
    }

    public class Student
    {
        String name;
        String group;
        ArrayList<Course> courses;

        Student(){}
        Student(String name, String group)
        {
            this.name = name;
            this.group = group;
            this.courses = new ArrayList<Course>();
        }
    }

    private static String readInput(String question)
    {
        
        while(true)
        {
            System.out.println("\n" + question);
            String input = in.nextLine();
            if (input.length() == 0)
                continue;
                
            return input;
        }
    }

    public static void main(String[] args)
    {
        in = new Scanner(System.in);
        
        ArrayList<Student> students = new ArrayList<Student>();
        
        Student student = new Student();
        student.name = readInput("Enter student name:");
        student.group = readInput("Enter student class:");
        
        do
        {
            Course course = new Course();
            course.name = readInput("Enter course name:");
            course.code = readInput("Enter course code: ");
            student.courses.add(course);
        }while (readInput("Add more courses? (y/n):").contains("y"));


        // Student student = new Student("Ola Normann", "Prog2019");
        // Course course = new Course("Java101 for dummies.", "J101");
    }
}