/*********
 * Program to represent payroll
 * Developed by
 * R.Neha
 * rasapallenehareddy@gmail.com
 */
package payroll;

public class Employee {
	protected String Employee_name;
	protected long Employee_id;
	protected String address; 
	protected String mail_id;
	protected long mobile_no;
	
	public Employee()
	{
		Employee_name="noname";
		Employee_id=100001;
		address="not given"; 
		mail_id="not given";
		mobile_no=80000001;
	}
	
	public Employee(String n,long id,String ad,String mail,long mo)
	{
		Employee_name=n;
		Employee_id=id;
		address=ad; 
		mail_id=mail;
		mobile_no=mo;
	}
	
	public void printAccount()
	{
		System.out.println("Name:"+Employee_name);
		System.out.println("Account ID:"+Employee_id);
		System.out.println("Address:"+address);
		System.out.println("EMail:"+mail_id);
		System.out.println("Mobile:"+mobile_no);
	}
	
}
