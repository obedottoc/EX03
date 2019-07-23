package PAYROLL;

public class Employee 
{
		protected String emp_name;
		protected int emp_id;
		protected String address;
		protected String mail_id;
		protected Long mobile_no;
			public Employee()
			{
				emp_name="abc";
				emp_id=100001;
				address="no address";
				mail_id="unavailable";
				mobile_no=9000000000l;
			}
			public Employee(String n,int id,String ad,String mail,Long mob)
			
			{
				emp_name=n;
				emp_id=id;
				address=ad;
				mail_id=mail;
				mobile_no=mob;
			}
			public void printAccount()
			{
			System.out.println("\nemployee's NAME :"+emp_name);
			System.out.println("employee's ID :"+emp_id);
			System.out.println("employee's ADDRESS :"+address);
			System.out.println("employee's E-MAIL ID :"+mail_id);
			System.out.println("employee's MOBILE NO. :"+mobile_no);
			}
}

				
				
				
				
				
				
				
				
			


