/***
* Example JUnit testing class for Circle2 (and Circle)
*
* - must have your classpath set to include the JUnit jarfiles
* - to run the test do:
*     java org.junit.runner.JUnitCore Circle2Test
* - note that the commented out main is another way to run tests
* - note that normally you would not have print statements in
*   a JUnit testing class; they are here just so you see what is
*   happening. You should not have them in your test cases.
***/

import org.junit.*;

public class Circle2Test
{
   // Data you need for each test case
   private Circle2 circle1;
   private Circle2 circle2, circle3, circle4; //added for test cases

// 
// Stuff you want to do before each test case
//
@Before
public void setup()
{
   System.out.println("\nTest starting...");
   circle1 = new Circle2(1,2,3);

   //new circles initialized with different values
   circle2 = new Circle2(7,7,8);
   circle3 = new Circle2(0,0,1);
   circle4 = new Circle2(0,2,1);
}



//Testing constructors
@Test
public void ConsTest()
{
System.out.println("Running test ConsTest.");

double x1,y1,r1,x2,y2,r2,x3,y3,r3;

x1 = circle1.center.x;
y1 = circle1.center.y;
r1 = circle1.radius;

x2 = circle2.center.x;
y2 = circle2.center.y;
r2 = circle2.radius;

x3 = circle3.center.x;
y3 = circle3.center.y;
r3 = circle3.radius;

Assert.assertTrue(x1 == 1 && y1 == 2 && r1 == 3 && x2 == 7 && y2 == 7 && r2 == 8 && x3 == 0 && y3 == 0 && r3 == 1);
}



//
// Stuff you want to do after each test case
//
@After
public void teardown()
{
   System.out.println("\nTest finished.");
}

//
// Test a simple positive move
//
@Test
public void simpleMove()
{
   Point p;
   System.out.println("Running test simpleMove.");
   p = circle1.moveBy(1,1);
   Assert.assertTrue(p.x == 2 && p.y == 3);
}


// Testing move method (2)
@Test
public void secMove()
{
   Point p;
   System.out.println("Running test secMove.");
   p = circle1.moveBy(25,11);
   Assert.assertTrue(p.x == 26 && p.y == 13);
}


// 
// Test a simple negative move
//
@Test
public void simpleMoveNeg()
{
   Point p;
   System.out.println("Running test simpleMoveNeg.");
   p = circle1.moveBy(-1,-1);
   Assert.assertTrue(p.x == 0 && p.y == 1);
}

// Testing move method, also negative
@Test
public void negMove()
{
   Point p;
   System.out.println("Running test negMove.");
   p = circle1.moveBy(-3,-9);
   Assert.assertTrue(p.x == -2 && p.y == -7);
}

//Testing scaling method
@Test
public void scaleTest()
{
   System.out.println("Running test scaleTest().");
   double x = circle1.scale(10);
   Assert.assertTrue(x==30); //result should be 30
}

//Testing scaling method using negative numbers
@Test
public void scaleNeg()
{
   System.out.println("Running test scaleNeg().");
   double x = circle1.scale(-5);
   Assert.assertTrue(x==-15); //result should be -15
}


//Testing intersects method
@Test
public void intersect()
{
   System.out.println("Running test intersect().");
   
  Assert.assertTrue(circle1.intersects(circle2)==true); //
}

//Testing intersects method (2)
@Test
public void intersect2()
{
   System.out.println("Running test intersect2().");
   Assert.assertTrue(circle3.intersects(circle4)==true); //
}


/*** NOT USED
public static void main(String args[])
{
   try {
      org.junit.runner.JUnitCore.runClasses(
               java.lang.Class.forName("Circle2Test"));
   } catch (Exception e) {
      System.out.println("Exception: " + e);
   }
}
***/

}
