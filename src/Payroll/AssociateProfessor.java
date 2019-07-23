/**JAVA program to calculate Salary 
 * author @AKHSHY_GANESH
 * reg no: 212217105006
 * mail ID: akhshyganeshb@gmail.com
 */
package Payroll;

public class AssociateProfessor extends Employee {
private double BasicPay;
public AssociateProfessor()

	{
		BasicPay=0;
	}
	public AssociateProfessor(String n,long id,String adr,String mail,long no,double bp)
	{
		super(n,id,adr,mail,no);
		BasicPay=bp;
	}
	public void printEmployee()
	{
		super.printEmployee();
		System.out.println("BAsicPAy:"+BasicPay);
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

