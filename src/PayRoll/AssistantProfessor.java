/****
 * Devloped by Mari Bhagavathi.T
 * mari36mars@gmail.com
 */






package PayRoll;

public class AssistantProfessor extends Employee{
	private double BasicPay;
	
public AssistantProfessor()
{
	BasicPay=0;
	
}
public AssistantProfessor(String n,long id,String ad,String mail,long mo,double bp)
{
	super(n,id,ad,mail,mo);
	BasicPay=bp;

}
public void printEmployee()
{
	super.printEmployee();
	System.out.println("Basic Pay:"+BasicPay);
	

}
public void printStatement()
{
	double DA,HRA,PF,STAFFCLUBFUND,GROSSSALARY,NETSALARY,DEDUCTION;
	DA=0.97*BasicPay;
	HRA=0.1*BasicPay;
	PF=0.12*BasicPay;
	STAFFCLUBFUND=0.1*BasicPay;
	DEDUCTION=PF+STAFFCLUBFUND;
	GROSSSALARY=BasicPay+DA+HRA;
	NETSALARY=GROSSSALARY-DEDUCTION;
	System.out.println("Basic_Pay:"+BasicPay);
	System.out.println("GROSSSALARY:"+GROSSSALARY);
	System.out.println("NETSALARY:"+NETSALARY);
	
}
}
