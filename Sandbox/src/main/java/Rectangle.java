public class Rectangle {
  public double a;
  public double b;

  public Rectangle(double a, double b) {
    this.a = a;
    this.b = b;
  }

  public Rectangle(double a) {
    this.a = a;
  }
  private double countArea(Rectangle r){
     return r.a*r.b;
  }

}
