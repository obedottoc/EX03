/****
 * Program for Assistant Professor
 * @author Rositha V
 *  npkr.nvrr@outlook.com
 */
package payroll;

public class AssistantProfessor extends Employee {
	private double basicpay;

	
	public AssistantProfessor()
	{
		basicpay=0;
	}
	public AssistantProfessor (String n, long id, String ad, String mail, long mo, double BP)
	{
		super (n,id,ad,mail,mo);
		basicpay=BP;
	}
	public void printAccount()
	{
		
		super.printAccount ();
		System.out.println("Basic pay:"+basicpay);
	}
	public void printStatement()
	{
    	double total;
    	double total1;
    	double total2;
    	double total3;
    	double gross;
    	double net;
    	printAccount();
    	
    	
    	total=basicpay*0.97;
    	total1=basicpay*0.1;
    	total2=basicpay*0.12;
    	total3=basicpay*0.001;
    	gross=total+total1+total2+total3;
    	net=gross-total2-total3;
    	System.out.printf("Duty Allowance (DA):%2f\n",total);
    	System.out.printf("HRA:%2f\n",total1);
    	System.out.printf("PF:%2f\n",total2);
    	System.out.printf("Staff club fund:%2f\n",total3);
    	System.out.printf("Staff salary is:%2f\n",gross);
    	System.out.printf("net salary is:%2f\n",net);
	
	}
}
