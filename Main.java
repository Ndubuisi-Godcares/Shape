public class Main implements Volume {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.stateshape("Circle");
        circle.calculateArea();
        circle.calculatePerimeter();
        circle.calculateVolume();


        Rectangle rectangle = new Rectangle();
        rectangle.stateshape("Rectangle");
        rectangle.calculateArea();
        rectangle.calculatePerimeter();
        rectangle.calculateVolume();

        Square square = new Square();
        square.stateshape("Square");
        square.calculateArea();
        square.calculatePerimeter();
        square.calculateVolume();

        Sphere sphere = new Sphere();
        sphere.stateshape("Sphere");
        sphere.calculateArea();
        sphere.calculatePerimeter();
        sphere.calculateVolume();

        Pyramid pyramid = new Pyramid();
        pyramid.stateshape("Sphere");
        pyramid.calculateArea();
        pyramid.calculatePerimeter();
        pyramid.calculateVolume();
    }

    @Override
    public void calculateVolume()
    {
    }
}