package payroll;

public class PaySlips {
	public static void main(String[] args)
	{
		Employee emp;
		Programmer pro;
		AssistantProfessor AssistProf;
		AssociateProfessor AssocProf;
		Professor prof;
		
		emp=new Employee("a","chennai",100001,974643,"a@gmail.com");
		pro=new Programmer("g","chennai",100002,547955,"b@gmail.com",80000);
		AssistProf=new AssistantProfessor("c","chenani",100003,879457,"c@gmail.com",50000);
		AssocProf=new AssociateProfessor("d","chennai",100004,798464,"d@gmail.com",60000);
		prof=new Professor("e","chennai",10005,879544,"e@gmail.com",70000);
		
		emp.printAccount();
		prof.printStatement();
		pro.printStatement();
		AssistProf.printStatement();
		AssocProf.printStatement();
						
	}

}
