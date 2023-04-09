import java.util.Scanner;

// Class Square
public class Square extends Shape implements Volume
{
    double side;
    // Method to calculate area of square
    @Override
    public void calculateArea()
    {
        System.out.println("Enter length of square: ");
        Scanner scan = new Scanner(System.in);
        side = scan.nextDouble();
        double area = side * side;
        System.out.println("Area of Square: " + area);
    }
    // Method to calculate perimeter of square
    @Override
    public void calculatePerimeter()
    {
        double perimeter = 4 * side;
        System.out.println("Perimeter of Square: " + perimeter);
    }
    // Method to calculate volume of square (not implemented)
    public void calculateVolume()
    {
        System.out.println("Volume calculation is not applicable for Square");
    }
}