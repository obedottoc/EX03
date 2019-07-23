package payroll;

public class Employee {
	protected String Emp_name;
	protected long Emp_id;
	protected String address;
	protected String mail_id;
	protected long mobile_no;
	
	public Employee()
	{
	Emp_name="agnal";
	Emp_id=1500125;
	address="not given";
	mail_id="not given";
	mobile_no=8377392839l;
	}
	public Employee(String n,long id,String ad,String mail,long num)
	{
		Emp_name=n;
		Emp_id=id;
		address=ad;
		mail_id=mail;
		mobile_no=num;
	}
	
    public void printEmployee()
    {
    System.out.println("name:"+Emp_name);
    System.out.println("Emp_id:"+Emp_id);
    System.out.println("address:"+address);
    System.out.println("mail_id:"+mail_id);
    System.out.println("mobile_no:"+mobile_no);
    
    }
}