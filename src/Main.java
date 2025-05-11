import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new LinkedList<>();
        Scanner in = new Scanner(System.in);
        in.useDelimiter("\\n");

        // Gets the number of students that are going to be added to the List
        System.out.println("How many students?");
        int num_students = in.nextInt();

        System.out.println("Enter Student data:");

        // Gets all the student data, uses that data to create a Student object,
        // and then adds it to the students LinkedList.
        for(int i = 0; i < num_students; i++){
            System.out.println("\nStudent " + (i+1) + " data: ");
            try {
                System.out.print("Name: ");
                String name = in.next();
                System.out.print("Address: ");
                String address = in.next();
                System.out.print("GPA: ");
                double GPA = in.nextDouble();
                students.add(new Student(name, address, GPA));
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            System.out.println();
        }
        in.close(); // Closes scanner as it is not needed anymore.

        Selection_Sort.sort(students, new Name_Comparator()); // Sorts the student data based on their name

        // Writes student data kept in students LinkedList to a file
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("students.txt"));
            for(Student stu : students){
                writer.write(stu.toString());
            }
            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}