package PAYROLL;

public class AssistantProfessor extends Employee {
	
	private double basic_pay;
	public  double da;
	public  double hra;
	public  double pf;
	public  double staff_club;
	public  double gross_salary;
	public  double net_salary;
	
	
	public  AssistantProfessor()
	{
	basic_pay=0;
	
	}
	
	public  AssistantProfessor(String n,long id,String ad,String mail,long mo,long bp)
	{
		super(n,id,ad,mail,mo);
		basic_pay=bp;
	}
	public void print()
	{ 
		System.out.println("basic amount credited:"+basic_pay);
		
	}

	public  void  calculation()
	{
		da=97.0/100*basic_pay;
		//return da;
		hra=10.0/100*basic_pay;
		//return hra;
		pf=12.0/100*basic_pay;
		//return pf;
		staff_club=0.1/100*basic_pay;
		//return staff_club;
		gross_salary=da+hra+pf+staff_club;
		//return gross_salary;
		net_salary=gross_salary-(pf+staff_club);
		//return net_salary;
	}
	
	
	
	
	
	
	public void printStatement()
	{
		super.printAccount();
		System.out.println("Employee Basic salary :"+basic_pay);
		System.out.println("Employee Gross salary :"+gross_salary);
		System.out.println("Employee Net salary :"+net_salary);
		
		

	}
}

	
	

