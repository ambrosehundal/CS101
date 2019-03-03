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
  float xcord;
  float ycord;
  float angle;
  float magnitude;
            

  // Constructors

  // The default constructor should create a new Vector with no magnitude.
  public Vector() {
    xcord = 0;
    ycord = 0;
    angle = 0.0;
  }

  // This constructor takes an x and a y coordinate for the Vector.
  public Vector(float x, float y) {
      xcord = x;
      ycord = y;                  
  }

  // This "constructor" takes an angle and a magnitude for the Vector.
  // It is not a traditional constructor because only one function can have
  //   the signature Vector(float, float).
  public static Vector polarVector(float angle, float magnitude) {
      //
  }



  // Access functions

  /** getX
   *  Returns the x coordinate of the Vector.
   */
  public float getX() {
      return xcord;
  }

  /** getY
   *  Returns the y coordinate of the Vector.
   */
  public float getY() {
      return ycord;
  }

  /** getAngle
   *  Returns the angle of the Vector.
   */
  public float getAngle() {
      return angle;
  }

  /** getMagnitude
   *  Returns the magnitude of the Vector.
   */
  public float getMagnitude() {
      return magnitude;
  }

  /** add
   *  Returns the sum of this Vector with the given Vector.
   */
  public Vector add(Vector other) {
      Vector v = new Vector();
      v.xcord = xcord + other.xcord;
      v.ycord = ycord + other.ycord;

      return v;
  }

  /** subtract
   *  Returns the difference between this Vector and the given Vector.
   */
  public Vector subtract(Vector other) {
    Vector v = new Vector();
    v.xcord = xcord - other.xcord;
    v.ycord = ycord - other.ycord;

    return v;
                
  }

  /** dotProduct
   *  Returns the dot product of this Vector and the given Vector.
   */
  public float dotProduct(Vector other) {
                ...
  }

  /** scalarMultiply
   *  Returns this Vector scaled by the given scalar.
   */
  public Vector scalarMultiply(float scalar) {
                ...
  }

  /** normalize
   *  Returns the normalized version of this Vector, a Vector with the same
   *    angle with magnitude 1.
   */
  public Vector normalize() {
                ...
  }



  // Manipulation functions
  // None.  Vectors are immutable.

}
