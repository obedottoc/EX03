package payroll;

import payroll.AssistantProffessor;
import payroll.AssociateProffessor;
import payroll.Employee;
import payroll.Proffessor;
import payroll.Programmer;
public class Payslip {

	public static void main(String[] args) {
		Employee emp1;
		AssistantProffessor asp1;
		AssociateProffessor ap1;
		Proffessor p1;
		Programmer pro1;
		
			emp1=new Employee("Raja",300001,"Chennai","account@gmail.com",90000000001l);

			asp1=new AssistantProffessor("Ammu",600001,"Chennai","account@gmail.com",7000000001l, 500000.00);
			
			ap1=new AssociateProffessor("Maari",800001,"Chennai","account@gmail.com",4000000001l,20000.00);
			
			p1=new Proffessor("Rositha",800001,"Chennai","account@gmail.com",4000000001l,30000.00);
			
			pro1=new Programmer("Yogee",800001,"Chennai","account@gmail.com",4000000001l,40000.00);
			
			emp1.printEmployee();			
			asp1.printEmployee();
			ap1.printEmployee();
			p1.printEmployee();
			pro1.printEmployee();
	}

}
