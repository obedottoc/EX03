package payroll;

import payroll.Assistantprofessor;
import payroll.Associateprofessor;
import payroll.Employee;
import payroll.Professor;
import payroll.Programmer;
	public class Calculation 
	{
		public static void main(String[]args) {
			Employee emp1;
			Assistantprofessor asp1;
			Associateprofessor ap1;
			Professor p1;
			Programmer pro1;
		emp1=new Employee("lokesh",4001,"chennai","lk@gmail.com",924518268936l);
		asp1=new Assistantprofessor("avinash",4553,"chennai","avi@gmail.com",995426131469l,5000.00);
		ap1=new Associateprofessor("gk",5004,"chennai","gk@gmail.com",98754623122l,7000.00);
		p1=new Professor("agnal",7893,"chennai","ag@gmail.com",984512847l,9000.00);
		pro1=new Programmer("ak",5542,"chennai","ak@gmail.com",664452221l,10000.00);
		emp1.printEmployee();
		asp1.printEmployee();
		ap1.printEmployee();
		p1.printEmployee();
		pro1.printEmployee();
		
		}
	}
	