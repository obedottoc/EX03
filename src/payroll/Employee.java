/*developed by: Sanjai Kumar
 * gsanjaik@gmail.com
 */
package payroll;

public class Employee {
	protected String empname;
	protected long empid;
	protected String address;
	protected String mailid;
	protected long mobileno;
	
	public Employee()
	{	empname="no name";
		empid=100001;
		address="not given";
		mailid="not given";
		mobileno=800000001;
	}
	public Employee(String n,long id,String ad,String mail,long mn)
	{	empname=n;
		empid=id;
		address=ad;
		mailid=mail;
		mobileno=mn;
	}
	public void printEmployee()
	{	System.out.println("Name: "+empname);
		System.out.println("Account: "+empid);
		System.out.println("Address: "+address);
		System.out.println("Email: "+mailid);
		System.out.println("Mobile: "+mobileno);
	}
}					
