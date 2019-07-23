package payroll;


public class PaySlip {
	
	public static void main(String[] args) {
		Programer pro;
		AsisstantProfessor Asspro;
		AssociateProfessor Asopro;
		Professor prof;
		Programer pro1;
		
		pro=new Programer("Moni",300001,"Chennai","account@gmail.com",90000001,60000);

		Asspro=new AsisstantProfessor("Loki",600001,"Chennai","account@gmail.com",7000000001l,70000);
		
		Asopro=new AssociateProfessor("Rohitha",800001,"Chennai","account@gmail.com",40000001l,800001);
		
		prof=new Professor("kavi",900001,"Chennai","account@gmail.com",2000000001,100000);

		
		
		
		prof.printEmploye();			
		pro.printEmploye();
		Asspro.printEmploye();
		Asopro.printEmploye();
	}

}
