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
    private Person person1;
    private Person person2;
    private Circle football;

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

        person1 = new Person();
        person1.moveDown();
        person1.moveRight();

        person2 = new Person();
        person2.moveDown();
        person2.moveHorizontal(180);

        football = new Circle();
        football.changeSize(15);
        football.changeColor("blue");
        football.moveVertical(160);
        football.moveHorizontal(73);

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

// ----------------------------------------------------------
    // Making my own method for neatness and encapsulation
    // Method to handle all the transitions in the MainTry2.java
    public void transitioning() {
        sun.slowMoveVertical(-50);
        person1.makeVisible();
        sun.slowMoveVertical(-50);
        person2.makeVisible();
        sun.slowMoveVertical(-50);
        football.makeVisible();
        sun.slowMoveVertical(-19);

        // Curve up the sun
        // Simultaneous movement of sun and person1 (+ve direction)
        for (int i = 0; i < 30; i++) {
            sun.moveVertical(-1);
            if (i % 3 == 0)
                person1.moveHorizontal(5);
            else
                person1.moveHorizontal(4);
            sun.moveHorizontal(1);
        }

        // Simultaneous movement of sun and person1 (-ve direction)
        for (int i = 0; i < 30; i++) {
            sun.moveVertical(-1);
            if (i % 3 == 0)
                person1.moveHorizontal(-5);
            else
                person1.moveHorizontal(-4);
            sun.moveHorizontal(1);
        }

        // Moving sun horizontal (+ve direction) when at highest position
        // Simultaneously passing the football between person1 and person2
        for (int i = 0; i < 55; i++) {
            if (i % 2 == 0)
                football.moveHorizontal(2);
            else
                football.moveHorizontal(3);
            sun.moveHorizontal(1);
        }
        for (int i = 0; i < 55; i++) {
            if (i % 2 == 0)
                football.moveHorizontal(-2);
            else
                football.moveHorizontal(-3);
            sun.moveHorizontal(1);
        }
        for (int i = 0; i < 55; i++) {
            if (i % 2 == 0)
                football.moveHorizontal(2);
            else
                football.moveHorizontal(3);
            sun.moveHorizontal(1);
        }
        for (int i = 0; i < 55; i++) {
            if (i % 2 == 0)
                football.moveHorizontal(-2);
            else
                football.moveHorizontal(-3);
            sun.moveHorizontal(1);
        }

        // Curve down the sun
        // Simultaneous movement of sun and person1 (+ve direction)
        for (int i = 0; i < 30; i++) {
            sun.moveVertical(1);
            if (i % 3 == 0)
                football.moveHorizontal(5);
            else
                football.moveHorizontal(4);
            sun.moveHorizontal(1);
        }

        // Simultaneous movement of sun and person1 (-ve direction)
        for (int i = 0; i < 30; i++) {
            sun.moveVertical(1);
            if (i % 3 == 0)
                football.moveHorizontal(-5);
            else
                football.moveHorizontal(-4);
            sun.moveHorizontal(1);
        }

        // Sunset and finishing scenes
        sun.slowMoveVertical(30);
        person2.makeInvisible();
        sun.changeColor("red");
        sun.slowMoveVertical(20);
        football.slowMoveVertical(-40);
        person1.slowMoveHorizontal(-10);
        football.makeInvisible();
        person1.makeInvisible();
        sun.slowMoveVertical(100);
        sun.makeInvisible();
    }

    // Let's hope a black colored moon works ;)
    public void sunToMoonConversion() {
        sun.changeSize(60);
        sun.moveHorizontal(-380);
        sun.moveVertical(-170);
        sun.makeVisible();

        for (int i = 0; i < 30; i++) {
            sun.moveVertical(-1);
            sun.moveHorizontal(2);
        }
    }
// -----------------------------------------------------------

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
