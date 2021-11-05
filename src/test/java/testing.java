/*
Name: Nathan Hansberry
Date: 05/11/2021

Title: Assignment 1 for CT417 part B: Student Registration System

Description: Driver Class to do some testing on the student Registration system pulled from GitHub using jenkins
 */
import org.junit.Test;
import org.joda.time.DateTime;
import static org.junit.Assert.assertEquals;

public class testing {
    // Just one junit test in which I create many instances and do some interactions with them before doing checks using assertEquals

    @Test
    public void test() {

        //Creating fictional students with mock data
        Student s1 = new Student("Ally Smith", new DateTime(2001, 5, 20, 0, 0), 17111111);
        Student s2 = new Student("Ben Thompson", new DateTime(2000, 8, 26, 0, 0), 17111112);
        Student s3 = new Student("Cathal Higgins", new DateTime(1999, 12, 15, 0, 0), 17111113);
        Student s4 = new Student("Damian McGee", new DateTime(2001, 5, 30, 0, 0), 17111114);
        Student s5 = new Student("Even Williams", new DateTime(1998, 3, 8, 0, 0), 17111115);
        Student s6 = new Student("John Harris", new DateTime(2002, 6, 1, 0, 0), 17111116);

        //Creating fictional Modules with mock data
        Modules m1 = new Modules("Software Engineering", "CT-417");
        Modules m2 = new Modules("Programming III", "CT-451");
        Modules m3 = new Modules("Radio Frequency Engineering", "EE-452");
        Modules m4 = new Modules("Mobile Architecture Engineering", "EE-517");
        Modules m5 = new Modules("Embedded Systems", "EE-321");

        //Creating course programmes with mock data
        CourseProgramme c1 = new CourseProgramme("ECE", new DateTime(2021, 9, 1, 0, 0), new DateTime(2022, 6, 1, 0, 0));
        CourseProgramme c2= new CourseProgramme("CS",new DateTime(2021,9,1,0,0),new DateTime(2022,6,1,0,0));

        // Adding the students to to several Modules
        m1.addStudent(s1);
        m1.addStudent(s2);
        m1.addStudent(s3);
        m2.addStudent(s4);
        m2.addStudent(s5);
        m2.addStudent(s6);
        m3.addStudent(s3);
        m3.addStudent(s1);
        m4.addStudent(s2);
        m4.addStudent(s6);
        m5.addStudent(s3);

        //Adding Modules to Course Programmes
        c1.addModule(m1);
        c1.addModule(m2);
        c1.addModule(m3);
        c1.addModule(m3);
        c2.addModule(m4);
        c2.addModule(m5);

        //Printing out List of Courses, their modules, and the students in that course
        System.out.println("\n\n\nCourse Name: "+c1+", Modules: "+c1.getModules()+", Enrolled Students: "+c1.getStudents());
        System.out.println("\nCourse Name: "+c2+", Modules: "+c2.getModules()+", Enrolled Students: "+c2.getStudents()+"\n\n");

        //assertEquals(7,8);
    }

}
