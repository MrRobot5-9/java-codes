import java.util.*;
class Details
{
int acc_id;
float balance;
String name;
Details(int acc_id,float balance,String name)
{
this.acc_id = acc_id;
this.balance = balance;
this.name = name;
}
public void display()
{
System.out.println("Account ID: " + acc_id);
System.out.println("Balance: " + balance);
System.out.println("Name: " + name);
}
}
public class practicalcodes
{
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter the number of records: ");
int n = sc.nextInt();
Details [] arr = new Details [n+10];
System.out.println("Enter the details: ");
for (int i = 0; i < n; i++)
{
System.out.println("Account ID: ");
int ac_id = sc.nextInt();
System.out.println("Balance: ");
float bal = sc.nextFloat();
System.out.println("Name: ");
String name = sc.next();
arr[i] = new Details(ac_id, bal, name);
}
int temp = 0;
System.out.println("\n");
while(true)
{
System.out.println("Enter options: \n 1.Display \n2.Add account \n3.Delete account \n4.Exit\n");
int opt = sc.nextInt();
switch(opt)
{
case 1:
{
for (int ii = 0; ii < n + temp; ii++)
{
arr[ii].display();
System.out.println("\n");
}
break;
}
case 2:
{
System.out.println("Enter details: ");
System.out.println("Account ID: ");
int ac_id = sc.nextInt();
System.out.println("Balance: ");
float bal = sc.nextFloat();
System.out.println("Name: ");
String name = sc.next();
arr[n + temp] = new Details(ac_id, bal, name);
temp++;
break;
}
case 3:
{
System.out.println("Enter id of person to be deleted: ");
int del_id = sc.nextInt();
int j;
for (j = 0; j < n+temp; j++)
{
if (arr[j].acc_id==del_id)
{
break;
}
}
for (int k=j;k<n+temp+1;k++)
{
arr[k] = arr[k+1];
}
System.out.println("The account has been deleted");
break;
}
}
if (opt == 4)
{
break;
}
}
}
}
