package payroll;

public class Paymentslip {
	public static void main(String[]args)
	{
		Employee emp;
		Programmer prog;
		Assistantprofessor ass1;
		Associateprofessor ass2;
		Professor pro;
		
		emp=new Employee("employee",300001,"chennai","account@gmail.com",9000000001l);
		prog=new Programmer("Programmer",300001,"chennai","account@gmail.com",9000000001l,10000);		
		ass1=new Assistantprofessor("asspro",300001,"chennai","account@gmail.com",9000000001l,10000);
		ass2=new Associateprofessor("asspro",600001,"chennai","account@gmail.com",7000000001l,20000);
		pro=new Professor("Professor",800001,"chennai","account@gmail.com",4000000001l,40000);		
		emp.printaccount();
		prog.calculation();
		ass1.calculation();
		ass2.calculation();
		pro.calculation();
		prog.printstatement();
		ass1.printstatement();
		ass2.printstatement();
		pro.printstatement();
	}

}
