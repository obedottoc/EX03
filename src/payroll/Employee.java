package payroll;

public class Employee {
	protected String employeename;
	protected long employee_id;
	protected String address;
	protected String mail_id;
	protected long mobile_no;

	public Employee()
	{
	employeename="noname";
	employee_id=700001;
	address="not given";
	mail_id="not given";
	mobile_no=96000001;
	}
	public Employee(String n,long id,String ad,String mail,long mo)
	{
	employeename=n;
	employee_id=id;
	address=ad;
	mail_id=mail;
	mobile_no=mo;
	}
	public void printEmployee()
	{
	System.out.println("Name:"+employeename);
	System.out.println("Account ID:"+employee_id);
	System.out.println("Address:"+address);
	System.out.println("EMail:"+mail_id);
	System.out.println("Mobile:"+mobile_no);
	

	}
	
}
