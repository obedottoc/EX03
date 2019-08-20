/***
 * created by Roopesh
 */



package payroll;

public class Professor extends Employee {
	private double basicpay;
	public Professor()
	{
		basicpay=0;
		
	}
	public Professor(String n, String ad,double id,double mo, String mail, double bp)
	{
		super(n,ad,id,mo,mail);
		basicpay=bp;
		
	}
	public void printEmployee()
	{
		super.printAccount();
		System.out.println("basicpay:"+basicpay);
		
		
	}
	public void printStatement()
	{
		 double DA;

		 double HRA;

		 double PF;

		 double stafffund;

		    double gross;

		    double net;
		    
		    printAccount();    
		   

		    DA=basicpay*0.97;

		    HRA=basicpay*0.10;

		    PF=basicpay*0.12;

		    stafffund=basicpay*0.001;

		    gross=DA+HRA+PF+stafffund;

		    net=gross-PF-stafffund;

		    System.out.printf("da:%2f\n",+DA);

		    System.out.printf("hra:%2f\n",+HRA);

		    System.out.printf("PF:%2f\n",+PF);

		    System.out.printf("Staff club fund:%2f\n",+stafffund);

		    System.out.printf("salary :%2f\n",+gross);

		    System.out.printf("net salary :%2f\n",+net);


	}
	

}
	
