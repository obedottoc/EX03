package payroll;

public class Professor extends employee {
	private double basicpay;
	public Professor()
	{
		 basicpay=0;
	}
	public Professor(String n,long id,String add,String mail,long num,double BP)
	{
		super(n,id,add,mail,num);
		basicpay=BP;
	}
	public void printemployee()
	{
		super.printAccount();
			System.out.println("basicpay:"+basicpay);
	}
	public void printstatement()
	{
		double total;
		double total1;
		double total2;
		double total3;
		double total4;
		double gross;
		double net;
		printAccount();
		total=basicpay*0.77;
		total1=basicpay*0.1;
		total2=basicpay*0.01;
		total3=basicpay*0.001;
	gross=total+total1+total2+total3;
		gross=total+total1+total2+total3;
		net=gross-total2-total3;
		System.out.printf("duty allowance (DA):%2fln",total);
		System.out.printf("HRA :%2fln",total1);
		System.out.printf("PF:%2fln",total2);
		System.out.printf("staff club fund:%2fln",total3);
		System.out.printf("staff salary is:%2fln",gross);
		System.out.printf("net salary is:%2fln",net);
		}
	}




