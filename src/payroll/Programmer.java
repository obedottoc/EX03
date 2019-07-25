package payroll;

public class Programmer extends Employee{
	private double basic_pay;
	public double da;
	public double hra;
	public double pf;
	public double staff_club;
	public double gross_salary;
	public double net_salary;
	
	public Programmer()
	{
	 basic_pay=0;
	}
	
	public Programmer(String n,long id,String ad,String mail,long mo,double bp)
	{
		basic_pay=bp;
	}
	

	public void Employee()
	{
		super.printEmployee();
		System.out.println("enter the basic pay salary:"+basic_pay);
	}
	
	public void calculation()
	{
		double da,hra,pf,staff_club;
		da=0.97*basic_pay;
		hra=0.1*basic_pay;
		pf=1.2*basic_pay;
		staff_club=10*basic_pay;
		gross_salary=da+hra+pf+staff_club;
		net_salary=basic_pay-(pf+staff_club);

}
public void printProgrammer(){
	
	System.out.println("employee basic salary"+basic_pay);
	System.out.println("employee gross salary"+ gross_salary);
    System.out.println("employee net salary"+net_salary);
}

}

