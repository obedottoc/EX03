package PAYROLL;

import java.util.Scanner;

public class PaySlip 
{
		public static void main(String[]args, int case1)
		{
				Programmer Prog;
				AssistantProfessor AssisProf;
				AssociateProfessor AssocProf;
				Professor Prof;
			
				int data;
				String data1;
				int data2;
				String data3;
				String data4;
				Long data5;
				Long data6;
				Scanner x=new Scanner(System.in);
				while(true)
				{
				System.out.println("1.PROGRAMMER");
				System.out.println("2.ASSISTANT PROFESSOR ");
				System.out.println("3.ASSOCIATE PROFESSOR");
				System.out.println("4.PROFESSOR");
				System.out.println("SELECT THE PROFESSION");
				
				}
					data=x.nextInt();
					switch(data)
					{
					
					case1:
						System.out.println("ENTER THE NAME");
						data1=x.next();
						System.out.println("ENTER THE ID");
						data2=x.nextInt();
						System.out.println("ENTER ADDRESS");
						data3=x.next();
						System.out.println("ENTER THE EMAIL-ID");
						data4=x.next();
						System.out.println("ENTER THE PHONE NO.");
						data5=(long) x.nextInt();
						System.out.println("ENTER THE BASIC PAY");
						data6=(long) x.nextInt();
						Prog=new Programmer(data1,data2,data3,data4,data5,data6);
						break;
						
						
						case2:
					
						System.out.println("ENTER THE NAME");
						data1=x.next();
						System.out.println("ENTER THE ID");
						data2=x.nextInt();
						System.out.println("ENTER ADDRESS");
						data3=x.next();
						System.out.println("ENTER THE EMAIL-ID");
						data4=x.next();
						System.out.println("ENTER THE PHONE NO.");
						data5=(long) x.nextInt();
						System.out.println("ENTER THE BASIC PAY");
						data6=x.nextLong();
						AssisProf =new AssistantProfessor(data1,data2,data3,data4,data5,data6);
						break;
						
						
						case3:
					
						System.out.println("ENTER THE NAME");
						data1=x.next();
						System.out.println("ENTER THE ID");
						data2=x.nextInt();
						System.out.println("ENTER ADDRESS");
						data3=x.next();
						System.out.println("ENTER THE EMAIL-ID");
						data4=x.next();
						System.out.println("ENTER THE PHONE NO.");
						data5=(long) x.nextInt();
						System.out.println("ENTER THE BASIC PAY");
						data6=x.nextLong();
						AssocProf=new AssociateProfessor(data1,data2,data3,data4,data5,data6);
						break;
						
						
						
						case4:
					
						System.out.println("ENTER THE NAME");
						data1=x.next();
						System.out.println("ENTER THE ID");
						data2=x.nextInt();
						System.out.println("ENTER ADDRESS");
						data3=x.next();
						System.out.println("ENTER THE EMAIL-ID");
						data4=x.next();
						System.out.println("ENTER THE PHONE NO.");
						data5=(long) x.nextInt();
						System.out.println("ENTER THE BASIC PAY");
						data6=x.nextLong();
						Prof=new Professor(data1,data2,data3,data4,data5,data6);
						break;
						
					}
				
				
		
		}
