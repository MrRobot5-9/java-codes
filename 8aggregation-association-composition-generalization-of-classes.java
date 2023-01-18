class School{}
class Teacher extends School{
    int ID = 1001;
    private double Salary = 25000;
    String name = "";
    Teacher ()
    {

    }
    Teacher(String n,int id,double sal)
 {
 ID=id;
 Salary=sal;
 name=n;
 }
 Teacher(String n,int id)
 {
 name=n;
 ID=id;
 }
 private void print_Salary()
 {
 System.out.println("\nSalary of the Teacher is "+Salary);
 }
 private void print_name()
 {
 System.out.println("\nName of the Sir is: "+name);
 }
 private void print_ID()
 {
 System.out.println("\nID of the Teacher is: "+ID);
 }public void print_details()
 {
 print_name();
 print_ID();
 print_Salary();
 }
} 
final class Principle extends Teacher {
    int ID=1005;
 private double Salary=40000;
 String name="";
 Principle(String n,double sal)
 {
 Salary=sal;
 name=n;
 }
 private void print_Salary()
 {
 System.out.println("\nSalary of the Principle is "+Salary);
 }
 private void print_name()
 {
 System.out.println("\nName of the Principle is: "+name);
 }
 private void print_ID()
 {
 System.out.println("\nID of the Principle is: "+ID);
 }
 public void print_details()
 {
 print_name();
 print_ID();
 print_Salary();
 }
}
class Students extends School{
    int ID=500;
 private Double Percentage=87.56;
 String name="";
 Students(){}
 Students(String n,int id)
 {
 ID=id;
 name=n;
 }
 Students(String n,int id,double percent)
 {
 ID=id;
 Percentage=percent;
 name=n;}
 private void print_Percentage()
 {
 System.out.println("\nPercentage of the Student is "+Percentage);
 }
 private void print_name()
 {
 System.out.println("\nName of the Student is: "+name);
 }
 private void print_ID()
 {
 System.out.println("\nID of the Student is: "+ID);
 }
 public void print_details()
 {
 print_name();
 print_ID();
 print_Percentage();
 }
}
public class Exp6
{
 public static void main(String[] args)
 {
 Teacher sir1=new Teacher("Nikhil",1001,25000);
 Principle sir2=new Principle("Wasif", 40000);
 Students stnd1=new Students("Rishab",500);
 
 System.out.println("\n");
 sir1.print_details();
 System.out.println("\n");
 sir2.print_details();
 System.out.println("\n");
 stnd1.print_details();
 System.out.println("\n");
 
 }
}
