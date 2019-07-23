package PAYROLL;
public class AssistantProfessor extends Employee 
{
		private double basicpay;
		public AssistantProfessor()
			{
			basicpay=0;
		}
		public AssistantProfessor(String n,int id,String ad,String mail,Long mob,int bp)
			{
			super(n,id,ad,mail,mob);
			basicpay=bp;
			}
		public void printAccount()
		{
			super.printAccount();
			System.out.println("BASIC PAY:"+basicpay);
			}
			public void printStatements()
			{
			double da;
			double hra;
			double pf;
			double staff;
			double gross;
			double net;
			printAccount();
			da=basicpay*0.97;
			hra=basicpay*0.1;
			pf=basicpay*0.12;
			staff=basicpay*0.001;
			gross=da+hra+pf+staff;
			net=gross-pf-staff;
			System.out.println("employee's DA:"+da);
			System.out.println("employee's HRA :"+hra);
			System.out.println("employee's PF :"+pf);
			System.out.println("employee's STAFF CLUBFUND :"+staff);
			System.out.println("employee's GROSS SALARY :"+gross);
			System.out.println("employee's NET SALARY:"+net);
			}


			
			
	}		
	
		