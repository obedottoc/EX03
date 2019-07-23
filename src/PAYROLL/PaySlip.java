package PAYROLL;
public class PaySlip 
{
		public static void main(String[]args)
		{
				Programmer Prog;
				AssistantProfessor AssisProf;
				AssociateProfessor AssocProf;
				Professor Prof;
				Prog=new Programmer("hari",100000,"chennai","abc@gmail.com",(long) 200000,15000);
                AssisProf=new AssistantProfessor("xxx",200000,"coimbatore","def@gmail.com",(long) 300000,25000);
                AssocProf=new AssociateProfessor("yyy",300000,"kaniyakumari","ghi@gmail.com",(long) 400000,35000);
                Prof=new Professor("zzz",400000,"erode","jkl@gmail.com",(long) 500000,45000);
                Prog.printStatements();
                AssisProf.printStatements();
                AssocProf.printStatements();
                Prof.printStatements();
		}
                
                
                
		

}