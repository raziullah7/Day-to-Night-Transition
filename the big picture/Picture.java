/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael K�lling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Square();
        wall.moveHorizontal(-140);
        wall.moveVertical(20);
        wall.changeSize(120);
        wall.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(-120);
        window.moveVertical(50);
        window.changeSize(40);
        window.makeVisible();

        roof = new Triangle();  
        roof.changeSize(60, 180);
        roof.moveHorizontal(20);
        roof.moveVertical(-40);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.changeSize(55);
        //sun.moveHorizontal(100);
        //sun.moveVertical(-40);
        sun.moveHorizontal(-200);
        sun.moveVertical(140);
        sun.changeSize(80);
        sun.makeVisible();
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    // Method to handle all the transitions in the MainTry2.java
    public void transitioning() {
        sun.slowMoveVertical(-170);
        for (int i = 0; i < 30; i++) {
            sun.slowMoveVertical(-1);
            sun.moveVertical(-1);
            sun.slowMoveHorizontal(1);
            sun.moveHorizontal(1);
        }
        sun.slowMoveHorizontal(220);
        for (int i = 0; i < 30; i++) {
            sun.slowMoveVertical(1);
            sun.moveVertical(1);
            sun.slowMoveHorizontal(1);
            sun.moveHorizontal(1);
        }
        sun.slowMoveVertical(50);
        sun.changeColor("red");
        sun.slowMoveVertical(100);
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }
}
