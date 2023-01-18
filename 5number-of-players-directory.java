import java.util.*;
public class practicalcodes {
public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
System.out.println("Number of Players: ");
int n = sc.nextInt();
int[][] arr = new int[n][100];
int[] m = new int[n];
System.out.println("Number of matches played by player: ");
for(int i=0;i<m.length;i++)
{
m[i] = sc.nextInt();
}
for(int i=0;i<m.length;i++)
{
System.out.println("Number of runs by players "+(i+1)+" : ");
for(int j =0;j<m[i];j++)
{
arr[i][j] = sc.nextInt();
}
}
System.out.println("\nPlayer Details:\n");
for(int i=0;i<m.length;i++)
{
System.out.println("\nPlayer Number: "+(i+1));
System.out.println("Runs Scored: ");
float sum = 0;
for(int j =0;j<m[i];j++)
{
System.out.print(arr[i][j]+" ");
sum = sum + arr[i][j];
}
System.out.println("\nSum of runs scored: "+(sum));
System.out.println("Batting average: "+(sum/m[i]));
}
}
}
