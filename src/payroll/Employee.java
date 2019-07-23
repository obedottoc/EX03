/******
 * @author vijaykumarkaranam100@gmail.com
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
 public Employee(String n,long id,String add,String mail,long num)
 {
	 emp_name=n;
	 emp_id=id;
	 address=add;
	 mail_id=mail;
	 mobile_no=num;
 }
 public void printaccount()
 {
	 System.out.println("Name of the employee:"+emp_name);
	 System.out.println("EmployeeID:"+emp_id);
	 System.out.println("Address:"+address);
	 System.out.println("Mail ID of the employee:"+mail_id);
	 System.out.println("Mobile number of the employee:"+mobile_no);
 }
 }