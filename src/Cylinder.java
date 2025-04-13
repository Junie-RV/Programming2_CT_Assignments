public class Cylinder extends Shape{
    double radius, height;

    Cylinder(double r, double h){
        radius = r;
        height = h;
    }

    @Override
    public double surface_area() {
        return (2 * Math.PI * radius * height) + (2 * Math.PI * Math.pow(radius, 2));
    }

    @Override
    public double volume() {
        return Math.PI * height * Math.pow(radius, 2);
    }

    public String toString(){
        System.out.printf("Cylinder Info: \nSurface Area: %.2f", this.surface_area());
        System.out.printf("\nVolume: %.2f", this.volume());
        System.out.println();
        return null;
    }
}
