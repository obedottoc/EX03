/*payslip generator
 * suriyakumar
 * 212217105057
 * sksuri01@gmail.com
 * */package payroll;

public class PaySlip {

	public static void main(String[] args) {
		Employee emp;
		Programmer prog;
	    AssociateProfessor aspro;
	    AssistantProfessor asspro;
	    Professor pro;
		    emp= new Employee("yogi",5000001,"chennai","account@gmail.com",8000000001l);
			prog=new Programmer("Raja",300001,"Chennai","account@gmail.com",9000000001l,400000.0);

			aspro=new AssociateProfessor("Kamal",600001,"Chennai","account@gmail.com",7000000001l,500000.00);
			
			asspro=new AssistantProfessor("Kala",800001,"Chennai","account@gmail.com",4000000001l,400000.00);
			 
			pro=new Professor("suri",400001,"myd","account@gmail.com",8000000001l,300000.00);
			emp.printEmployee();
			pro.printProfessor();			
			aspro.printAssociateProfessor();
			asspro.printAssistantProfessor();
			prog.printProgrammer();
	}

}
