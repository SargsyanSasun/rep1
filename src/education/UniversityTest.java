package education;


import author.Author;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UniversityTest {

    static Scanner scanner = new Scanner(System.in);
    static StudentStorage studentstorage = new StudentStorage();
    static LessonStorage lessonStorage = new LessonStorage();
    private static final String EXIT = "0";
    private static final String ADD_LESSON = "1";
    private static final String ADD_STUDENT = "2";
    private static final String PRINT_STUDENTS = "3";
    private static final String PRINT_STUDENTS_BY_LESSON = "4";
    private static final String PRINT_LESSONS = "5";
    private static final String DELETE_LESSON_BY_NAME = "6";
    private static final String DELETE_STUDENT_BY_EMAIL = "7";

    private static void printCommands() {
        System.out.println("\u001B[34m" + "please input " + EXIT + " for EXIT");
        System.out.println("please input " + ADD_LESSON + " for add lesson");
        System.out.println("please input " + ADD_STUDENT + " for add student");
        System.out.println("please input " + PRINT_STUDENTS + " for print students");
        System.out.println("please input " + PRINT_STUDENTS_BY_LESSON + " for print students lesson");
        System.out.println("please input " + PRINT_LESSONS + " for print lessons");

        System.out.println("please input " + DELETE_LESSON_BY_NAME + " for DELETE_LESSON_BY_NAME");
        System.out.println("please input " + DELETE_STUDENT_BY_EMAIL + " for DELETE_STUDENT_BY_EMAIL" + "\u001B[0m");

    }

    public static void main(String[] args) {

        boolean isRun = true;
        while (isRun) {
            printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_LESSON:
                    addlesson();
                    break;
                case ADD_STUDENT:
                    addstudent();
                    break;
                case PRINT_STUDENTS:
                    studentstorage.print();
                    break;
                case PRINT_STUDENTS_BY_LESSON:
                    lessonStorage.print();
                    studentstorage.print();
                    break;
                case PRINT_LESSONS:
                    lessonStorage.print();
                    break;
                case DELETE_LESSON_BY_NAME:
                    deletelesson();
                    break;
                case DELETE_STUDENT_BY_EMAIL:
                    deletestudent();
                    break;
                default:
                    System.out.println("Invalid command!");
            }
        }
    }

    public static void addstudent() {
        System.out.println("please input student's name,surname,email,age,phone");
        String studentdata = scanner.nextLine();
        String[] studentData = studentdata.split(",");
        if (studentData.length == 5) {
            int age = Integer.parseInt(studentData[4]);
            Student student = new Student(studentData[0], studentData[1], age, studentData[2], studentData[3]);

            if (studentstorage.getByEmail(student.getEmail()) != null) {
                System.err.println("Invalid email. student with this email already exists");
            } else {
                studentstorage.add(student);
                System.out.println("Thank you, student was added");
            }
        } else {
            System.err.println("invalid data");
        }
    }

    public static void addlesson() {
        System.out.println("please import lesson name, lesson duration,lesson lecturer Name, course price");
        String lessondata = scanner.nextLine();
        String[] lessonData = lessondata.split(",");
        if (lessonData.length == 4) {
            int age = Integer.parseInt(lessonData[3]);
            Student lesson = new Student(lessonData[0], lessonData[1], age, lessonData[2], lessonData[3]);

            if (lessonStorage.getname(lesson.getName()) != null) {
                System.err.println("Invalid name. lesson with this name already exists");
            } else {
                lessonStorage.add(lesson);
                System.out.println("Thank you, lesson was added");
            }
        } else {
            System.err.println("invalid data");

        }
    }

    private static void printstudentList() {
        System.out.println("please choose author's email");
        System.out.println("--------");
        studentstorage.print();
        System.out.println("--------");
    }

    private static void deletestudent() {
        printstudentList();
        String email = scanner.nextLine();
        Student student = studentstorage.getByEmail(email);
        if (student != null) {
            studentstorage.delete(student);
        } else {
            System.err.println("Author does not exists");

        }
    }

    private static void printlessonList() {
        System.out.println("please choose lesson's name");
        System.out.println("--------");
        lessonStorage.print();
        System.out.println("--------");
    }

    private static void deletelesson() {
        printlessonList();
        String name = scanner.nextLine();
        Student lesson = lessonStorage.getname(name);
        if (lesson != null) {
            lessonStorage.delete(lesson);
        } else {
            System.err.println("Author does not exists");


        }
    }
}