/**
 * Ahamed meeran
 * ahamedmeeran23@gmail.com
 * EX02
 */
package payroll;
   public class Employee { 
	   protected String Emp_name;
	   protected long Emp_id;
	   protected String address;
	   protected String mail_id;
	   protected long mobile_no;
	   
	   public Employee()
	   {
		   Emp_name="ahamed meeran";
		   Emp_id=10001;
		   address="not given";
		   mail_id="not given";
		   mobile_no=9843251040l;
	   }
	   public Employee(String n,long id,String add,String mail,long num)
	   {
		   Emp_name=n;
		   Emp_id=id;
		   address=add;
		   mail_id=mail;
		   mobile_no=num;
	   }
	   public void printEmployee()
	   {
		   System.out.println("name:"+Emp_name);
		   System.out.println("Emp_id;"+Emp_id);
		   System.out.println("address;"+address);
		   System.out.println("mail_id;"+mail_id);
		   System.out.println("mobile_no;"+mobile_no);
	   }
	
	}
   
   
		   
		   
		   
	
	   
		   
		   
		   		



