public class LessonA {

  public static void main(String[] args) {
    Rectangle r = new Rectangle(7, 5.0);
    System.out.println("Hello " + calcArea(r));
  }

  public static double calcArea(Rectangle r) {
    return r.a * r.b;
  }
}  