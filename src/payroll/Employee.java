/***
 * lokesh
 
 * lokeshwarn2000@gmail.com
 * exp3
 */
package payroll;

public class Employee {
	protected String Emp_names;
	protected long Emp_id;
	protected String address;
	protected String mail_id;
	protected long mobile_no;
	
	public Employee()
	{
		Emp_names ="avinash";
		Emp_id =1500125;
		address ="not given";
		mail_id="not given";
		mobile_no =9445223556l;
	}
	
	public Employee(String n,long id,String ad,String mail,long num)
	{
		Emp_names =n;
		Emp_id =id;
		address=ad;
		mail_id=mail;
		mobile_no=num;
	}
	
	public void printEmployee()	
	{
     System.out.println("name:"+Emp_names);
     System.out.println("id:"+Emp_id);
     System.out.println("address:"+address);
     System.out.println("email:"+mail_id);
     System.out.println("mobile:"+mobile_no);
	} 
   
    
	
}