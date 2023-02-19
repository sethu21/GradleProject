package coderocket.test01.Student;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StudentService studentService = new StudentService(new StudentRepository());


        MainAction createStudentAction = new CreateStudentsAction(studentService);
        MainAction getStudentByIdAction = new GetStudentByIdAction(studentService);
        MainAction updateStudentAction = new UpdateStudentAction(studentService);
        MainAction getAllStudentsAction = new GetAllStudentsAction(studentService);
        MainAction deleteStudentAction = new DeleteStudentMainAction(studentService);
        MainAction findStudentsByNameAction = new FindStudentsByNameMainAction(studentService);


        Scanner scanner = new Scanner(System.in);
        while (true) {
            // Display menu
            System.out.println("Select an action:");
            System.out.println("1. Create a new student");
            System.out.println("2. Get student by ID");
            System.out.println("3. Update a student");
            System.out.println("4. Delete a student");
            System.out.println("5. Find students by name");
            System.out.println("6. Update students");
            System.out.println("0. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character left by nextInt()

            switch (choice) {
                case 1:
                    createStudentAction.execute();
                    break;
                case 2:
                    getStudentByIdAction.execute();
                    break;
                case 3:
                    updateStudentAction.execute();
                    break;
                case 4:
                    deleteStudentAction.execute();
                    break;
                case 5:
                    findStudentsByNameAction.execute();
                    break;
                case 6:
                    getAllStudentsAction.execute();
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
    }


    }
