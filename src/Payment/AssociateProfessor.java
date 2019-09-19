 /****
 *Developed By Avinash Raja
 *Reg n0:212217105009
 *exp n0:3
 *EEE-A
 */
package Payment;

public class AssociateProfessor extends Employee {
	private double basic_pay;
	public AssociateProfessor()
		{
			basic_pay=0;
		}
	public AssociateProfessor(String n,long id,String ad,String mail,long num,double bp)
	{
		super(n,id,ad,mail,num);
		basic_pay=bp;
	}
	public void printAccount()
	{
		System.out.println("BASIC_PAY:"+basic_pay);
	}
	public void printEmployee()
	{
		super.printEmployee();
		double da,hra,pf,clubfund,grosssalary,netsalary,deduction;
		da=0.97*basic_pay;
		hra=0.1*basic_pay;
		pf=0.12*basic_pay;
		clubfund=0.1*basic_pay;
		deduction=pf+clubfund;
		grosssalary=basic_pay+da+hra;
		netsalary=grosssalary+deduction;
		System.out.println("DA:"+da);
		System.out.println("HRA:"+hra);
		System.out.println("PF:"+pf);
		System.out.println("CLUB FUND:"+clubfund);
		System.out.println("DEDUCTION:"+deduction);
		System.out.println("GROSSSALARY:"+grosssalary);
		System.out.println("NETSALARY:"+netsalary);
	}
	}


