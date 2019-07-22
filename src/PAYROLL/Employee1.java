package PAYROLL;

public class Employee1 {
	protected String emp_name;
	protected long emp_id;
	protected String address; 
	protected String mail_id;
	protected long mobile_no;
	
    public Employee1()
    {	
	    emp_name = "no name";
	    emp_id = 123123;
		address = "not given"; 
		mail_id="not given";
		mobile_no=91637543;
    }	
	
public Employee1(String n,long id,String ad,String mail,long num)
{	    
	    emp_name = n;
		emp_id = id;
		address=ad; 
		mail_id=mail;
		mobile_no=num;
}	

	
	
	public void printaccount()
	{
		System.out.println("Name of the employee:"+emp_name);
		System.out.println("Employee ID:"+emp_id);
		System.out.println("Address:"+address);
		System.out.println("EMail:"+mail_id);
		System.out.println("Mobile:"+mobile_no);
	}
	
}