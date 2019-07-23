//program to represent payroll
//created by Abhijith
//abhijithabhi524@gmail.com
package payroll;

public class Employee {
          protected String employee_name;
          protected long employee_id;
          protected String address;
          protected long mobile_no;
          protected String mail_id;
          public Employee()
          {
        	  employee_name="karthi";
        	  employee_id=1001;
        	  address="kknagar";
        	  mail_id="karthi@gmail.com";
        	  mobile_no=8000000;
        	  
          }
          public Employee(String n,long id,String ad,String mail,long mo)
          {
        	  employee_name=n;
        	  employee_id=id;
        	  address=ad;
        	  mail_id=mail;
        	  mobile_no=mo;
          }
          public void printaccount()
          {
        	  System.out.println("name:"+employee_name);
        	  System.out.println("Account id:"+employee_id);
        	  System.out.println("address:"+address);
        	  System.out.println("email:"+mail_id);
        	  System.out.println("mobile:"+mobile_no);
        	  
          }
          
}
