/*
 * Program to represent payroll
 * By Faizul
 * faizulsmart10@gmail.com
*/

package payroll;

public class Calculation {
      public static void main(String[]args) {
    	  Employee emp;
    	  Programer pro;
    	  AssistantProfessor Asspro;
    	  AssociateProfessor Asopro;
    	  Professor prof;
    	  
    	  emp=new Employee("Hariharan",5022,"Chennai","harirahul@gmail.com",87346);
    	  pro=new Programer("Faizul",5016,"Karur","faizulsmart@gmail.com",75167,50000);
    	  Asspro=new AssistantProfessor("Akhshy",5006,"Chennai","akhshyganeshb@gmail.com",91886,55000);
    	  Asopro=new AssociateProfessor("Sanjai",5019,"Chennai","gsanjaikumar@gmail.com",19764,60000);
		  prof=new Professor("Abhijith",5002,"Chennai","abhijithabhi@gmail.com",54533,65000);
		  emp.printAccount();
		  pro.printAccount();	
		  Asspro.printStatement();
		  Asopro.printStatement();
		  prof.printStatement();
		

    	  
      }
}
