package payroll;

public class Payslip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1;
		AssistantProffessor asp1;
		AssociateProfessor ap1;
		Professor p1;
		Programmer pro1;
			
			emp1=new Employee("Atchaya",21221,"Chennai","account@gmail.com",8000000000l);
			asp1=new AssistantProffessor("kaarthikeyan",21222,"Chennai","account@gmail.com",9000000000l,500000.00);
			ap1=new AssociateProfessor("Latchika",21223,"Chennai","account@gmail.com",7800000000l,20000.00);
			p1=new Professor("Raja",21224,"Chennai","account@gmail.com",9700000000l,30000.00);
			pro1=new Programmer("swetha",21225,"Chennai","account@gmail.com",7500000000l,40000.00);
			
			emp1.printEmployee();
			asp1.printEmployee();
			ap1.printEmployee();
			p1.printEmployee();
			pro1.printEmployee();
	}

}
