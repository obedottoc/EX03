/*****
 * @author nikhilkumarreddybtech@gmail.com
 * to create a Employee payroll
 */
package payroll;


public class Employee {
     

  protected String emp_name;
  protected long emp_id;
  protected String address;
  protected String mail_id;
  protected long mobile_no;
  
 public Employee() 
 {
	emp_name="name";
	emp_id=123123;
	address="not given";
	mail_id="not given";
	mobile_no=91637543;
 }			
 public Employee (String n,long id,String add,String mail,long num)			
 {			
	emp_name=n;
	emp_id=id;
	address=add;
	mail_id=mail;
	mobile_no=num;
 }	
public void printaccount()
{
	System.out.println("name of the employee:"+emp_name);
	System.out.println("employee id:"+emp_id);
	System.out.println("address:"+address);
	System.out.println("mail id if the employee:"+mail_id);
	System.out.println("mobile number of employee:"+mobile_no);
}
}	
					
 