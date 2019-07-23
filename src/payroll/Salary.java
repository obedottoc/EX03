/*developed by: Sanjai Kumar
 * gsanjaik@gmail.com
 */
package payroll;

public class Salary {

	public static void main(String[] args) {
		Employee emp;
		Programmer prog;
		AssociateProfessor aprof;
		AssistantProfessor asprof;
		Professor prof;
		emp=new Employee("A",800001,"Chennai","acc@gmail.com",800000001);
		prog=new Programmer("B",800002,"Chennai","acc@gmail.com",800000002,40000);
		aprof=new AssociateProfessor("C",800003,"Chennai","acc@gmail.com",800000003,50000);;
		asprof=new AssistantProfessor("D",800004,"Chennai","acc@gmail.com",800000004,60000);
		prof=new Professor("E",800005,"Chennai","acc@gmail.com",800000005,70000);
		emp.printEmployee();
		System.out.println("---------------------------------------");
		prog.calculation();
		prog.printProgrammer();
		aprof.calculation();
		aprof.printAssociateProfessor();
		asprof.calculation();
		asprof.printAssistantProfessor();
		prof.calculation();
		prof.printProfessor();	
	}

}
