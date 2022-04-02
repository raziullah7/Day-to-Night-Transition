public class MainFile {
// Making the objects and transitions directly into the main method
// Not a neat and recommended approach
    public static void main(String args[]) {
        // sun's initial state
        Circle sun = new Circle();
        sun.makeVisible();
        sun.changeColor("yellow");
        sun.moveVertical(155);
        sun.moveHorizontal(-190);
        sun.changeSize(60);

        // walls initial state
        Square walls = new Square();
        walls.makeVisible();
        walls.changeSize(120);
        walls.moveVertical(40);
        walls.moveHorizontal(-150);

        // window's initial state
        Square window = new Square();
        window.makeVisible();
        window.changeColor("black");
        window.changeSize(35);
        window.moveHorizontal(-135);
        window.moveVertical(60);

        // roof's initial state
        Triangle roof = new Triangle();
        roof.makeVisible();
        roof.moveVertical(-25);
        roof.changeSize(55, 160);
        roof.moveHorizontal(8);

        // person1's initial state
        Person person1 = new Person();
        person1.makeVisible();
        person1.moveVertical(30);
        person1.moveHorizontal(8);

        // football's initial state
        Circle football = new Circle();
        football.makeVisible();
        football.changeColor("blue");
        football.changeSize(12);
        football.moveVertical(170);
        football.moveHorizontal(65);

        // person2's initial state
        Person person2 = new Person();
        person2.moveVertical(30);
        person2.moveHorizontal(200);

        // Transition of Sun (Part 1)
        for (int i = 0; i < 13; i++) {
            sun.slowMoveVertical(-10);
        }
        sun.slowMoveVertical(-5);
        person2.makeVisible();

        // Transition of Sun, Hand Shake and Football
        int shake = 0;
        for (int i = 0; i < 20; i++) {
            if (i < 4)
                sun.moveVertical(-10);
            else if (i < 8) {
                sun.moveVertical(-2);
                sun.moveHorizontal(2);
                sun.moveVertical(-2);
                sun.moveHorizontal(2);
                sun.moveVertical(-2);
                sun.moveHorizontal(2);
                sun.moveVertical(-3);
                sun.moveHorizontal(3);
                sun.moveVertical(-3);
                sun.moveHorizontal(3);
            }
            else if (i < 15) {
                sun.slowMoveHorizontal(5);
                sun.moveHorizontal(5);
                sun.slowMoveHorizontal(5);
                sun.moveHorizontal(5);
                sun.slowMoveHorizontal(5);
                sun.moveHorizontal(5);
                sun.slowMoveHorizontal(5);
                sun.moveHorizontal(5);
            }
            else if (i < 20) {
                sun.moveVertical(10);
                sun.moveHorizontal(5);
            }
            if (shake == 0) {
                for (int j = 0; j < 11; j++) {
                    person1.moveHorizontal(5);
                    person1.slowMoveHorizontal(5);
                    person1.moveHorizontal(5);
                }
                for (int k = 0; k < 11; k++) {
                    person1.moveHorizontal(-5);
                    person1.slowMoveHorizontal(-5);
                    person1.moveHorizontal(-5);
                }
                shake++;
            }
            if (i % 2 == 0) {
                for (int l = 0; l < 11; l++) {
                    football.moveHorizontal(5);
                    football.slowMoveHorizontal(5);
                    football.moveHorizontal(5);
                }
            }
            else {
                for (int m = 0; m < 11; m++) {
                    football.moveHorizontal(-5);
                    football.slowMoveHorizontal(-5);
                    football.moveHorizontal(-5);
                }
            }
        }
        // Transition of Sun Set and Person 2 Chutti
        sun.slowMoveVertical(10);
        person2.makeInvisible();
        sun.changeColor("red");
        sun.slowMoveVertical(110);

        walls.changeColor("black");
        window.changeColor("white");
        roof.changeColor("black");
        sun.changeColor("black");
    }
}