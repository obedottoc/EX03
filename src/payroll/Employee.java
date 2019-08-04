/*********
 * Program to represent bank account
 * Developed by
 * M.Upendra
 * upendravarma1234@gmail.com
 */
package payroll;

public class Employee {
	protected String emp_name;
	protected long emp_id;
	protected String address; 
	protected String mail_id;
	protected long mobile_no;

	public Employee()
	{
		emp_name="noname";
		emp_id=100001;
		address="not given"; 
		mail_id="not given";
		mobile_no=80000001;
	}

	public Employee(String n,long id,String ad,String mail,long mo)
	{
		emp_name=n;
		emp_id=id;
		address=ad; 
		mail_id=mail;
		mobile_no=mo;
	}

	public void printAccount()
	{
		System.out.println("Name:"+emp_name);
		System.out.println("Employee ID:"+emp_id);
		System.out.println("Address:"+address);
		System.out.println("EMail:"+mail_id);
		System.out.println("Mobile:"+mobile_no);
	}

}
