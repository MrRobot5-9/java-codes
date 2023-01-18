import java.util.Scanner;
public class practicalcodes {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter value of x: ");
int x = sc.nextInt();
System.out.print("Enter value of n: ");
int n = sc.nextInt();
double result1 = 0;
for (int i = 0; i <= n; i++) {
result1 += (Math.pow(x, i) / MyMath.fact(i));
}
System.out.println("Result of series (1 + x)^n: " + result1);
double result2 = 0;
for (int i = 0; i <= n; i++) {
result2 += ((MyMath.fact(n) * Math.pow(x, i)) /
(MyMath.fact(n - i) * MyMath.fact(i)));
}
System.out.println("Result of series e^x: " + result2);
}
}
class MyMath {
public static long fact(int x) {
long result = 1;
for (int i = 1; i <= x; i++) {
result *= i;
}
return result;
}
}
