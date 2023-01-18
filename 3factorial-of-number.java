import java.util.*;
import java.io.*;
public class practicalcodes {
static int factorial(int n)
{
if (n == 0 || n == 1)
return 1;
return n * factorial(n - 1);
}
public static void main(String[] args)
{
int n;
System.out.println("Enter a number to calculate factorial: ");
Scanner sc = new Scanner(System.in);
n = sc.nextInt();
int ans = factorial(n);
System.out.println("Factorial of " + n + ": " + ans);
}
}
