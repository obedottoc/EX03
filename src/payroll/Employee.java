package payroll;

public class Employee {
	protected String Emp_name;
	protected long Emp_id;
	protected String address;
	protected String mail_id;
	protected long mobile_no;
	public Employee()
	{
		Emp_name="bairavan";
		Emp_id=10000;
		address="not given";
		mail_id="not given";
		mobile_no=890000001;
	}
	
	public Employee(String n,long id,String ad,String mail,long mo)
	{
		Emp_name=n;
		Emp_id=id;
		address=ad;
		mail_id=mail;
		mobile_no=mo;
	}
	public void printaccount()
	{
		System.out.println("name:"+Emp_name);
		System.out.println("Account id:"+Emp_id);
		System.out.println("address:"+mail_id);
		System.out.println("mobile:"+mobile_no);
	}

}
