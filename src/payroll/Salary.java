package payroll;

import payroll.Employee;
import payroll.Programmer;
import payroll.AssisstantProfessor;
import payroll.Professor;
import payroll.AssociativeProfessor;

public class Salary {
	public static void main(String[] args) {
		Employee emp;
		Programmer prog;
		AssisstantProfessor ass1;
		AssociativeProfessor ass2;
		Professor pro;
		
			emp=new Employee("Raja",300001,"Chennai","account@gmail.com",9000000001l);

			prog=new Programmer("Kamal",600001,"Chennai","account@gmail.com",7000000001l, 100000);
			
			ass1=new AssisstantProfessor("Kala",800001,"Chennai","account@gmail.com",4000000001l,10000);
			
			ass2=new AssociativeProfessor("Sheeba",900001,"Tuticorin","abc@gmail.com",500000012l,10000);
			
			pro=new Professor("Mani",500001,"Madurai","mani@gmail.com",600000009l,10000);
			
					
			prog.Calculation();
			ass1.Calculation();
			ass2.Calculation();
			pro.Calculation();
			
			emp.printAccount();			
			prog.printAccount();
			ass1.printAccount();
			ass2.printAccount();
			pro.printAccount();
			
	}
}