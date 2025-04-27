import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        Student student1 = new Student(9, "Ramon", "Address9");
        Student student2 = new Student(5, "David", "Address5");
        Student student3 = new Student(3, "Diana", "Address3");
        Student student4 = new Student(4, "Aaron", "Address4");
        Student student5 = new Student(2, "John", "Address2");
        Student student6 = new Student(6, "Alice", "Address6");
        Student student7 = new Student(7, "Maggie", "Address7");
        Student student8 = new Student(8, "Edgar", "Address8");
        Student student9 = new Student(1, "Adrian", "Address1");
        Student student10 = new Student(10, "Debbie", "Address10");

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);
        students.add(student8);
        students.add(student9);
        students.add(student10);

        System.out.println("Before Sort:");
        for(Student student : students){
            System.out.println(student);
        }

        Selection_Sort.sort(students, new Name_Comparator());
        System.out.println("\nAfter Name Sort:");
        for(Student student : students){
            System.out.println(student);
        }

        Selection_Sort.sort(students, new Rollno_Comparator());
        System.out.println("\nAfter Roll number Sort:");
        for(Student student : students){
            System.out.println(student);
        }
    }
}