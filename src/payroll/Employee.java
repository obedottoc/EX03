/*
 * Program to represent Employee
 * By Faizul
 * faizulsmart10@gmail.com
*/

package payroll;

public class Employee {

	protected String employee_name;
	protected long employee_id;
	protected String address;
	protected long mobile_no;
	protected String mail_id;
	
	public Employee()
	{
		employee_name="no name";
		employee_id=5001;
		address="not given";
		mail_id="not given";
		mobile_no=2122;
		
	}
	
	public Employee(String n,long id,String add,String mail,long num)
	{
		employee_name=n;
		employee_id=id;
		address=add;
		mail_id=mail;
		mobile_no=num;
	}
	
	public void printAccount()
	
	{
		System.out.println("Name:"+employee_name);
		System.out.println("Account Id:"+employee_id);
		System.out.println("Address:"+address);
		System.out.println("Email:"+mail_id);
		System.out.println("Mobile:"+mobile_no);
	}
}
		
		
	
	
	
	
	
