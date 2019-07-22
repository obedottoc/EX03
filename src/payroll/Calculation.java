package payroll;

public class Calculation {

	public static void main(String[] args) {
		Programmer pro;
		Assistantprofessor Asspro;
		Associateprofessor Assopro;
		Professor prof;
		
		pro=new Programmer("Raja",300001,"Chennai","account@gmail.com",9000000001l,6000);

		Asspro=new Assistantprofessor("Kamal",600001,"Chennai","account@gmail.com",7000000001l,7000);
		
		Assopro=new Associateprofessor("Kala",800001,"Chennai","account@gmail.com",7000000001l,7000);
		
		prof=new Professor("Sandhiya",800001,"Chennai","account@gmail.com",9000000001l,7000);
		
		pro.printAccount();			
		Asspro.printStatement();
		Assopro.printStatement();
		prof.printStatement();
      
	}
		
	

	}


