public class Sphere extends Shape{
    double radius;

    Sphere(double r){
        radius = r;
    }

    @Override
    public double surface_area() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double volume() {
        return (4/3) * Math.PI * Math.pow(radius, 3);

    }

    public String toString(){
        System.out.printf("Sphere Info: \nSurface Area: %.2f", this.surface_area());
        System.out.printf("\nVolume: %.2f", this.volume());
        System.out.println();
        return null;
    }
}
