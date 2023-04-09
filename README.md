# Shape
This code includes five classes Main, Circle, Rectangle, Square, and Pyramid, which implement two interfaces Shape and Volume. It calculates the area and perimeter of various geometric shapes and prints out the result.

Usage
Compile the java files using a java compiler.
Run the Main class using the java command.
Classes
Main
This class is the entry point of the program, it implements the Volume interface, and it contains the main method which creates instances of different shapes and calculates their area, perimeter, and volume (where applicable).

Circle
This class extends the Shape class and implements the Volume interface. It calculates the area, perimeter, and volume of a circle.

Rectangle
This class extends the Shape class and implements the Volume interface. It calculates the area, perimeter, and volume of a rectangle.

Square
This class extends the Shape class and implements the Volume interface. It calculates the area, perimeter, and volume of a square.

Pyramid
This class extends the Shape class and implements the Volume interface. It calculates the surface area and volume of a pyramid.

Interfaces
Shape
This interface declares two methods for calculating the area and perimeter of a geometric shape.

Volume
This interface extends the Shape interface and declares an additional method for calculating the volume of a 3-dimensional shape. The calculateVolume() method is not implemented in the Main class because each shape has its own formula to calculate volume.
