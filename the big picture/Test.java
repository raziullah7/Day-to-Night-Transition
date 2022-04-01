
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{
    public Test()
    {
        Picture p=new Picture();
        p.draw();
        Person p1=new Person();
        Person P2=new Person();
        Circle ball=new Circle();
        ball.makeVisible();
        ball.changeSize(10);
        ball.moveVertical(140);
        ball.moveHorizontal(80);
        
        p1.moveHorizontal(20);
        P2.moveHorizontal(200);
        p1.makeVisible();
        P2.makeVisible();
        
        Circle s=new Circle();
        s.makeVisible();
        for(int i=0;i<10;i++){
            if(i<5)
            s.slowMoveVertical(-i*2);
            else
            s.slowMoveVertical(i);
            
            if(i%2==0){
            p1.slowMoveHorizontal(10);
            p1.slowMoveHorizontal(-10);
            ball.slowMoveHorizontal(150);
            
        }else{
            ball.slowMoveHorizontal(-150);
        }
    }

}}
