package PAYROLL;


public class salarycredited {
	public static void main(String[] args) {
		Employee emp;
		Programmer prog;
		AssistantProfessor ass1;
		AssociateProfessor ass2;
		Professor pro;
		
			emp=new Employee("employee",300001,"Chennai","account@gmail.com",9000000001l);
			prog=new Programmer("programmer",300001,"Chennai","account@gmail.com",9000000001l,10000);
			ass1=new AssistantProfessor("asspro",300001,"Chennai","account@gmail.com",9000000001l,10000);
			ass2=new AssociateProfessor("assopro",600001,"Chennai","account@gmail.com",7000000001l,20000);
			pro=new Professor("professor",800001,"Chennai","account@gmail.com",4000000001l,40000);
			emp.printAccount();	
			prog.calculation();
			ass1.calculation();
			ass2.calculation();
			pro.calculation();
			prog.printStatement();
			ass1.printStatement();
			ass2.printStatement();
			pro.printStatement();
	}
}