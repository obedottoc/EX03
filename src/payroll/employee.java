
package payroll;
/***
 * vishnu payroll
 * @guntikavishnu@gmail.com
 *
 */

public class employee {
	protected String emp_name;
	protected long emp_id;
	protected String address;
	protected String mail_id;
	protected long mobile_no;
	
public employee()
{
	emp_name="name";
	emp_id=12345;
	address="not given";
	mail_id="not given";
	mobile_no=123546;
	
}
public employee(String n,long id,String add,String mail,long mob)
{
	emp_name=n;
	emp_id=id;
	address=add;
	mail_id=mail;
	mobile_no=mob;
	
	
}
public void printAccount()
{
	System.out.println("Name of the employee");
	System.out.println("employee id:");
	System.out.println("mail_id of employee");
	System.out.println("Address:");
	System.out.println("mobile_no of the employee:");
}

	
	
}



