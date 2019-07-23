package payroll;

public class AssociateProfessor extends Employee {
	private double Basic_Pay;
	
	public AssociateProfessor()
	{
		Basic_Pay=0;
	}
	public AssociateProfessor(String name,long id,String add,String mail,long mobile,double bp)
	{
		super(name,id,add,mail,mobile);
		Basic_Pay=bp;
		
	}
	public void printEmployee()
	{
		super.printEmployee();
		double DA,HRA,PF,STAFFCLUBFUND,GROSSSALARY,NETSALARY,DEDUCTION;
		DA=0.97*Basic_Pay;
		HRA=0.1*Basic_Pay;
		PF=0.12*Basic_Pay;
		STAFFCLUBFUND=0.1*Basic_Pay;
		DEDUCTION=PF+STAFFCLUBFUND;
		GROSSSALARY=Basic_Pay+DA+HRA;
		NETSALARY=GROSSSALARY-DEDUCTION;
		System.out.println("Basic_Pay:"+Basic_Pay);
		System.out.println("GROSSSALARY:"+GROSSSALARY);
		System.out.println("NETSALARY:"+NETSALARY);
	}
}
		
		
	
	
	

