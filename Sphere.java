import java.util.Scanner;

//Class Sphere
public class Sphere extends Shape implements Volume {
    double radius;

    // Method to calculate area of sphere
    @Override
    public void calculateArea() {
        System.out.println("Enter radius of the sphere: ");
        Scanner scan = new Scanner(System.in);
        radius = scan.nextDouble();
        double area = 4 * Math.PI * Math.pow(radius,2);
        System.out.println("Surface Area of Sphere: " + area);
    }

    // Method to calculate perimeter of sphere (not implemented)
    @Override
    public void calculatePerimeter() {
        System.out.println("Perimeter calculation is not applicable for Sphere");
    }

    // Method to calculate volume of sphere
    @Override
    public void calculateVolume() {
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        System.out.println("Volume of Sphere: " + volume);
    }
}
