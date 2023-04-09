import java.util.Scanner;

// Class Rectangle
public class Rectangle extends Shape implements Volume
{
    double length;
    double breadth;
    // Method to calculate area of rectangle
    @Override
    public void calculateArea()
    {
        System.out.println("Enter length of rectangle: ");
        Scanner scan = new Scanner(System.in);
        length = scan.nextDouble();

        System.out.println("Enter breadth of rectangle: ");
        breadth = scan.nextDouble();
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);

    }
    // Method to calculate perimeter of rectangle
    @Override
    public void calculatePerimeter()
    {
        double perimeter = 2 * (length + breadth);
        System.out.println("Perimeter of Rectangle: " + perimeter);
    }
    // Method to calculate volume of rectangle (not implemented)
    public void calculateVolume()
    {
        System.out.println("Volume calculation is not applicable for Rectangle");
    }

}