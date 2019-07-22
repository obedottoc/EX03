package PayRoll;

public class Payslip {
	public static void main(String[] args) {
		Employee emp;
		AssistantProfessor ast;
		AssociateProfessor aso;
		Professor prof;
		Programmer prom;
		
		emp=new Employee("Mari",212217136,"Chennai","account@gmail.com",97512690l);
		
		ast=new AssistantProfessor("Raja",212217148,"Chennai","account@gmail.com",97512664l,500000.00);
		
		aso=new AssociateProfessor("Mohan",212217138,"Chennai","account@gmail.com",97512985l,400000.00);
		
		prof=new Professor("Yogi",212217161,"Chennai","account@gmail.com",97517990l,300000.00);
		
		prom=new Programmer("Nithish",212217141,"Chennai","account@gmail.com",97512780l,200000.00);
		
		emp.printEmployee();
		ast.printStatement();
		aso.printStatement();
		prof.printEmployee();
		prom.printStatement();		
		
		
		
	}
}
