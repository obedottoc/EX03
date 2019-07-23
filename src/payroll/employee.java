package payroll;

public class employee {
		protected String employee_name;
		protected long employee_id;
		protected String address; 
		protected String mail_id;
		protected long mobile_no;
		
		public employee()
		{
			employee_name="noname";
			employee_id=100001;
			address="not given"; 
			mail_id="not given";
			mobile_no=80000001;
		}
		
		public employee(String n,long id,String ad,String mail,long mo)
		{
			employee_name=n;
			employee_id=id;
			address=ad; 
			mail_id=mail;
			mobile_no=mo;
		}
		
		public void printAccount()
		{
			System.out.println("Name:"+employee_name);
			System.out.println("employee ID:"+employee_id);
			System.out.println("Address:"+address);
			System.out.println("EMail:"+mail_id);
			System.out.println("Mobile:"+mobile_no);
		}
		
	}



