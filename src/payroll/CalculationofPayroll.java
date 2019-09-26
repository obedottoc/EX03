/*created by kaarthikeyan
 * email:gk81299@gmail.com
 * 
 */
package payroll;
public class CalculationofPayroll {

	public static void main(String[] args) {
		{
			Employee emp1;
			Programmer prog1;
			AssistantProfessor astp1;
			AssociateProfessor asop1;
			Professor pro1;
			
			emp1=new Employee("Name",1001,"chennai","name@gmail.com",1111111111l);
			prog1=new Programmer("Sanjay",1002,"chennai","sanjay@gmail.com",2222222222l,10000);		
			astp1=new AssistantProfessor("AvinashRaja",1003,"chennai","avi@gmail.com",3333333333l,10000);
			asop1=new AssociateProfessor("Lokesh",1004,"chennai","loki@gmail.com",4444444444l,20000);
			pro1=new Professor("karthikeyan",1005,"chennai","kathik@gmail.com",5555555555l,40000);		
			emp1.printaccount();
			prog1.calculation();
			astp1.calculation();
			asop1.calculation();
			pro1.calculation();
			prog1.printstatement();
			astp1.printstatement();
			asop1.printstatement();
			pro1.printstatement();
		}

	}
}
