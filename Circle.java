import java.util.Scanner;

// Class Circle
public class Circle extends Shape implements Volume
{
    double radius;
    // Method to calculate area of circle
    @Override
    public void calculateArea()
    {
        System.out.println("Enter radius of circle: ");
        Scanner scan = new Scanner(System.in);
        radius = scan.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
    // Method to calculate perimeter of circle
    @Override
    public void calculatePerimeter()
    {
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Perimeter of Circle: " + perimeter);
    }
    // Method to calculate volume of circle (not implemented)
    public void calculateVolume()
    {
        System.out.println("Volume calculation is not applicable for Circle");
    }

}
