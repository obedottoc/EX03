package Payroll;

public class Calculation {
	public static void main(String[]args) {
		Programmer pro; 
		AssistantProfessor Assprof;
		AssociativeProfessor Asoprof;
		Professor prof;
		 
pro=new Programmer("Raja",200001,"chennai","abc@gmail.com",945234524,60000);	
Assprof=new AssistantProfessor("raghuvaran",6434953,"chennai","raghu@gmail.com",797973322,70000);
Asoprof=new AssociativeProfessor("gopal",6578678,"chennai","gopal@gmail.com",568968954,80000);
prof=new Professor("srikanth",7976973,"chennai","srikanth@gmail.com",786866307,100000);
pro.printStatement();
Assprof.printStatement();
Asoprof.printStatement();
prof.printStatement();		
		
             
	}
 
}
