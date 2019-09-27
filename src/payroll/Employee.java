
/**
 * Application for area and length conversion
 * 
 * developed by
 * tamilfreakz002@gmail.com
 * saveetha engineering college 
 * tamilfreakz002@gmail.com
 * 
 */


package payroll;



public class Employee {

	 
		 protected  String Employeename;
		 protected long Employeeid;
		 protected String address;
		 protected String mailid;
		 protected long mobilenumber;


		public Employee() {
			Employeename = "noname";
			Employeeid = 2001;
			address = "notgiven";
			mailid = "notgiven";
			mobilenumber = 7654387638l;
		}
				public Employee(String name,long id,String add ,String mail,long number)
				{
					Employeename=name;
					Employeeid=id;
					address=add;
					mailid=mail;
					mobilenumber=number;
				}
						public void printEmployee()
					
						{
							System.out.println("Name:"+Employeename);
							System.out.println("id:"+Employeeid);
							System.out.println("address:"+address);
							System.out.println("mailid:"+mailid);
							System.out.println("number:"+mobilenumber);
							
							
							
						}
					
					
					
					
					
					
					
				}
			
			
		
			
			
	


