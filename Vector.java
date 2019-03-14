// Vector.java
// A class that implements the Vector ADT.
//
// For this assignment, you must complete this code skeleton.
// You may not change the function prototypes.
// You are expected to fill in the functions to make them work
// as expected, and you can add as much as you need or want.
// We recommend implementing the Vector ADT using x and y coordinates.

// Notes:
// Angles are always in radians, not degrees.

class Vector {

  // Fields
  float xcord = 0;
  float ycord = 0;
  float angle_radians = 0;
  float v_magnitude = 0;
            

  // Constructors

  // The default constructor should create a new Vector with no magnitude.
  public Vector() {
    this.v_magnitude = 0;
  }

  // This constructor takes an x and a y coordinate for the Vector.
  public Vector(float x, float y) {
      this.xcord = x;
      this.ycord = y;                 
  }

  // This "constructor" takes an angle and a magnitude for the Vector.
  // It is not a traditional constructor because only one function can have
  //   the signature Vector(float, float).
  public static Vector polarVector(float angle, float magnitude) {
      Vector v = new Vector();
      v.angle_radians = angle;
      v.v_magnitude = magnitude;
      return v;
     
  }



  // Access functions

  /** getX
   *  Returns the x coordinate of the Vector.
   */
  public float getX() {
      return this.xcord;
  }

  /** getY
   *  Returns the y coordinate of the Vector.
   */
  public float getY() {
      return this.ycord;
  }


  /** getAngle
   *  Returns the angle of the Vector.
   */
  public float getAngle() {
     return this.angle_radians;
  }

  /** getMagnitude
   *  Returns the magnitude of the Vector.
   */
  public float getMagnitude() {
      return this.v_magnitude;
  }

  /** add
   *  Returns the sum of this Vector with the given Vector.
   */
  public Vector add(Vector other) {
      Vector v = new Vector();
      v.xcord = this.xcord + other.xcord;
      v.ycord = this.ycord + other.ycord;

      return v;
  }

  /** subtract
   *  Returns the difference between this Vector and the given Vector.
   */
  public Vector subtract(Vector other) {
    Vector v = new Vector();
    v.xcord = this.xcord - other.xcord;
    v.ycord = this.ycord - other.ycord;

    return v;
                
  }

  /** dotProduct
   *  Returns the dot product of this Vector and the given Vector.
   */
  public float dotProduct(Vector other) {
        return (this.xcord * other.xcord + this.ycord * other.ycord); 
  }

  /** scalarMultiply
   *  Returns this Vector scaled by the given scalar.
   */
  public Vector scalarMultiply(float scalar) {
        this.xcord = this.xcord * scalar;
        this.ycord = this.ycord * scalar;

        return this;

  }

  /** normalize
   *  Returns the normalized version of this Vector, a Vector with the same
   *    angle with magnitude 1.
   */
  public Vector normalize() {
        this.v_magnitude = 1;

        return this;
  }



  // Manipulation functions
  // None.  Vectors are immutable.

  public static void main(String[] args){
    
     


      //testing for default constructor
      Vector v1 = new Vector();
      Vector v2 = new Vector();


      //testing for constructor with x and y coordinates
      float x = 3;
      float y = 5;
      float x1 = 23;
      float y1 = 19;
      Vector v3 = new Vector(x, y);
      System.out.println("X is " + v3.xcord + "Y is " + v3.ycord);
      Vector v4 = new Vector(y, x);
      System.out.println("X is " + v4.xcord + "Y is " + v4.ycord);


      //polarVector constructor with angle and magnitude
      float angles = 129;
      float a1 = 12;
      float mag = 1;
      
      polarVector(angles, mag);
      polarVector(1, mag);

      //testing for get(X)
        v3.getX();
        v4.getX();
        System.out.println("X is " + v3.xcord);
        System.out.println("X is " + v4.xcord);


      //testing for get(Y)
        v3.getY();
        v4.getY();
        System.out.println("Y is " + v3.xcord);
        System.out.println("Y is " + v4.xcord);

      //testing for getAngle
        v3.getAngle();
        v4.getAngle();
        System.out.println("Angle is " + v3.angle_radians);
        System.out.println("Angle " + v4.angle_radians);

      //testing for getMagnitude
       v4.getMagnitude();
       v3.getMagnitude();
       System.out.println("Magnitude is " + v3.v_magnitude);
       System.out.println("Magnitude " + v4.v_magnitude);

       //add vectors testing
       v3.add(v4);
       System.out.println("X is " + v3.xcord + "Y is " + v3.ycord);
       v4.add(v3);
       System.out.println("X is " + v4.xcord + "Y is " + v4.ycord);



       //subtract vectors testing
       v3.subtract(v4);
       System.out.println("X is " + v3.xcord + "Y is " + v3.ycord);
       v4.subtract(v3);
       System.out.println("X is " + v4.xcord + "Y is " + v4.ycord);

       //dot product testing
        Vector v5 = new Vector(x1,  y1);
        Vector v6 = new Vector(y1, y1);

        v5.dotProduct(v6);
        v6.dotProduct(v5);

        System.out.println("X is " + v5.xcord + "Y is " + v5.ycord);
        System.out.println("X is " + v6.xcord + "Y is " + v6.ycord);


        //scalar multiply testing
        float s1 = 4;
        float s2 = 8;
        v5.scalarMultiply(s1);
        v6.scalarMultiply(s2);

        System.out.println("X is " + v5.xcord + "Y is " + v5.ycord);
        System.out.println("X is " + v6.xcord + "Y is " + v6.ycord);

        //normalize the vector testing
        v5.normalize();
        v6.normalize();
        System.out.println("X is " + v5.xcord + "Y is " + v5.ycord);
        System.out.println("X is " + v6.xcord + "Y is " + v6.ycord);










  }

}


