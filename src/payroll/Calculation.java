package payroll;

public class Calculation {

	public static void main(String[] args) {
		Employee emp;
	    Programmer pro;
		AssistantProfessor Asspro;
		AssociateProfessor Asopro;
		Professor prof;
		    emp=new Employee("karthi",1001,"kknagar","karthi@gmail.com",800000);
			pro=new Programmer("Sanjai",17003197,"saidapet","sanjai@gmail.com",900000000,60000);
            Asspro=new AssistantProfessor("Akshy",17003212,"Viru","akshy@gmail.com",70000,70000);
		    Asopro=new AssociateProfessor("Faizul",17003187,"karur","faizul@gmail.com",40000,80000);
			prof=new Professor("Abhi",17003282,"chennai","abhijith@gmail.com",20000,100000);
			emp.printaccount();
			pro.printaccount();	
			Asspro.printStatement();
			Asopro.printStatement();
			prof.printStatement();
			}

}
