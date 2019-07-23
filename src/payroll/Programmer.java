//created by Abhijith
//abhijithabhi524@gmail.com
package payroll;

public class Programmer extends Employee
{
	private double basicpay;
	public Programmer()
	{
		basicpay=0;
	}
	public Programmer(String n, long id,String add,String mail, long num, double BP)
		{
			super(n,id,add,mail,num);
			basicpay=BP;
		}
		public void printaccount()
		{
			super.printaccount();
			System.out.println("basicpay:"+basicpay);
		}
		
		public void printstatement()
		{
			double total;
			double total1;
			double total2;
			double total3;
			double gross;
			double net;
			printaccount();
			total=basicpay*0.77;
			total1=basicpay*0.1;
			total2=basicpay*0.12;
            total3=basicpay*0.001;
            gross=basicpay+total+total1+total2+total3;
            net=gross-total2-total3;
            System.out.printf("duty allowance(DA),%.2f\n",total);
            System.out.printf("HRA,%.2f\n",total1);
            System.out.printf("pf,%.2f\n",total2);
            System.out.printf("staff clubfund,%.2f\n",total3);
            System.out.printf("gross salary,%.2f\n",gross);
            System.out.printf("net salary,%.2f\n",net);
            System.out.println("\n");
		}
	}