package ie.atu.weekLab5;

import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {

        //first instance of student
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


    }
}
