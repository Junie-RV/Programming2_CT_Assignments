public class Student {
    String name;
    String address;
    double GPA;

    Student(String name, String address, double GPA){
        this.name = name;
        this.address = address;
        this.GPA = GPA;
    }

    @Override
    public String toString(){
        return name + " " + address + " " + GPA + "\n";
    }
}
