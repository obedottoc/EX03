package payroll;

public class employee {
     protected String emp_name;
     protected long emp_id;
     protected String address;
     protected String mail_id;
     protected String mobile_no;
     public employee()
     {
    	 emp_name="name";
    	 emp_id=123123;
    	 address="not given";
    	 mail_id="not given";
    	 mobile_no="9876543211";
     }

     public employee(String n,long id,String add,String mail,String num)
     {
    	 emp_name=n;
    	 emp_id=id;
    	 address=add;
    	 mail_id=mail;
    	 mobile_no=num;
     }
     public void printAccount()
     {
    	System.out.println("name of the employee:");
    	System.out.println("employee id:"+emp_id);
    	System.out.println("address:"+address);
    	System.out.println("mail_id of the employee:"+mail_id);
    	System.out.printf("mobile number of the employee:"+mobile_no);
    	 
    	 
	}


	}
