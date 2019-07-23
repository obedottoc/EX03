package payroll;

public class Payslip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Programmer pro;
		AssistantProfessor asspro;
		AssociateProfessor aspro;
		Professor prof;
		pro=new Programmer("karan",400001,"Chennai","karo122@gmail.com",900000000l,60000);
		asspro=new AssistantProfessor("Atchu",590001,"Chennai","atchu31@gmail.com",8800000000l,50000);
		aspro=new AssociateProfessor("lokeswari",789302,"Chennai","lokeswari@gmail.com",7600000000l,40000);
		prof=new Professor("Akshy",763421,"Chennai","akshy001@gmail.com",9800000000l,10000);
		
		pro.printAccount();
		asspro.printstatement();
		aspro.printstatement();
		prof.printstatement();
	}
}
