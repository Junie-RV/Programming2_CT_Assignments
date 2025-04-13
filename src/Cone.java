public class Cone extends Shape{
    double radius, height;

    Cone(double r, double h){
        radius = r;
        height = h;
    }

    @Override
    double surface_area() {
        return Math.PI * radius * (radius + Math.sqrt((Math.pow(height, 2) * Math.pow(radius, 2))));
    }

    @Override
    double volume() {
        return Math.PI * Math.pow(radius, 2) * (height/3);
    }

    public String toString(){
        System.out.printf("Cone Info: \nSurface Area: %.2f", this.surface_area());
        System.out.printf("\nVolume: %.2f", this.volume());
        System.out.println();
        return null;
    }
}
