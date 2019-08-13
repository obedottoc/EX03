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
		emp_id=1234;
		address="not given";
		mail_id="not given";
		mobile_no=123456;
		
	}
	public Employee(String n,long id,String add,String mail,long num)
	{
		emp_name=n;
		emp_id=id;
		address=add;
		mail_id=mail;
		mobile_no=num;
		
	}
	public void printAccount()
	{
		
		System.out.println("name of the employee:"+emp_name);
		System.out.println("employeeId:"+emp_id);
		System.out.println("mail id of employee:"+mail_id);
		System.out.println("Address"+address);
		System.out.println("mobile no.of the employee"+mobile_no);
	}

}
