import java.util.Scanner;
public class practicalcodes {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter radius of circle: ");
double radius = sc.nextDouble();
Circle circle = new Circle(radius);
System.out.println("Area of circle: " + circle.getArea());
System.out.println("Circumference of circle: " +
circle.getCircumference());
}
}
class Circle {
private double radius;
public Circle(double radius) {
this.radius = radius;
}
public double getArea() {
return Math.PI * Math.pow(radius, 2);
}
public double getCircumference() {
return 2 * Math.PI * radius;
}
}
