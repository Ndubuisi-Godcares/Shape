// Abstract class Shape
abstract class Shape
    {
        // Abstract method to calculate shape's area
        public abstract void calculateArea();

        // Abstract method to calculate shape's perimeter
        public abstract void calculatePerimeter();

        public void stateshape(String shape)
        {
            System.out.println("Shape: " + shape);
        }
    }


