package payroll;

public class Professor extends Employee {
	private double basic_pay;
	private double da;
	private double hra;
	private double pf;
	private double staff_club;
	private double gross_salary;
	private double net_salary;
	
	
	public Professor()
	{
		basic_pay=0;
		
	}
	
	public Professor(String n,long id,String ad,String mail,long mo,double bp)
	{
		super(n,id,ad,mail,mo);
		basic_pay=bp;
		
	}
	
	
	
	public void Calculation()
	{
		da=(97.0/100)*basic_pay;
		hra=(10.0/100)*basic_pay;
		pf=(12.0/100)*basic_pay;
		staff_club=(0.001)*basic_pay;
		gross_salary=da+hra+basic_pay;
		net_salary=(gross_salary)-(pf+staff_club);
	}
	
	public void printAccount()
	{
		super.printAccount();
		System.out.println("Basic_Pay:"+basic_pay);
		System.out.println("Gross_salary:"+gross_salary);	
		System.out.println("Net_salary:"+net_salary);
	}
}
