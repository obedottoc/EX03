package Payment;

import Payment.Employee;
import Payment.Programmer;
import Payment.AssistantProfessor;
import Payment.AssociateProfessor;
import Payment.Professor;
public class Calculation {
	public static void main(String[] args) {
		Employee emp1;
		Programmer pro1;
		AssistantProfessor asp1;
		AssociateProfessor ap1;
		Professor p1;
		
		emp1=new Employee("calvin",10012,"chennai","calvin12@gmail",9841127486l);
		pro1=new Programmer("divakar",10008,"chennai","diva08@gmail",9841127487l,5000.00);
		asp1=new AssistantProfessor("shelton",10020,"chennai","shel20@gmail",9841127488l,5500.00);
		ap1=new AssociateProfessor("charan",10018,"chennai","charan18@gmail",9841127489l,6000.00);
		p1=new Professor("kishore",10023,"chennai","kishore23@gmail",9841127480l,6500.00);
		
		emp1.printEmployee();
		pro1.printEmployee();
		asp1.printEmployee();
		ap1.printEmployee();
		p1.printEmployee();
	}

}
