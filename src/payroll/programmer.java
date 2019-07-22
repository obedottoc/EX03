/*********
 * Program to represent BP of the program
 * Developed by
 * R.Neha
 * rasapallenehareddy@gmail.com
 */
package payroll;

public class programmer extends Employee {
	private double basicpay;
	public programmer()
	{
		basicpay=0;
	}
public programmer(String n,long id,String add,String mail,long num,double BP)
{
	super(n,id,add,mail,num);
	basicpay=BP;
}
public void printAccount()
{
	super.printAccount();
	System.out.println("Basic pay;"+basicpay);
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
	gross=basicpay+total+total1+total2+total3;
	net=gross-total2-total3;
	System.out.printf("duty allowance(DA),%.2f\n",total);
	System.out.printf("HRA,%.2f\n",total1);
	System.out.printf("pf,%.2f\n",total2);
	System.out.printf("staff club fund,%.2f\n",total3);
	System.out.printf("gross salary,%.2f\n",gross);
	System.out.printf("net salary,%.2f\n",net);
	
}
		
}
