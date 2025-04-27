public class Student {
    int rollno;
    String name;
    String address;

    Student(){
        rollno = 0;
        name = "";
        address = "";
    }

    Student(int rollno, String name, String address){
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString(){
        return rollno + " " + name + " " + address;
    }
}
