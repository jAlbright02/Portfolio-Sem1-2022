package ie.atu.weekLab5;

import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {

        //first instance of student
        //retieve all info through getters and setters
        System.out.println("Please enter first student's name:");
        Scanner studentInput = new Scanner(System.in);
        Student infoStudent = new Student();
        String studentName = studentInput.nextLine();
        infoStudent.setNameStudent(studentName);

        System.out.println("Please enter first student's email:");
        String studentEmail = studentInput.nextLine();
        infoStudent.setEmailStudent(studentEmail);

        System.out.println("Please enter first student's course:");
        String studentCourse = studentInput.nextLine();
        infoStudent.setCourseStudent(studentCourse);

        System.out.printf("Name: %s\nEmail: %s\nCourse: %s\n", studentName, studentEmail, studentCourse);

        //second instance of student
        //retrieve name with constructor and the rest with getters and setters
        System.out.println("Please enter second student's name:");
        String studentName2 = studentInput.nextLine();
        Student infoStudent2 = new Student(studentName2);

        System.out.println("Please enter second student's email:");
        String studentEmail2 = studentInput.nextLine();
        infoStudent.setEmailStudent(studentEmail2);

        System.out.println("Please enter second student's course:");
        String studentCourse2 = studentInput.nextLine();
        infoStudent.setCourseStudent(studentCourse2);

        System.out.printf("Name: %s\nEmail: %s\nCourse: %s\n", studentName2, studentEmail2, studentCourse2);

    }
}
