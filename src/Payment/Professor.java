package Payment;

public class Professor extends Employee {
	private double basic_pay;
	public Professor()
		{
			basic_pay=0;
		}
	public Professor(String n,long id,String ad,String mail,long num,double bp)
	{
		super(n,id,ad,mail,num);
		basic_pay=bp;
	}
	public void printAssociateProfessor()
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
		System.out.println("BASIC_PAY:"+basic_pay);
		System.out.println("GROSSSALARY:"+grosssalary);
		System.out.println("NETSALARY:"+netsalary);
	}
	}


