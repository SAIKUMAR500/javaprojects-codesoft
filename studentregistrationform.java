import java.util.Scanner;

public class studentregistrationform {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the student's name.
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        // Get the student's age.
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        // Get the student's email address.
        System.out.println("Enter your email address: ");
        String email = scanner.nextLine();

      
         // Get the student's email address.
        System.out.println("Enter your email address: ");
        String Email = scanner.nextLine();

        

        // Get the student's grade.
        System.out.println("Enter your grade: ");
        String grade = scanner.nextLine();

       
        // Print the student's information.
        System.out.println("Student information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);

         System.out.println("Email: " + Email);
    }
}