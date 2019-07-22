package PayRoll;

public class Employee {
	protected String emp_name;
	protected long empid;
	protected String address;
	protected String mailid;
	protected long mobileno;
	
public Employee()
{
	emp_name="noname";
	empid=10001;
	address="not given";
	mailid="not given";
	mobileno=1234567890;
}
public Employee(String n,long id,String ad,String mail,long mo)
{
	emp_name=n;
	empid=id;
	address=ad; 
	mailid=mail;
	mobileno=mo;
}

public void printEmployee()
{
	System.out.println("Name:"+emp_name);
	System.out.println("Account ID:"+empid);
	System.out.println("Address:"+address);
	System.out.println("EMail:"+mailid);
	System.out.println("Mobile:"+mobileno);
}

}
