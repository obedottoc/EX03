/**JAVA program to calculate Salary 
 * author @AKHSHY_GANESH
 * reg no: 212217105006
 * mail ID: akhshyganeshb@gmail.com
 */
package Payroll;

public class Professor extends Employee{
	private double BasicPay;
	public Professor()
	{
		BasicPay=0;
	}
	public Professor(String n,long id,String adr,String mail,long no,double bp)
	{
		super(n,id,adr,mail,no);
		BasicPay=bp;
	}
	public void calculation()
	{double DA,HRA,PF,STAFFCLUBFUND,GROSSSALARY,NETSALARY,DEDUCTION;
			DA=0.97*BasicPay;
			HRA=0.1*BasicPay;
			PF=0.12*BasicPay;
			STAFFCLUBFUND=0.1*BasicPay;
			DEDUCTION=PF+STAFFCLUBFUND;
			GROSSSALARY=BasicPay+DA+HRA;
			NETSALARY=GROSSSALARY-DEDUCTION;
			System.out.println("BasicPay:"+BasicPay);
			System.out.println("GROSSSALARY:"+GROSSSALARY);
			System.out.println("NETSALARY:"+NETSALARY);
	}
}
