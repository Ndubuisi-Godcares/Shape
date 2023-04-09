import java.util.Scanner;

public class Pyramid extends Shape implements Volume {
    double l, w, h, V;

    @Override
    public void calculateArea() {
        System.out.println("Enter length, width, and height of the pyramid:");
        Scanner scan = new Scanner(System.in);
        l = scan.nextDouble();
        w = scan.nextDouble();
        h = scan.nextDouble();
        double area = l * w + l * Math.sqrt(Math.pow(w / 2, 2) + Math.pow(h, 2)) + w * Math.sqrt(Math.pow(l / 2, 2) + Math.pow(h, 2));
        System.out.println("Surface Area of Pyramid: " + area);
    }
    @Override
    public void calculatePerimeter() {
        System.out.println("Enter length, width, and height of the pyramid:");
        Scanner scan = new Scanner(System.in);
        l = scan.nextDouble();
        w = scan.nextDouble();
        h = scan.nextDouble();
        double perimeter = l + 2 * Math.sqrt(Math.pow(w / 2, 2) + Math.pow(h, 2)) + 2 * Math.sqrt(Math.pow(l / 2, 2) + Math.pow(h, 2));
        System.out.println("Perimeter of Pyramid: " + perimeter);
    }

    @Override
    public void calculateVolume() {
        System.out.println("Enter length, width, and height of the pyramid:");
        Scanner scan = new Scanner(System.in);
        l = scan.nextDouble();
        w = scan.nextDouble();
        h = scan.nextDouble();
        double volume = (l * w * h) / 3.0;
        System.out.println("Volume of Pyramid: " + volume);
    }
}
