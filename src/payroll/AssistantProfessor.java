/***
 * program to represent BP of the program
 * @author M.Upendra
 * upendravarma1234@gmail.com
 */



package payroll;

public class AssistantProfessor extends Employee{
	private double basicpay;
public  AssistantProfessor ()
{
	basicpay=0;
	}
public  AssistantProfessor (String n,long id,String add,String mail,long num,double BP)
{
	super(n,id,add,mail,num);
	basicpay=BP;
}
public void printaccount()
{
	super.printAccount();
System.out.println("BasicPay:"+basicpay);	

}
public void Printstatement()
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
	total3=basicpay*0.01;
	gross=basicpay+total+total1+total2+total3;
	net=gross-total3-total2;
	System.out.printf("duty allowance(DA):%.2f\n",total);
	System.out.printf("HRA:%.2f\n",total1);
	System.out.printf("pf:%.2f\n",total2);
	System.out.printf("staff club fund:%.2f\n",total3);
	System.out.printf("gross salary:%.2f\n",gross);
	System.out.printf("net salary:%.2f\n",net);
}
}
