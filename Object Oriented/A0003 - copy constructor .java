/* constructor
 * Copy constructor
 */

public class A0003 {
  public class Point {
    int x, y;

    // Copy constructor
    public Point(Point otherPoint) {
      this.x = otherPoint.x;
      this.y = otherPoint.y;
    }
  }
}
