package payroll;

public class AssisstantProfessor extends Employee {
	private double basic_pay;
	private double da;
	private double hra;
	private double pf;
	private double staff_club;
	private double gross_salary;
	private double net_salary;
	
	
	public AssisstantProfessor()
	{
		basic_pay=0;

	}
	
	public AssisstantProfessor(String n,long id,String ad,String mail,long mo,double bp)
	{
		super(n,id,ad,mail,mo);
		basic_pay=bp;
		
	}
	
	
	public void Calculation()
	{
		da=(97/100)*basic_pay;
		hra=(10/100)*basic_pay;
		pf=(12/100)*basic_pay;
		staff_club=(0.1/100)*basic_pay;
		gross_salary=da+hra+pf+staff_club;
		net_salary=basic_pay-(pf+gross_salary);
	}
	
	public void printAccount()
	{
		super.printAccount();
		System.out.println("Basic_Pay:"+basic_pay);
		System.out.println("Gross_salary:"+gross_salary);	
		System.out.println("Net_salary:"+net_salary);
	}
	
}
