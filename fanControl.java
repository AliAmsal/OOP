
package fanControl;

/**
 *
 * @author AliAmsal
 */

class fan
{
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;
    
    public fan()
    {
        speed = SLOW;
        on = false;
        radius = 5;
        color = "blue";
    }
    
    public fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;  
    }
    public void setSpeed(int speed)
    {
        this.speed = speed;
    }
     public void turnOn()
    {
        on = true;
    }
     public void turnOff()
    {
        on = false;
    }
      public void setRadius(double radius)
    {
        this.radius = radius;
    }
       public void setColor(String color)
    {
        this.color = color;
    }
       public int getSpeed()
       {
           return speed;
       }
       public boolean getStatus()
       {
           return on;
       }
       public double getRadius()
       {
           return radius;
       }
       public String getColor()
       {
           return color;
       }
    @Override
       public String toString()
       {
           if(on)
               return "Speed: " + speed + " Color: " + color + " Radius: " + radius;
           else
               return "Color: " + color + " Radius: " + radius + " fan is off";
       }
}
public class fanControl {

    
    public static void main(String[] args) {
        fan f1 = new fan(3,true,10,"Yellow");
        fan f2 = new fan(2,false,5,"blue");
        System.out.println(f1.toString());
        System.out.println(f2.toString());
    }
    
}
