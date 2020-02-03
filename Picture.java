/**
Picture of a man targeting a ball placed on a pillar with a riffle

Author - Dhruba Dey
Date - February 2, 2020

 */
public class Picture
{
    private Square pillar1;
    private Square pillar2;
    private Square pedestal;
    private Circle targetball1; 
    private Square riffle1;
    private Square riffle2;
    private Person man;
    private Square shoe1;
    private Square shoe2;
    private Triangle cap;
    private Circle bullet;
    private Square grass;
    private Triangle shrubs1;
    private Triangle shrubs2;
        
    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        pillar1 = new Square();
        pillar2 = new Square();
        pedestal = new Square();
        targetball1 = new Circle();
        riffle1 = new Square();
        riffle2 = new Square();
        man = new Person();
        shoe1 = new Square();
        shoe2 = new Square();
        cap = new Triangle();
        bullet = new Circle();
        grass = new Square();
        shrubs1 = new Triangle();
        shrubs2 = new Triangle();
                
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        {   
            pillar1.moveHorizontal(-150);
            pillar1.moveVertical(210);
            pillar1.changeSize(300);
            pillar1.changeColor("magenta");
            pillar1.makeVisible();
            
            pillar2.moveHorizontal(-125);
            pillar2.moveVertical(210);
            pillar2.changeSize(300);
            pillar2.changeColor("white");
            pillar2.makeVisible();
                                  
            pedestal.moveHorizontal(-200);
            pedestal.moveVertical(375);
            pedestal.changeSize(130);
            pedestal.changeColor("red");
            pedestal.makeVisible();
            
            targetball1.changeColor("yellow");
            targetball1.moveHorizontal(-72);
            targetball1.moveVertical(215);
            targetball1.changeSize(25);
            targetball1.makeVisible();
            
            riffle1.changeColor("red");
            riffle1.moveHorizontal(260);
            riffle1.moveVertical(195);
            riffle1.changeSize(200);
            riffle1.makeVisible();
            
            riffle2.changeColor("white");
            riffle2.moveHorizontal(260);
            riffle2.moveVertical(208);
            riffle2.changeSize(200);
            riffle2.makeVisible();
            
            bullet.changeColor("black");
            bullet.moveHorizontal(330);
            bullet.moveVertical(225);
            bullet.changeSize(10);
            bullet.makeVisible();
            bullet.slowMoveHorizontal(-200);
            
            man.changeColor("blue");
            man.changeSize(400,100);
            man.moveHorizontal(400);
            man.moveVertical(75);
            man.makeVisible();
            
            shoe1.moveHorizontal(315);
            shoe1.moveVertical(420);
            shoe1.changeSize(30);
            shoe1.changeColor("magenta");
            shoe1.makeVisible();
            
            shoe2.moveHorizontal(395);
            shoe2.moveVertical(420);
            shoe2.changeSize(30);
            shoe2.changeColor("magenta");
            shoe2.makeVisible();
             
            cap.changeSize(60,60);
            cap.moveHorizontal(469);
            cap.moveVertical(-10);
            cap.changeColor("magenta");
            cap.makeVisible();   
            
            grass.moveHorizontal(-400);
            grass.moveVertical(430);
            grass.changeSize(1000);
            grass.changeColor("green");
            grass.makeVisible();
            
            shrubs1.changeSize(150,50);
            shrubs1.moveHorizontal(600);
            shrubs1.moveVertical(300);
            shrubs1.changeColor("green");
            shrubs1.makeVisible();     
        
            shrubs2.changeSize(150,50);
            shrubs2.moveHorizontal(640);
            shrubs2.moveVertical(300);
            shrubs2.changeColor("green");
            shrubs2.makeVisible();
                                    
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        pillar1.changeColor("black");
        pillar2.changeColor("white");
        pedestal.changeColor("black");
        targetball1.changeColor("black");
        riffle1.changeColor ("black");
        riffle2.changeColor ("white");
        bullet.changeColor ("black");
        man.changeColor ("black");
        shoe1.changeColor ("black");
        shoe2.changeColor ("black");
        cap.changeColor ("black");
        grass.changeColor("black");
        shrubs1.changeColor("black");
        shrubs2.changeColor("black");
        
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        pillar1.changeColor("yellow");
        pillar2.changeColor("white");
        pedestal.changeColor("magenta");
        targetball1.changeColor("red");
        riffle1.changeColor ("black");
        riffle2.changeColor ("white");
        bullet.changeColor ("magenta");
        man.changeColor ("black");
        shoe1.changeColor ("red");
        shoe2.changeColor ("red");
        cap.changeColor ("red");
        grass.changeColor("green");
        shrubs1.changeColor("green");
        shrubs2.changeColor("green");
    }
}
