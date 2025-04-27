import java.util.Comparator;

public class Rollno_Comparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.rollno, o2.rollno);
    }
}
