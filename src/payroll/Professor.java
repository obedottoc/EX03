/*created by Abhijith.S
abhijithabhi524@gmail.com
*/

package payroll;

public class Professor extends Employee{
	private double basic_pay;
	public double da;
	public double hra;
	public double pf;
	public double staff_club;
	public double gross_salary;
	public double net_salary;
	
	public Professor()
	{	basic_pay=0;
	}
	public Professor(String n,long id,String ad,String mail,long mn, double bp)
	{	super(n,id,ad,mail,mn);
		basic_pay=bp;
	}
	public void Professor()
	{	super.printEmployee();
		System.out.println("Basic pay: "+basic_pay);
	}
	public void calculation()
	{	da=0.97*basic_pay;
		hra=0.1*basic_pay;
		pf=0.12*basic_pay;
		staff_club=0.001*basic_pay;
		gross_salary=da+hra+pf+staff_club+basic_pay;
		net_salary=gross_salary-(pf+ staff_club);
	}
	public void printProfessor()
	{	super.printEmployee();
		System.out.println("Employee basic salary: "+ basic_pay);
		System.out.println("Employee gross salary: "+ gross_salary);
		System.out.println("Employee net salary: "+ net_salary);
		System.out.println("---------------------------------------");
	}
}