package payroll;

public class Calculation1 {
	public static void main(String[]args) {
		Programmer pro;
		AssitantProfessor Asspro;
		AssosiateProfessor Ascpro;
		Professor Prof;
			pro=new Programmer("bairavn",5010,"vedaranyam","bairavan@gmail.com",880000032,46466);
			Asspro=new AssitantProfessor("abhi",5002,"tnagar","abhijith@gmail.com",900000007,12345);
			Asscpro=new Assosiateprofessor("faizul",5016,"thiruvallur","faizulahamed@gmail.com",65000008,76543);
			Prof=new Professor("akhshy",5006,"kknagar","akhshyganesh@gmail.com",900000004,54545);
			Emp.printaccount();
			pro.printaccount();
			Asspro.printStatement();
			Ascpro.printStatement();
			Prof.printStatement();
	}
}
