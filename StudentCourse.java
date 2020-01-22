
package studentcourse;

/**
    @author Ali Amsal
 */


import java.util.Scanner;

class student
{
    Scanner input = new Scanner(System.in);
    private String Name;
    private String Address;
    private int numCourses = 0;
    private String[] courses = new String[30];
    private int[] grades = new int[30];
    public student(String Name, String Address)
    {
        this.Name = Name;
        this.Address = Address;
    }
    public String getName()
    {
        return Name;
    }  
     public String getAddress()
    {
        return Address;
    }    
     public void setAddress(String Address)
    {
        this.Address = Address;
    }
     public String toString()
     {
         return "Name: " + Name + " Address: " + Address;
     }
     public void addCourse(String course)
     {
         courses[numCourses] = course;
         numCourses++;
     }
     public void addCourseGrade(String course, int grade)
     {
         for(int i = 0; i < 30; i++)
         {
             if(course.equals(courses[i]))
             {
                 grades[i] = grade;
                 break;
             }
         }
        
     }
     public void printGrades()
     {
         for(int i = 0; i < 30; i++)
         {
             if(grades[i] == 0)
                 break;
             else
                 System.out.println(courses[i] + ": " + grades[i]);    
         }
     }
     public double getAverageGrade()
     {
         double total = 0.0;
         int index = 0;
         for(int i = 0; i < 30; i++)
         {
             if(grades[i] == 0)
                 break;
             else
             {
                 total += grades[i];
                 index = i;
             }
         }
         double avg = total/(index+1);
         return avg;
     }
} 
public class StudentCourse {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        student s1 = new student("Ali","A-5");
        s1.addCourse("ITP");
        s1.addCourse("ITC");
        s1.addCourse("Calculus");
        s1.addCourse("EGC");
        s1.addCourse("SEPI");
        s1.addCourseGrade("ITP", 96);
        s1.addCourseGrade("ITC", 94);
        s1.addCourseGrade("Calculus", 100);
        s1.addCourseGrade("EGC", 85);
        s1.addCourseGrade("SEPI", 86);
        s1.printGrades();
        System.out.println(s1.getAverageGrade());
    }
   
}


