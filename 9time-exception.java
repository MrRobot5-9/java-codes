import java.util.*;
class TimeException extends Exception{
public String toString(){
return "Time Exception : Seconds is greater than 59 ";
}
}
public class practicalcodes {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the minutes");
int m;
m=sc.nextInt();
System.out.println("Enter the seconds");
int s;
s=sc.nextInt();
sc.close();
TimeException b=new TimeException();
try{
if(s>59){
throw b;
}
}
catch(TimeException a){
System.out.println("\n "+a);
}
}
}
