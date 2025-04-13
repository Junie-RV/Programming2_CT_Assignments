import java.util.ArrayList;

public class ShapeArray {
    public static void main(String[] args) {
        ArrayList<Shape> shapeArray= new ArrayList<>();

        Sphere sphere1 = new Sphere(5);
        Cylinder cylinder1 = new Cylinder(3, 5);
        Cone cone1 = new Cone(4, 4);

        shapeArray.add(sphere1);
        shapeArray.add(cylinder1);
        shapeArray.add(cone1);

        for(int i = 0; i < shapeArray.size(); i++){
            shapeArray.get(i).toString();
            System.out.println();
        }
    }
}