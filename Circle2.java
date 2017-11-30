public class Circle2 extends Circle
{

public Circle2(double x, double y, double radius)
{
	//incorrect code
    //super(y,x,radius);
	
	//correct modified code
	super(x,y,radius);
}

public boolean intersects(Circle other)
{
   double d;
   
   //incorrect calculations
   /*d = Math.sqrt(Math.pow(center.x - other.center.x, 2) + 
                 Math.pow(center.y - other.center.y, 2));
   if (d < radius)
      return true;
   else
      return false;*/
	
	//correct code
	d = Math.pow(center.x - other.center.x, 2) +  Math.pow(center.y - other.center.y, 2);
    if (d <= Math.pow(radius + other.radius, 2))
    	return true;
    else
    	return false;
}

}
