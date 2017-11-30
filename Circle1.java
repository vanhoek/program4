
public class Circle1 extends Circle
{

public Circle1(double x, double y, double radius)
{
   super(x,y,radius);
}

public boolean intersects(Circle other)
{
  //entirety of original code is incorrect

  // if (Math.abs(center.x - other.center.x) < radius &&
  // Math.abs(center.y - other.center.y) < radius)
  // return true;
  //   return false;
 


  //correct code to be used for calculation
   if ((Math.abs(center.x - other.center.x) > ( radius  + other.radius)) || (Math.abs(center.y - other.center.y) > ( radius  + other.radius)))
		      return false;
   return true;
}

}
