package payroll;

public class Calculation {

	public static void main(String[] args) {
		programmer pro;
		Assistantprofessor Asspro;
		Associateprofessor Asopro;
		Professor prof;
		
		pro=new programmer("Raja",300001,"Chennai","account@gmail.com",9000000001l,6000);
		
		Asspro=new Assistantprofessor("Kamal",600001,"Chennai","account@gmail.com",7000000001l,7000);
		
		Asopro=new Associateprofessor("Kala",500001,"Chennai","account@gmail.com",9000000001l,8000);
		
		prof=new Professor("Nithin",900001,"Chennai","account@gmail.com",9000000001l,10000);
		
		pro.printAccount();			
		Asspro.printStatement();
		Asopro.printStatement();
		prof.printStatement();
	}

}
