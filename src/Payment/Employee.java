/****
 *Developed By Avinash Raja
 *Reg n0:212217105009
 *exp n0:1
 *EEE-A
 */
package Payment;

public class Employee {
	public String emp_name;
	private long emp_id;
	protected String address;
	public String mail_id;
	protected long mobile_no;
	
	public Employee()
{
	emp_name="lokesh";
	emp_id=10031;
	address="not given";
	mail_id="not given";
	mobile_no=9841127485l;
}
public Employee(String n,long id,String ad,String mail,long num)
{
	emp_name=n;
	emp_id=id;
	address=ad;
	mail_id=mail;
	mobile_no=num;
}
public void printEmployee()
{
	System.out.println("Name:"+emp_name);
	System.out.println("ID:"+emp_id);
	System.out.println("Address:"+address);
	System.out.println("Email:"+mail_id);
	System.out.println("Mobile:"+mobile_no);
}
}
