/*
 * paymentslip
 * developed by aharish.m
 * aharish.m1999@gmail.com
 */


package payroll;

import java.util.Scanner;

public class Employee {
	protected String emp_name;
	protected long emp_id;
	protected String address;
	protected String mail_id;
	protected long mobile_no;
public Employee()
{
	emp_name="no name";
	emp_id=10001;
	address="not given";
	mobile_no=80001;		
}
public Employee(String n,long id,String ad,String mail,long mo)
{
	emp_name=n;
	emp_id=id;
	address=ad;
	mail_id=mail;
	mobile_no=mo;
}
public void read()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the employee id:");
	emp_id=sc.nextInt();
	System.out.println("enter the employee name:");
	emp_name=sc.next();
	System.out.println("enter the mail id:");
	mail_id=sc.next();
	System.out.println("enter the mobile no:");
	mobile_no=sc.nextInt();
	System.out.println("enter the address:");
	address=sc.next();
}
public void printaccount()
{
System.out.println("name:"+emp_name);
System.out.println("account id:"+emp_id);
System.out.println("address:"+address);
System.out.println("+mail:"+mail_id);
System.out.println("mobile:"+mobile_no);
				
}
}
