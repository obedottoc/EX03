/**JAVA program to calculate Salary 
 * author @AKHSHY_GANESH
 * reg no: 212217105006
 * mail ID: akhshyganeshb@gmail.com
 */
package Payroll;

public class Payslip {
	public static void main(String[]args) {
		Employee emp;
		AssistantProfessor ast;
		AssociateProfessor aso;
		Professor Prof;
		Programmer Prog;
		emp=new Employee("Akhshy",212217006,"chennai","ak@gmail.com",95245436);
		ast=new AssistantProfessor("faizul",212217016,"chennai","faizul@gmail.com",945744862,32000);
		aso=new AssociateProfessor("karan",212217024,"chennai","karan@gmail.com",946894135,36000);
		Prof=new Professor("bairavan",212217010,"chennai","mbairavan@gmail.com",923123457,38000);
		Prog=new Programmer("sanjai",212217019,"chennai","sanjai@gmail.com",974123431,42000);
		System.out.println("----------------------------------------------");
		emp.printEmployee();
		ast.calculation();
		ast.printEmployee();
		aso.calculation();
		aso.printEmployee();
		Prof.printEmployee();
		Prog.calculation();
		Prog.printEmployee();
	
		
		
	}
}
