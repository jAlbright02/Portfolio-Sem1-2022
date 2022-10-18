package ie.atu.weekLab5;

import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {

        //first instance of student
        //retrieve all info through getters and setters
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

        //second instance of student
        //retrieve name with constructor and the rest with getters and setters
        System.out.println("Please enter second student's name:");
        String studentName2 = studentInput.nextLine();
        Student infoStudent2 = new Student(studentName2);

        System.out.println("Please enter second student's email:");
        String studentEmail2 = studentInput.nextLine();
        infoStudent2.setEmailStudent(studentEmail2);

        System.out.println("Please enter second student's course:");
        String studentCourse2 = studentInput.nextLine();
        infoStudent2.setCourseStudent(studentCourse2);

        //third instance of student
        //retrieve everything with constructors
        System.out.println("Please enter third student's name:");
        String studentName3 = studentInput.nextLine();

        System.out.println("Please enter third student's email:");
        String studentEmail3 = studentInput.nextLine();

        System.out.println("Please enter third student's course:");
        String studentCourse3 = studentInput.nextLine();

        Student infoStudent3 = new Student(studentName3, studentEmail3, studentCourse3);

        //display all student information
        System.out.printf("\nStudent One\nName: %s\nEmail: %s\nCourse: %s\n", infoStudent.getNameStudent(), infoStudent.getEmailStudent(), infoStudent.getCourseStudent());
        System.out.printf("\nStudent Two\nName: %s\nEmail: %s\nCourse: %s\n", infoStudent2.getNameStudent(), infoStudent2.getEmailStudent(), infoStudent2.getCourseStudent());
        System.out.printf("\nStudent Three\nName: %s\nEmail: %s\nCourse: %s\n", infoStudent3.getNameStudent(), infoStudent3.getEmailStudent(), infoStudent3.getCourseStudent());

    }
}
