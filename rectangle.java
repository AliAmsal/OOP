
package Rectangle;

class Rectangle
{
    double width;
    double height;
    public Rectangle()
    {
        width = 1;
        height = 1;
    }
    public Rectangle(double x, double y)
    {
        width = x;
        height = y;
    }
    public double getArea()
    {
        return width*height;
    }
     public double getPerimeter()
    {
        return (width + height)*2;
    }
    @Override
     public String toString()
     {
        return "The Width of the Rectangle is " + width + " The Height of the Rectangle is " + height;
     }
            
                
            
}


public class rectangle {

    
    public static void main(String[] args) {
        Rectangle a = new Rectangle(4,40);
        System.out.println(a.toString());
        System.out.println(a.getArea());
        System.out.println(a.getPerimeter());
        Rectangle b = new Rectangle(3.5,35.9);
        System.out.println(b.toString());
        System.out.println(b.getArea());
        System.out.println(b.getPerimeter());
    }
    
}
