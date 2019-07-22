package Payroll;

public class Employee {
	     protected String emp_name;
	     protected long emp_id;
	     protected String address;
	     protected String mail_id;
	     protected long mobile_no;
	     
	public Employee()    
	{
	emp_name="name";
	emp_id=146723;
	address="not given";
	mail_id="not given";
	mobile_no=748826823;
	}
	public Employee(String n,long id,String add,String mail,long num)
	{
	emp_name=n;
	emp_id=id;
	address=add;
	mail_id=mail;
	mobile_no=num;
	}
	public void printaccount()
	{
	System.out.println("Name of the employee:"+emp_name);
	System.out.println("Employee ID:"+emp_id);
	System.out.println("Address:"+address);
	System.out.println("Mail ID of the employee:"+mail_id);
	System.out.println("Mobile number of the employee:"+mobile_no);
 }
}