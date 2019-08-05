/***created by G.nikhil
 * eee-a
 * 
 * 
 */



package payroll;

public class AssociateProfessor extends Employee {
	private double basicpay;
	 public AssociateProfessor()

	    {

	          basicpay=0;

	    }

	    public AssociateProfessor (String n, String ad,double id,double mo, String mail, double bp)

	    {

	          super (n,ad,id,mo,mail);

	           basicpay=bp;

	    }

	    public void printEmployee()

	    {            super.printAccount ();

	                 System.out.println("Basic pay:"+basicpay);

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

	    HRA=basicpay*0.1;

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
