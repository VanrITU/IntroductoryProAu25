public class Main {
    public static void main(String[] args) {
    	// provided code
        Triangle triangle = new Triangle(); // Example of how to create an object.
        triangle.makeVisible(); // Makes you able to see it when you run the code.
        //Canvas.getCanvas(); // Creates the picture you can see it on.

        // Exercise 1.1
        triangle.makeInvisible();
        Square square = new Square();
        square.makeVisible();
        triangle.makeVisible();

        // Exercise 1.2
        triangle.moveDown();
        triangle.moveDown();
        triangle.moveDown();
        triangle.moveDown();
        // the triangle moves further down based on the amount it is told to move when called
        square.makeInvisible();
        square.makeInvisible();
        //the square keeps being invisible

        // Exercise 1.3
        Circle circle = new Circle();
        circle.makeVisible();
        circle.moveVertical(10);
        circle.slowMoveHorizontal(70);
        circle.changeSize(50);

        // Exercise 1.4
        circle.changeColor("red");
        circle.changeColor("yellow");

        // Exercise 1.6
        //circle.changeColor(green); this doesnt work


    }
}