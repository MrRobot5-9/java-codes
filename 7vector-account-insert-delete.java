import java.util.*;
class Employee {
public String E_Name;
public int E_Id;
public double E_Salary;
Employee(String name, int id, double salary)
{
E_Name=name;
E_Id=id;
E_Salary=salary;
}
}
class sortBySalary implements Comparator<Employee>
{
public int compare(Employee a, Employee b)
{
if(a.E_Salary>b.E_Salary) return 1;
else if(a.E_Salary<b.E_Salary) return -1;
else return 0;
}
}
public class practicalcodes {
public static void main(String[] args)
{
int choice,n,e_id;
String e_name;
Double e_salary;
Scanner s1=new Scanner(System.in);
Vector<Employee> Emp=new Vector<Employee>();
System.out.println("**Main Menu**");
while(true)
{
System.out.println("1. Create employee records.");
System.out.println("2. Insert employee record according to their salary.");
System.out.println("3. Delete employee record according to name.");
System.out.println("4. Delete employee record according to id.");
System.out.println("5. Display the list.");
System.out.println("6. Exit.");
System.out.println("Enter your choice:");
choice=s1.nextInt();
switch(choice)
{
case 1:
System.out.println("Enter the total number of employee records you want to add:");
n=s1.nextInt();
for(int i=0;i<n;i++)
{
System.out.println("Details of employee "+(i+1)+":");
System.out.println("Enter id of the employee:");
e_id=s1.nextInt(); System.out.println("Enter employee name:");
e_name=s1.next();
System.out.println("Enter salary of the employee:");
e_salary=s1.nextDouble();
Emp.addElement(new Employee(e_name,e_id,e_salary));
}
Emp.sort(new sortBySalary());
break;
case 2:
System.out.println("Enter id of the employee:");
e_id=s1.nextInt();
System.out.println("Enter employee name:");
e_name=s1.next();
System.out.println("Enter salary of the employee:");
e_salary=s1.nextDouble();
for(int i=0;i<Emp.size();i++)
{
if(Emp.get(i).E_Salary>e_salary)
{
Emp.add(i,new Employee(e_name,e_id,e_salary));
break;
}
}
break;
case 3:
int a=0;
System.out.println("Enter the name of the Employee whose record you want to delete:");
e_name=s1.next();
for(int i=0;i<Emp.size();i++)
{
if(e_name.equals(Emp.get(i).E_Name))
{
Emp.remove(i);
a++;
break;
}
}
if(a==0)
System.out.println("Employee name not found.");
break;
case 4:
int b=0;
System.out.println("Enter the id of the Employee whose record you want to delete:");
e_id=s1.nextInt();
for(int i=0;i<Emp.size();i++)
{
if(e_id==(Emp.get(i).E_Id))
{
Emp.remove(i); b++;
break;
}
}
if(b==0)
System.out.println("Employee ID not found");
break; case 5:
for(int i=0;i<Emp.size();i++)
{
System.out.println("Employee "+(i+1)+":");
System.out.println("Name:"+Emp.get(i).E_Name);
System.out.println("ID:"+Emp.get(i).E_Id);
System.out.println("Salary:"+Emp.get(i).E_Salary);
}
break;
case 6:
System.out.println("EXIT"); System.exit(0);
}
}
}
}
