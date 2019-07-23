/**JAVA program to calculate Salary 
 * author @AKHSHY_GANESH
 * reg no: 212217105006
 * mail ID: akhshyganeshb@gmail.com
 */
package Payroll;

public class Employee {
	protected String emp_name;
	protected long emp_id;
	protected String address;
	protected String mail_id;
	protected long mobile_no;
	public Employee()
	{
		emp_name="no name";
		emp_id=1051;
		address="unknown";
		mail_id= "unknown";
		mobile_no= 9512364;
	}
	public Employee(String n,long id,String adr,String mail,long no)
	{
		emp_name=n;
		emp_id=id;
		address=adr;
		mail_id=mail;
		mobile_no=no;
	}
	public void printEmployee()
	{
		System.out.println("Name:"+emp_name);
		System.out.println("Account:"+emp_id);
		System.out.println("Addess:"+address);
		System.out.println("Email:"+mail_id);
		System.out.println("Mobile:"+mobile_no);
	}

}
