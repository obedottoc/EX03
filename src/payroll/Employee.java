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
		emp_id=21221;
		address="not given";
		mail_id="not given";
		mobile_no=8700554477l;
	}
	public Employee(String name,long id,String add,String mail,long mobile)
	{
		emp_name=name;
		emp_id=id;
		address=add;
		mail_id=mail;
		mobile_no=mobile;
	}
	public void printEmployee()
	{
		System.out.println("Name:" +emp_name);
		System.out.println("emp_id:" +emp_id);
		System.out.println("Address:" +address);
		System.out.println("EMail:" +mail_id);
		System.out.println("Mobile:" +mobile_no);
	}	
}
