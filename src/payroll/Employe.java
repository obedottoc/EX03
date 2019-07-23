package payroll;

public class Employe {
	protected String emp_name;
	protected long emp_id;
	protected String address; 
	protected String mail_id;
	protected long mobile_no;
	public Employe()
	{
		emp_name="name";
		emp_id=100001;
		address="not given"; 
		mail_id="not given";
		mobile_no=80007864;
	}
	public Employe(String name,long id,String add,String mail,long mobile)
	{
		emp_name=name;
		emp_id=id;
		address=add; 
		mail_id=mail;
		mobile_no=mobile;
	}
	
	public void printEmploye()
	{
		System.out.println("Name:"+emp_name);
		System.out.println("emp_id:"+emp_id);
		System.out.println("Address:"+address);
		System.out.println("EMail:"+mail_id);
		System.out.println("Mobile:"+mobile_no);

}
}
