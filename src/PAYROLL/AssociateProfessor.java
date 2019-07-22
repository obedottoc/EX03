package PAYROLL;

import java.util.Scanner;

public class AssociateProfessor extends Employee{
	
	private double basic_pay;
	public double da;
	public double hra;
	public double pf;
	public double staff_club;
	public double gross_salary;
	public double net_salary;
	
	
	public AssociateProfessor()
	{
	basic_pay=0;
	
	}
	
	public AssociateProfessor(String n,long id,String ad,String mail,long mo,long bp)
	{
		super(n,id,ad,mail,mo);
		basic_pay=bp;
	}
	public void read1()
	{	
	  Scanner sc=new Scanner(System.in); 
	  System.out.println("Enter the basic salary:");
      emp_name=sc.next();
	}
	

	public void calculation()
	{
		da=(97.0/100.0)*basic_pay;
		hra=(10.0/100.0)*basic_pay;
		pf=(12.0/100.0)*basic_pay;
		staff_club=(0.1/100.0)*basic_pay;
		gross_salary=da+hra+pf+staff_club;
		net_salary=gross_salary-(pf+staff_club);
	}
	
	
	
	
	public void printStatement()
	{
		super.printAccount();
		System.out.println("Employee Basic salary :"+basic_pay);
		System.out.println("Employee Gross salary :"+gross_salary);
		System.out.println("Employee Net salary :"+net_salary);
		
		

	}
}

	
	