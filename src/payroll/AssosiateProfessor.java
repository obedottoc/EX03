package payroll;

public class AssosiateProfessor extends Employee{
	private double basicpay;
	public AssosiateProfessor()
	{
		basicpay=0;
	}
	public AssosiateProfessor(String n,long id,String add,String mail,long mo,double BP)
		{
			super(n,id,add,mail,mo);
			basicpay=BP;
		}
		public void AssosiateProfessor()
		{
			super.printaccount();
			System.out.println("basicpay:"+basicpay);
		}
		public void printaccount()
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
			System.out.printf("duty allowance(DA),%2f\n",total);
			System.out.printf("HRA,%2f\n",total1);
			System.out.printf("pf,%2f\n",total2);
			System.out.printf("staff clubfund,%2f\n",total3);
			System.out.printf("gross salary,%2f\n",gross);
			System.out.printf("net salary,%2f\n",net);
	}

}
