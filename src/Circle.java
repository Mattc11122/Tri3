/*
Matthew Cole
3/21/19
finds area and perimeter/circumference with radius using accessors mutators and constructors
 */
public class Circle
{
    private int radius;
    public int getradius()
    {
        return radius;
    }
    public void setRadius(int newRadius)
    {
        radius=newRadius;
    }
     public double areas()
     {
        double areas=radius*radius*3.14159265359;
        return areas;
     }
     public double perimeter()
     {
         double perimeter=3.14159265359*2*radius;
         return perimeter;
     }
    public String toString() {
        return "the radius is: "+radius+" and the area of the circle is: "+areas()+" and the perimeter/circumference is: "+perimeter();
    }
    public boolean equals(Object o)
    {
        if (o instanceof Circle)
        {
            System.out.println("object is a Circle object type.");
            return true;
        }
        else return false;
    }
}
